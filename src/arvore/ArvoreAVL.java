package arvore;

import operar.Operador;

public class ArvoreAVL extends Arvore {

	public ArvoreAVL(No raiz) {
		super(raiz);
	}
	
	public void inserir(int valor) {
		Operador.inserir(this.raiz, valor);
	}

	public void mostrar() {
		Operador.mostrar(this.raiz);
	}

	public void empilhar() {
		Operador.empilhar(this.raiz);
	}
	
}
