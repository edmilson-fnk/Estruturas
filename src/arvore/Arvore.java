package arvore;

import arvore.operar.Operador;

public class Arvore {

	public No raiz;
	
	public Arvore(int valor) {
		this.raiz = new No(valor);
	}

	public Arvore(No raiz) {
		this.raiz = raiz;
	}

	public Arvore() { }

	public Arvore inserir(Integer... valor) {
		if (valor != null) {
			for (Integer i : valor) {
				this.raiz = Operador.inserir(this.raiz, i);
			}
		}
		
		return this;
	}

	public Arvore remover(Integer... valor) {
		if (valor != null) {
			for (Integer i : valor) {
				this.raiz = Operador.remover(this.raiz, i);
			}
		}
		
		return this;
	}

	public void mostrar() {
		Operador.mostrar(this.raiz);
	}

	public void empilhar() {
		Operador.empilhar(this.raiz);
	}
	
}
