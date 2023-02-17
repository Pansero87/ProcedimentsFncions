package exercicis;

public class MaximEnters {

// 24. Volem una funció que calcule el màxim de distinta quantitat de números enters

	/**
	 * Funcio que calcula el màxim de 2 enters.
	 * 
	 * @param a un dels enters que rebrà la funció.
	 * @param b altre dels enters que rebrà la funció.
	 * @return desprès de comparar-los, retornarà el màxim de entre ells.
	 * @author sergio
	 */
	// Sobrecàrrega (Funció màxim de 2 enters)
	static int maxim(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
		// return (a>b)?a:b;
		
	}

	// Sobrecàrrega (Funció màxim de 3 enters)
	static int maxim(int a, int b, int c) {
		System.out.println("ojo1");
		if (a > b && a > c) {
			return a;
		}
		if (b > a && b > c) {
			return b;

		}
		return c;

	}

	// Vector d'arguments
	static int maximIM(int[] enters) throws Exception{

		return maxim(enters);

	}

	// Varargs
	static int maxim(int... enters) {
		System.out.println("ojo2");
//		int maxim = Integer.MIN_VALUE;

		
			int maxim = enters[0];
			for (int numero : enters) {
				if (numero > maxim) {
					maxim = numero;
				}
			}
			return maxim;
		
		

	}

	public static void main(String[] args) {
		int max[] = {};

		try {
			System.out.println(maximIM(max));
		} catch (Exception e) {
			System.out.println("No pot calcular el màxim d'un array buit");
			
		}
	}

}
