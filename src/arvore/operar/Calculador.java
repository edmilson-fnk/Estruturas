package arvore.operar;

import arvore.No;
import arvore.NoAVL;

public class Calculador {

	public static int altura(No raiz) {
		if (raiz == null) return -1;
		
		return Math.max(altura(raiz.esq), altura(raiz.dir)) + 1;
	}
	
	public static void atualizarFatores(NoAVL raiz) {
		if (raiz == null) return;
		
		atualizarFatorNo(raiz);
		atualizarFatores(raiz.esq);
		atualizarFatores(raiz.dir);
	}
	
	public static void atualizarFatorNo(NoAVL raiz) {
		raiz.fb = altura(raiz.dir) - altura(raiz.esq);
	}
	
}
