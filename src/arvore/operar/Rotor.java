package arvore.operar;

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
		No aux = raiz.dir;
		
		raiz.fb = 0;
		aux.fb = 0;
		
		raiz.dir = aux.esq;
		aux.esq = raiz;
		
		return aux;
	}
	
	public static No simplesDireita(No raiz) {
		No aux = raiz.esq;
		
		raiz.fb = 0;
		aux.fb = 0;
		
		raiz.esq = aux.dir;
		aux.dir = raiz;
		
		return aux;
	}
	
	public static No rotacionar(No no) {
		if (no == null) return no;
		
		if (no.fb == -2 && no.esq.fb < 0) {
			return simplesDireita(no);
		} else if (no.fb == 2 && no.dir.fb > 0) {
			return simplesEsquerda(no);
		} else if (no.fb == -2 && no.esq.fb >= 0) {
			return duplaDireita(no);
		} else if (no.fb == 2 && no.dir.fb <= 0) {
			return duplaEsquerda(no);
		}
		
		return no;
	}

}
