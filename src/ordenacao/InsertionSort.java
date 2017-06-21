package ordenacao;

import util.Vetores;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{8,4,3,1,5,7,2,6,0};
		
		Vetores.mostra(vetor);
		
		selectionsort(vetor);
		
		Vetores.mostra(vetor);
	}
	
	public static void selectionsort(Integer num[]) {
		for (int i = 0; i < num.length - 1; i++) {
			int min = i;
			
			for (int j = (i + 1); j < num.length; j++) {
				if (num[j] < num[min])
					min = j;
			}
			
			if (i != min) {
				Integer aux = num[i];
				num[i] = num[min];
				num[min] = aux;
			}
		}
	}
}
