package arvore;

import operar.Operador;

public class No {

	public No esq;
	public No dir;
	
	public Integer valor;
	public int fb;
	
	public No(Integer valor) {
		this.valor = valor;
	}
	
	public void esquerda(int valor) {
		this.esq = new No(valor);
	}
	
	public void direita(int valor) {
		this.dir = new No(valor);
	}
	
	public void inserir(int valor) {
		Operador.inserir(this, valor);
	}

	public void mostrar() {
		Operador.mostrar(this);
	}

	public void empilhar() {
		Operador.empilhar(this);
	}
	
	@Override
	public String toString() {
		return valor + " [" + fb + "]";
	}
	
}
