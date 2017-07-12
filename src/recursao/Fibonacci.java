package recursao;

import util.Mostra;

public class Fibonacci {

	public static void main(String[] args) {
		Integer[] vetor = vetorFibonacci(10);
		
		Mostra.vetor(vetor);
		
	}
	
	public static Integer[] vetorFibonacci(int n) {
		Integer[] fib = new Integer[n];
		
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < n;i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib;
	}

	public static Integer funcaoFibonacci(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		else return funcaoFibonacci(n-1) + funcaoFibonacci(n-2);
	}
	
}
