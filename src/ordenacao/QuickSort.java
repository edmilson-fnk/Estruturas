package ordenacao;

public class QuickSort implements Ordenador {

	@Override
	public Integer[] ordenar(Integer[] vetor) {
		return quick(vetor, 0, vetor.length);
	}

	public Integer[] quick(Integer[] vetor, int inicio, int fim) {
		// Condição de parada
		if (inicio == fim) {
			return new Integer[]{vetor[inicio]};
		}
		
		// 1º passo - Escolher Pivô
		int pivo = inicio;
		
		// 2º passo - Particionar
		Integer[] P1 = new Integer[fim - inicio];
		Integer[] P2 = new Integer[fim - inicio];
		int posP1 = 0;
		int posP2 = 0;
		
		for (int i = inicio; i < fim; i++) {
			if (i == pivo) continue;
			
			if (vetor[i] < vetor[pivo]) {
				P1[posP1] = vetor[i];
				posP1++;
			} else {
				P2[posP2] = vetor[i];
				posP2++;
			}
		}
		
		// 3º passo - ordenar partições
		P1 = quick(P1, 0, posP1);
		P2 = quick(P2, 0, posP2);
		
		// 4º passo - juntar vetores
		Integer[] vetorOrdenado = new Integer[fim - inicio];
		for (int i = inicio; i < posP1; i++) {
			vetorOrdenado[i] = P1[i];
		}
		vetorOrdenado[posP1] = vetor[pivo];
		for (int i = posP1 + 1; i < fim; i++) {
			vetorOrdenado[i] = P2[i - posP1 - 1];
		}
		
		return vetorOrdenado;
	}
	
}
