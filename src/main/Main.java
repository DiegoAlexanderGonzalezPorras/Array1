package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/*
	Diego Gonzalez Porras
	MD5 Hash => 717849f2ea20194146d2ed2a8a9e3df7
	S => 7
	*/
	
	public static void main(String[] args) {
		final int S = 7;
		Integer[] array = {9, 1, 2, 3, 4, 5, 6, 7, 8, 100, 150};
		List<Integer> lista = Arrays.asList(array);
		
		O(lista, S);
	}

	private static void O(List<Integer> lista, int S) {
		List<Integer> NuevaLista = new ArrayList<>();
		
		for (Integer numero : lista) {
			if (numero <= 100) {
				boolean bandera = false;
				int nuevonumero = 0;
				int centena;
				int decena;
				int unidad;
				
				if ((centena = numero / 100) < S) {
					nuevonumero = centena;
					bandera = true;
				}
					
				if ((decena = (numero - (centena * 100)) / 10) < S) {
					nuevonumero = (nuevonumero * 10) + decena;
					bandera = true;
				}
				
				if ((unidad = numero - (centena * 100) - (decena * 10)) < S) {
					nuevonumero = (nuevonumero * 10) + unidad;
					bandera = true;
				}
				
				if (bandera)
					NuevaLista.add(0, nuevonumero);
			}
		}
		
		System.out.println(NuevaLista);
	}
}
