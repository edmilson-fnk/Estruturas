package arvore.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import arvore.Arvore;
import arvore.app.Util.Metodo;

public class Main {

	private static Arvore arvore;
	
	public static void main(String[] args) {
		System.out.println("Monte sua árvore");
		
		String comando = "";
		while (true) {
			comando = lerComando();
			
			String[] entrada = comando.split(" ");
			
			if (entrada.length == 0) {
				System.out.println("Informe um comando");
			} else {
				Metodo metodo = Util.getMetodo(entrada);
				Integer numNos = entrada.length - 1;
				
				if (metodo == null) {
					System.out.println("Informe um comando válido: inserir (i), remover (r), mostrar (m) ou sair (x)");
				} else if (metodo.equals(Metodo.SAIR)) {
					System.out.println("Fim do programa");
					break;
				} else if (!metodo.equals(Util.Metodo.MOSTRAR) && numNos == 0) {
					System.out.println("Informe pelo menos uma chave para o comando " + metodo);
				} else {
					executarComando(metodo, Util.getChaves(entrada));
				}
			}
		}
		
	}

	private static void executarComando(Metodo metodo, Integer[] chaves) {
		if (metodo.equals(Metodo.MOSTRAR)) {
			arvore.mostrar();
		} else if (metodo.equals(Metodo.REMOVER)) {
			arvore.remover(chaves);
		} else if (metodo.equals(Metodo.INSERIR)) {
			if (arvore == null) arvore = new Arvore();
			
			arvore.inserir(chaves);
		}
	}

	private static String lerComando() {
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "x";
	}

}

