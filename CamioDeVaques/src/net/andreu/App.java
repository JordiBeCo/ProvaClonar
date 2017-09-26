package net.andreu;

import java.util.Arrays;
import java.util.List;

public class App {

	private static final int PesCamio = 700;

	public static void main(String[] args) {
		
		List<Vaca> v = Arrays.asList( 
				new Vaca("Maria", 360, 40),
				new Vaca("Pepa", 250, 35),
				new Vaca("Flor", 400, 35),
				new Vaca("To�i", 180, 28),
				new Vaca("Conxita", 50, 12),
				new Vaca("Blanca", 90, 13)
		);
		
		System.out.println(v);
		Pastor pastor = new Pastor();
		pastor.ompleCamio(new Camio(PesCamio), v);
		System.out.println(pastor.getResultat());
	}

}
//afegeixo un comentari