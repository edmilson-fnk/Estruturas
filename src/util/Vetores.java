package util;

public class Vetores {

	public static String toString(Object[] vetor) {
		StringBuilder sb = new StringBuilder();
		
		for (Object o : vetor) {
			if (o != null) {
				sb.append(o.toString());
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
	
	public static void mostra(Object[] vetor) {
		System.out.println(toString(vetor));
	}
	
}
