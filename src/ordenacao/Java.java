
package ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import util.Mostra;

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
		Mostra.vetor(vetor);
		
		Comparator<Integer> comparatorMaluco = new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				if (num1 % 2 == 0 && num2 % 2 == 0) {
					if (num1 < num2) {
						return 1;
					} else if (num1 > num2) {
						return -1;
					} else {
						return 0;
					}
				} else if (num1 % 2 == 1 && num2 % 2 == 1) {
					if (num1 < num2) {
						return -1;
					} else if (num1 > num2) {
						return 1;
					} else {
						return 0;
					}
				} else if (num1 % 2 == 1 && num2 % 2 == 0) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return num1.compareTo(num2);
			}
		};
		
		Arrays.sort(vetor, comparator);
		
		System.out.println("Depois:");
		Mostra.vetor(vetor);
	}

	private static void ordenarLista() {
		System.out.println("Ordenando lista");
		List<Integer> numeros = Arrays.asList(4, 8, 3, 2, 6, 1, 7, 5);
		
		System.out.println("Antes: " + numeros);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		Collections.sort(numeros, comparator);
		
		System.out.println("Depois: " + numeros + "\n");
	}
	
}
