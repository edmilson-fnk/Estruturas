package recursao;

public class Recursao {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[]{1, 2, 3, 4, 5};
		
		System.out.println(soma(vetor));
	}
	
	private static Integer soma(Integer[] vetor) {
		return soma(vetor, 0, vetor.length - 1);
	}
	
	private static Integer soma(Integer[] vetor, int inicio, int fim) {
		if (inicio > fim) 
			return 0;
		else 
			return vetor[inicio] + soma(vetor, inicio + 1, fim);
	}
	
}
