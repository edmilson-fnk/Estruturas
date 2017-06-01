package arvore;

public class No {

	public No esq;
	public No dir;
	
	public Integer valor;
	public int fb;
	
	public No(Integer valor) {
		this.valor = valor;
	}
	
	public No esquerda(int valor) {
		this.esq = new No(valor);
		
		return this;
	}
	
	public No direita(int valor) {
		this.dir = new No(valor);
		
		return this;
	}
	
	@Override
	public String toString() {
		return valor + " [" + fb + "]";
	}
	
}
