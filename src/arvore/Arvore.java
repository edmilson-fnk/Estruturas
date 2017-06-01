package arvore;

import arvore.operar.Operador;

public class Arvore {

	public No raiz;
	
	public Arvore(No raiz) {
		this.raiz = raiz;
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
