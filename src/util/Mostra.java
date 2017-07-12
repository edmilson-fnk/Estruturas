package util;

import java.util.stream.IntStream;

public class Mostra {

	private static String toString(Object[] vetor) {
		StringBuilder sb = new StringBuilder();
		
		for (Object o : vetor) {
			if (o != null) {
				sb.append(o.toString());
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
	
	public static void vetor(Object[] vetor) {
		System.out.println(toString(vetor));
	}
	
	public static void posicoes(Object[] vetor) {
		System.out.println(toString(IntStream.range(0, vetor.length).mapToObj(Integer::valueOf).toArray()));
	}
	
}
