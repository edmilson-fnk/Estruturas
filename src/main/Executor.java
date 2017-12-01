package main;

import arvore.ArvoreAVL;
import arvore.operar.OperadorAVL;

public class Executor {

	public static void main(String[] args) {
		ArvoreAVL arv = OperadorAVL.arvore(5,2,1,3,4,0,9,6,8,7);
		
		System.out.println("Antes");
		arv.empilhar();
		
		arv.remover(2).remover(5).inserir(10).remover(3).inserir(5);
		
		System.out.println("\nDepois");
		arv.empilhar();
	}
	
}
