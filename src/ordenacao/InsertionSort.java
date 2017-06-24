package ordenacao;

public class InsertionSort implements Ordenador {

	@Override
	public Integer[] ordenar(Integer[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			for (int j = i; j >= 1 && vetor[j] < vetor[j-1]; j--) {
				int aux = vetor[j];
				vetor[j] = vetor[j-1];
				vetor[j-1] = aux;
			}
		}
		
		return vetor;
	}

}
