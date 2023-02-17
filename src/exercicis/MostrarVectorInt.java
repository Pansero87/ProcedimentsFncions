package exercicis;

public class MostrarVectorInt {
	// Ex 16
	// Procediment Mostrar vector
	static void mostrarVectorInt(int[] vEnt) {

		System.out.print(vEnt[0]);
		for (int f = 1; f < vEnt.length; f++) {
			System.out.print("," + vEnt[f]);
		}
		System.out.println();

	}

	// Ex 17
	// Procediment mostrar matriu
	static void mostrarMatriuInt(int[][] mEnt) {
		for (int c = 0; c < mEnt.length; c++) {
			mostrarVectorInt(mEnt[c]);

		}
	}

	// Ex 18
	// Copiar vectors
	static void copiarVector(int[] v1, int[] v2) {
		int ec;
		if (v1.length < v2.length) {
			ec = v2.length;
		} else {
			ec = v2.length;
		}

		for (int i = 0; i < ec; i++) {
			v2[i] = v1[i];

		}

	}

	public static void main(String[] args) {

		int v1[] = { 4, 10, 25, 30, 50, 69 };
		int v2[] = { 33, 2, 1, 6, 7 };

//		 int enters[][] = { { 22, 33, 45, 105 }, { 89, 4, 69, 9 }, { 21, 17, 45, 28 },
//		 { 33, 45, 78, 90, } };

		copiarVector(v1, v2);
		mostrarVectorInt(v2);
//		 mostrarMatriuInt(enters);

	}

}