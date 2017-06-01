package operar;

import arvore.No;

public class Operador {

	public static No empilhar(No raiz) {
		empilhar(raiz, 0);
		
		return raiz;
	}
	
	public static void empilhar(No raiz, int nivel) {
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
	
	public static No arvore(Integer... chaves) {
		return inserir(null, chaves);
	}
	
	public static No inserir(No raiz, Integer... chaves) {
		for (Integer chave : chaves) {
			raiz = inserir(raiz, chave);
		}
		
		return raiz;
	}
	
	public static No inserir(No raiz, Integer chave) {
		return inserir(raiz, chave, raiz);
	}
	
	private static No inserir(No raiz, Integer chave, No raizInicial) {
		if (raiz == null) return new No(chave);
		
		if (chave < raiz.valor) {
			if (raiz.esq == null) {
				raiz.esquerda(chave);
				return raizInicial;
			} else {
				return inserir(raiz.esq, chave, raizInicial);
			}
		} else if (chave > raiz.valor) {
			if (raiz.dir == null) {
				raiz.direita(chave);
				return raizInicial;
			} else {
				return inserir(raiz.dir, chave, raizInicial);
			}
		} else {
			return raizInicial;
		}
	}
}
