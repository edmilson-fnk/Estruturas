package arvore;

import arvore.operar.Operador;

public class ArvoreAVL extends Arvore {

	public ArvoreAVL(No raiz) {
		super(raiz);
		this.raiz = raiz;
	}

	public void empilhar() {
		Operador.empilhar(this.raiz);
	}
	
}
