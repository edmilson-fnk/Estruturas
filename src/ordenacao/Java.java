
package ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import util.Vetores;

public class Java {

	public static void main(String[] args) {
		// Collections.sort(lista)
		ordenarLista();
		
		// Arrays.sort(vetor[])
		ordenarVetor();
	}

	private static void ordenarVetor() {
		System.out.println("Ordenando vetor");
		Integer[] vetor = new Integer[]{4,9,7,8,1,3,2,5,6};
		
		System.out.println("Antes:");
		Vetores.mostrar(vetor);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 2 == 0 && o2 % 2 == 0) {
					if (o1 < o2) {
						return 1;
					} else if (o1 > o2) {
						return -1;
					} else {
						return 0;
					}
				} else if (o1 % 2 == 1 && o2 % 2 == 1) {
					if (o1 < o2) {
						return -1;
					} else if (o1 > o2) {
						return 1;
					} else {
						return 0;
					}
				} else if (o1 % 2 == 1 && o2 % 2 == 0) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		Arrays.sort(vetor, comparator);
		
		System.out.println("Depois:");
		Vetores.mostrar(vetor);
	}

	private static void ordenarLista() {
		System.out.println("Ordenando lista");
		List<Integer> numeros = Arrays.asList(4, 8, 3, 2, 6, 1, 7, 5);
		
		System.out.println("Antes: " + numeros);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -1;
			}
		};
		
		Collections.sort(numeros, comparator);
		
		System.out.println("Depois: " + numeros + "\n");
	}
	
}
