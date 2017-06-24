package arvore;

import arvore.operar.Operador;

public class Arvore {

	public No raiz;
	
	public Arvore(No raiz) {
		this.raiz = raiz;
	}

	public Arvore inserir(int valor) {
		this.raiz = Operador.inserir(this.raiz, valor);
		
		return this;
	}

	public Arvore remover(int valor) {
		this.raiz = Operador.remover(this.raiz, valor);
		
		return this;
	}

	public void mostrar() {
		Operador.mostrar(this.raiz);
	}

	public void empilhar() {
		Operador.empilhar(this.raiz);
	}
	
}
