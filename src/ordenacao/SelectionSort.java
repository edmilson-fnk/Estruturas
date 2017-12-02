package ordenacao;

import util.Mostra;

public class SelectionSort implements Ordenador {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{8,4,3,1,5,7,2,6};
		
		Mostra.vetor(vetor);
		
		aplicar(vetor);
		
		Mostra.vetor(vetor);
	}
	
	public static Integer[] aplicar(Integer[] vetor) {
		return new SelectionSort().ordenar(vetor);
	}
	
	public Integer[] ordenar(Integer[] vetor) {
		// Percorrer o vetor
		for (int iteracao = 0; iteracao < vetor.length - 1; iteracao++) {
			int min = iteracao;

			// Identificar menor elemento
			for (int j = iteracao + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min])
					min = j;
			}
			
			// Realizar a troca entre as posições "menor" e "iteracao"
			if (iteracao != min) {
				Integer aux = vetor[iteracao];
				vetor[iteracao] = vetor[min];
				vetor[min] = aux;
			}
		}
		
		return vetor;
	}
}
