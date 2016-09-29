package net.andreu;

public class Vaca {
	
	String nom;
	int pes;
	int litres;
	
	public Vaca(String nom, int pes, int liatres) {
		super();
		this.nom = nom;
		this.pes = pes;
		this.litres = liatres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPes() {
		return pes;
	}

	public void setPes(int pes) {
		this.pes = pes;
	}

	public int getLitres() {
		return litres;
	}

	public void setLiatres(int liatres) {
		this.litres = liatres;
	}
	
	@Override
	public String toString() {
		return nom + "(" +litres + ")";
	}
}
