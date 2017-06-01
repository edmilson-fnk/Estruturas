package arvore;

import arvore.operar.Operador;

public class ArvoreAVL extends Arvore {

	public NoAVL raiz;
	
	public ArvoreAVL(NoAVL raiz) {
		super(raiz);
		this.raiz = raiz;
	}

	public void empilhar() {
		Operador.empilharAVL(this.raiz);
	}
	
}
