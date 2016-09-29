package net.andreu;

import java.util.ArrayList;
import java.util.List;

public class Camio {
	
	private int pesMax;
	private List<Vaca> vaques = new ArrayList<>();
	
	public Camio(int pesMax) {
		super();
		this.pesMax = pesMax;
	}
	
	public boolean posarVaca(Vaca vaca){
		if(pesVaques() + vaca.getPes() > pesMax){
			return false;
		}
		vaques.add(vaca);
		return true;
	}

	private int pesVaques() {
		int pes = 0;
		for(Vaca vaca: vaques){
			pes += vaca.getPes();
		}
		return pes;
	}
	
	public void treureVaques(){
		vaques.clear();
	}
	
	public int lletVaques(){
		int llet = 0;
		for(Vaca vaca: vaques){
			llet += vaca.getLitres();
		}
		return llet;
	}

	@Override
	public String toString() {
		return vaques.toString();
	}
	
}
