package operar;

import arvore.No;

public class Main {

	public static void main(String[] args) {
		No raiz = OperadorAVL.arvore(8,9,7,1,2,3,4,5,6);
		Calculador.atualizarFatores(raiz);
		raiz.empilhar();
	}
	
}
