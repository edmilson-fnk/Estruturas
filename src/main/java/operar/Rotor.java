package operar;

import arvore.No;

public class Rotor {

	public static No duplaEsquerda(No raiz) {
		raiz.dir = simplesDireita(raiz.dir);
		raiz = simplesEsquerda(raiz);
		
		return raiz;
	}

	public static No duplaDireita(No raiz) {
		raiz.esq = simplesEsquerda(raiz.esq);
		raiz = simplesDireita(raiz);
		
		return raiz;
	}
	
	public static No simplesEsquerda(No raiz) {
		No novaRaiz, tmp;
		
		novaRaiz = raiz.dir;
		tmp = novaRaiz.esq;
		novaRaiz.esq = raiz;
		raiz.dir = tmp;
		
		return novaRaiz;
	}
	
	public static No simplesDireita(No raiz) {
		No novaRaiz, tmp;
		
		novaRaiz = raiz.esq;
		tmp = novaRaiz.dir;
		novaRaiz.dir = raiz;
		raiz.esq = tmp;
		
		return novaRaiz;
	}
	
	public static No rotacionar(No desbalanceado, No raiz) {
		if (desbalanceado == null) return raiz;
		return null;
//		No pai = Calculador.pai(raiz, desbalanceado);
//		
//		if (desbalanceado.fb == -2 && desbalanceado.esq.fb < 0) {
//			novaRaiz = rotaca
//		}
	}

}
