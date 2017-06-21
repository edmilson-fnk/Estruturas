package ordenacao;

import util.Vetores;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{0,8,4,3,1,5,7,2,6};
		
		Vetores.mostra(vetor);
		
		selectionsort(vetor);
		
		Vetores.mostra(vetor);
	}
	
	public static Integer[] selectionsort(Integer vetor[]) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int min = i;
			
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min])
					min = j;
			}
			
			if (i != min) {
				Integer aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
		}
		
		return vetor;
	}
}
