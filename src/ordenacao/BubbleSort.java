package ordenacao;

import util.Mostra;

public class BubbleSort implements Ordenador {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{5,7,3,8,1,2,9};
		
		Mostra.vetor(vetor);
		
		aplicar(vetor);
		
		Mostra.vetor(vetor);
	}
	
	public static Integer[] aplicar(Integer[] vetor) {
		return new BubbleSort().ordenar(vetor);
	}

	@Override
	public Integer[] ordenar(Integer[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					Integer aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		return vetor;
	}
	
}
