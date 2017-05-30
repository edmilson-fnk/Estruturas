package operar;

import arvore.No;

public class Calculador {

	public static No pai(No raiz, No no) {
		if (raiz == null || no == null) return null;
		
		if (no.valor < raiz.valor) {
			return pai(raiz.esq, no);
		} else if (no.valor > raiz.valor) {
			return pai(raiz.dir, no);
		} else {
			return raiz;
		}
	}
	
	public static int altura(No raiz) {
		if (raiz == null) return -1;
		
		return Math.max(altura(raiz.esq), altura(raiz.dir)) + 1;
	}
	
	public static void atualizarFatores(No raiz) {
		if (raiz == null) return;
		
		atualizarFBNo(raiz);
		atualizarFatores(raiz.esq);
		atualizarFatores(raiz.dir);
	}
	
	private static void atualizarFBNo(No raiz) {
		raiz.fb = altura(raiz.dir) - altura(raiz.esq);
	}
	
}
