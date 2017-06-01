package arvore.operar;

import arvore.Arvore;
import arvore.No;
import arvore.NoAVL;

public class Operador {

	public static No empilhar(No raiz) {
		empilhar(raiz, 0);
		
		return raiz;
	}
	
	public static NoAVL empilharAVL(NoAVL raiz) {
		empilhar(raiz, 0);
		
		return raiz;
	}
	
	private static void empilhar(No raiz, int nivel) {
		if (raiz == null) return;
		
		for (int i = 0; i < nivel; i++) System.out.print("  ");
		System.out.println(raiz);
		
		if (raiz.esq != null) {
			System.out.print("E");
			empilhar(raiz.esq, nivel + 1);
		}
		
		if (raiz.dir!= null) {
			System.out.print("D");
			empilhar(raiz.dir, nivel + 1);
		}
	}
	
	private static void empilhar(NoAVL raiz, int nivel) {
		if (raiz == null) return;
		
		for (int i = 0; i < nivel; i++) System.out.print("  ");
		System.out.println(raiz);
		
		if (raiz.esq != null) {
			System.out.print("E");
			empilhar(raiz.esq, nivel + 1);
		}
		
		if (raiz.dir!= null) {
			System.out.print("D");
			empilhar(raiz.dir, nivel + 1);
		}
	}
	
	public static void mostrar(No raiz) {
		if (raiz == null) return;
		
		mostrar(raiz.esq);
		System.out.print(raiz + " ");
		mostrar(raiz.dir);
	}
	
	public static Arvore arvore(Integer... chaves) {
		return new Arvore(inserir(null, chaves));
	}
	
	public static No inserir(No raiz, Integer... chaves) {
		for (Integer chave : chaves) {
			raiz = inserir(raiz, chave);
		}
		
		return raiz;
	}
	
	private static No inserir(No raiz, Integer chave) {
		if (raiz == null) return new No(chave);
		
		if (chave < raiz.valor) {
			raiz.esq = inserir(raiz.esq, chave);
		} else if (chave > raiz.valor) {
			raiz.dir = inserir(raiz.dir, chave);
		}
		
		return raiz;
	}
}
