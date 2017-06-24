package arvore.app;

import arvore.Arvore;
import arvore.No;

public class Util {

	public enum Metodo {
		INSERIR,
		REMOVER,
		MOSTRAR,
		SAIR
	}
	
	public static Integer[] getChaves(String[] entrada) {
		int numNos = entrada.length-1;
		Integer[] retorno = new Integer[numNos];
		
		if (numNos == 0) {
			return retorno;
		}
		
		for (int i = 0; i < numNos; i++) {
			retorno[i] = Integer.parseInt(entrada[i+1]);
		}
		
		return retorno;
	}
	
	public static Metodo getMetodo(String[] entrada) {
		if (entrada[0].equalsIgnoreCase("inserir") || entrada[0].equalsIgnoreCase("i")) {
			return Metodo.INSERIR;
		} else if (entrada[0].equalsIgnoreCase("remover") || entrada[0].equalsIgnoreCase("r")) {
			return Metodo.REMOVER;
		} else if (entrada[0].equalsIgnoreCase("mostrar") || entrada[0].equalsIgnoreCase("m")) {
			return Metodo.MOSTRAR;
		} else if (entrada[0].equalsIgnoreCase("sair") || entrada[0].equalsIgnoreCase("x")) {
			return Metodo.SAIR;
		}
		
		return null;
	}
	
	public static void roda() {
		Arvore raiz = new Arvore(new No(8));

		raiz.inserir(3).inserir(6).inserir(4).inserir(7).inserir(0).inserir(9).inserir(1);

		raiz.mostrar();
	}
	
	public static void main(String[] args) {
		roda();
	}
	
}
