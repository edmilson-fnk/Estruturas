package ed;

import arvore.Arvore;
import arvore.operar.Operador;

public class Executor {

	public static void main(String[] args) {
		Arvore arv = Operador.arvore(5,2,1,3,4,0);
		
		System.out.println("Antes");
		arv.empilhar();
		
		arv.remover(2).remover(5).inserir(10).remover(3).inserir(5);
		
		System.out.println("\nDepois");
		arv.empilhar();
	}
	
}
