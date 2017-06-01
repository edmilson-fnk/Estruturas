package arvore;

public class NoAVL extends No {
	
	public NoAVL esq;
	public NoAVL dir;
	
	public int fb;

	public NoAVL(Integer valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return valor + " [" + fb + "]";
	}
	
}
