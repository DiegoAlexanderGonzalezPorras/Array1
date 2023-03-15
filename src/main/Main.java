package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/*
	 * Diego Gonzalez Porras 
	 * MD5 Hash => 717849f2ea20194146d2ed2a8a9e3df7 
	 * S => 7
	 */

	public static void main(String[] args) {
		final int S = 7;
		Integer[] array1 = { 70, 7, 5, 4, 3, 2, 7, 7, 29, 1 };
		List<Integer> lista1 = Arrays.asList(array1);
		
		Integer[] array2 = { -9, -7, -5, -3, -1, 2, 4, 6, 8 };
		List<Integer> lista2 = Arrays.asList(array2);

		O(lista1, S);
		Cuadrados(lista2, S);
	}

	private static void O(List<Integer> lista, int S) {
		List<Integer> NuevaLista = new ArrayList<>();
		String str_numero;
		Boolean bandera;
		int nuevonumero;
		int digito;

		for (Integer numero : lista) {
			str_numero = String.valueOf(numero);
			bandera = false;
			nuevonumero = 0;

			for (char digito_char : str_numero.toCharArray()) {
				if ((digito = Character.getNumericValue(digito_char)) < S) {
					nuevonumero = nuevonumero * 10 + digito;
					bandera = true;
				}
			}

			if (bandera) {
				NuevaLista.add(0, nuevonumero);
				if (NuevaLista.size() >= 100)
					break;
			}
		}
		System.out.println(NuevaLista);
	}
	
	private static void Cuadrados(List<Integer> lista, int S) {
		List<Integer> ListaOrdenada = new ArrayList<>();
		List<Integer> NuevaLista = new ArrayList<>();
		int limite = (int) Math.sqrt(S *10 + S);
		
		if (lista.get(0) < 0) {
			boolean Primernegativo = false;
			for (int i = lista.size()-1; i >= 0; i--) {
				if (lista.get(i) < 0) {
					if (!Primernegativo) {
						ListaOrdenada.addAll(lista.subList(i + 1, lista.size()));
						Primernegativo = true;
					}
					int numero = lista.get(i)*-1;
					if (ListaOrdenada.size() > 0) {
						for (int j = 0; j < ListaOrdenada.size(); j++) {
							if (j == ListaOrdenada.size() - 1) {
								ListaOrdenada.add(numero);
								break;
							}else if (numero <= ListaOrdenada.get(j)) {
								ListaOrdenada.add(j, numero);
								break;
							}
						}
					}else
						ListaOrdenada.add(numero);
				}
			}
		}else
			ListaOrdenada = lista;
			
			
		for (Integer numero: ListaOrdenada) {
			if (numero <= limite)
				NuevaLista.add((int)Math.pow(numero, 2));
			else
				break;
		}
		
		System.out.println(NuevaLista);
	}
}