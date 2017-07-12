package util;

import java.util.stream.IntStream;

public class Mostra {

	private static String toString(Object[] vetor, String separator) {
		StringBuilder sb = new StringBuilder();
		
		for (Object o : vetor) {
			if (o != null) {
				sb.append(o.toString());
				sb.append(separator);
			}
		}
		
		return sb.toString();
	}
	
	public static void vetor(Object[] vetor, String separator) {
		System.out.println(toString(vetor, separator));
	}
	
	public static void vetor(Object[] vetor) {
		vetor(vetor, " ");
	}
	
	public static void posicoes(Object[] vetor, String separator) {
		System.out.println(toString(IntStream.range(0, vetor.length).mapToObj(Integer::valueOf).toArray(), separator));
	}
	
	public static void posicoes(Object[] vetor) {
		posicoes(vetor, " ");
	}
	
}
