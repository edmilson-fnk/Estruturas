package operar;

import arvore.No;

public class OperadorAVL extends Operador {

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
		raiz = Operador.inserir(raiz, chave);
		
		Calculador.atualizarFatores(raiz);
		
		No desbalanceado = buscarDesbalanceado(raiz);
		raiz = Rotor.rotacionar(desbalanceado, raiz);
		
		System.out.println("Desbalanceado: " + desbalanceado);
		
		return raiz;
	}
	
	private static No buscarDesbalanceado(No raiz) {
		if (raiz == null) return null;
		
		if (raiz.fb < -1 || raiz.fb > 1) {
			return raiz;
		} else {
			return buscarDesbalanceado(raiz.esq, raiz.dir);
		}
	}
	
	private static No buscarDesbalanceado(No esq, No dir) {
		if (esq == null && dir == null) return null;
		
		No desb = buscarDesbalanceado(esq);
		
		if (desb == null) {
			return buscarDesbalanceado(dir);
		} else {
			return desb;
		}
	}
	
}
