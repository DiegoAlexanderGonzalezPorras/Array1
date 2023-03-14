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
		Integer[] array = {60, 6, 5, 4, 3, 2, 7, 7, 29, 1};
		List<Integer> lista = Arrays.asList(array);
		
		O(lista, S);
	}

	private static void O(List<Integer> lista, int S) {
		List<Integer> NuevaLista = new ArrayList<>();
		String str_numero;
		Boolean bandera;
		int nuevonumero;
		int digito;
		
		for (Integer numero : lista) {
			if (numero <= 100) {
				str_numero = String.valueOf(numero);
				bandera = false;
				nuevonumero = 0;
				
				for (char digito_char : str_numero.toCharArray()) {
					if ((digito = Character.getNumericValue(digito_char)) < S) {
						nuevonumero = nuevonumero * 10 + digito;
						bandera = true;
					}
				}
				
				if (bandera)
					NuevaLista.add(0, nuevonumero);
			}
		}
		
		System.out.println(NuevaLista);
	}
}
