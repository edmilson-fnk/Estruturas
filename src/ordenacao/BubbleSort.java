package ordenacao;

import util.Vetores;

public class BubbleSort implements Ordenador {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{8,4,3,1,5,7,2,6,0};
		
		Vetores.mostrar(vetor);
		
		aplicar(vetor);
		
		Vetores.mostrar(vetor);
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
