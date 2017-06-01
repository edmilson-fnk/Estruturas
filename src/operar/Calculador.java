package operar;

import arvore.No;

public class Calculador {

	public static int altura(No raiz) {
		if (raiz == null) return -1;
		
		return Math.max(altura(raiz.esq), altura(raiz.dir)) + 1;
	}
	
	public static void atualizarFatores(No raiz) {
		if (raiz == null) return;
		
		atualizarFatorNo(raiz);
		atualizarFatores(raiz.esq);
		atualizarFatores(raiz.dir);
	}
	
	public static void atualizarFatorNo(No raiz) {
		raiz.fb = altura(raiz.dir) - altura(raiz.esq);
	}
	
}
