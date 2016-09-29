package net.andreu;

import java.util.List;

public class Pastor {
	
	private String resultat;
	
	public void ompleCamio(Camio camio, List<Vaca> vaques){
		int MaxLitres = 0;
		resultat = "";
		
		for(int i=0; i<vaques.size(); i++){
			int litres = calculaResultat(camio,vaques.subList(i, vaques.size()));
			if(litres > MaxLitres){
				MaxLitres = litres;
				resultat = camio.toString();
			}
			camio.treureVaques();
		}
	}
	
	private int calculaResultat(Camio camio, List<Vaca> subList) {
		
		for(Vaca vaca: subList){
			camio.posarVaca(vaca);
			if(camio.posarVaca(vaca)==false){
				break;
			}
		}
		
		return camio.lletVaques();
	}

	public String getResultat(){
		return resultat;
	}

}
