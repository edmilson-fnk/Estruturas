package ordenacao;

import util.Vetores;

public class Bubblesort {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{8,4,3,1,5,7,2,6,0};
		
		Vetores.mostra(vetor);
		
		bubblesort(vetor);
		
		Vetores.mostra(vetor);
	}
	
	public static Integer[] bubblesort(Integer[] vetor) {
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
