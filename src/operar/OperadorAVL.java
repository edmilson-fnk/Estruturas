package operar;

import arvore.ArvoreAVL;
import arvore.No;

public class OperadorAVL extends Operador {

	public static ArvoreAVL arvore(Integer... chaves) {
		return new ArvoreAVL(inserir(null, chaves));
	}
	
	public static No inserir(No raiz, Integer... chaves) {
		for (Integer chave : chaves) {
			raiz = inserir(raiz, chave);
		}
		
		return raiz;
	}
	
	public static No inserir(No raiz, Integer chave) {
		if (raiz == null) return new No(chave);
		
		if (chave < raiz.valor) {
			raiz.esq = inserir(raiz.esq, chave);
		} else if (chave > raiz.valor) {
			raiz.dir = inserir(raiz.dir, chave);
		} else {
			return raiz; // não são permitidas chaves duplicadas
		}
		
		// atualizar FB do nó
		Calculador.atualizarFatorNo(raiz);
		
		// rotacionar, quando necessário e retornar a nova raiz
		return Rotor.rotacionar(raiz);
	}
	
}
