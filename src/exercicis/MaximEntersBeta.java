package exercicis;

import java.util.Collections;

public class MaximEntersBeta {
	

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
		} else {
			return b;
		}

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
	static int maximIM(int[] enters) {

		return maxim(enters);

	}

	// Varargs
	static int maxim(int... enters) {
		int maxim = enters[0];
		for (int i = 0; i < enters.length; i++) {
			if (enters[i] > maxim)
				maxim = enters[i];

		}
		return maxim;
	}

	public static void main(String[] args) {
		int max[] = {};

		System.out.println(maximIM(max));
	}

}
