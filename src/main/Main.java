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
				System.out.println(numero / 100);
				if (numero / 100 == 1) 
				{}
				
				NuevaLista.add(0, numero);
			}
		}
		
		System.out.println(NuevaLista);
	}
}
