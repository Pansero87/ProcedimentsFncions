package exercicis;

public class IgualsVectors {

	// Ex 19
	static boolean igualsVectors(int v1[], int[] v2) {
		if (v1.length == v2.length) {
			for (int i = 0; i < v1.length; i++) {
				if (v2[i] != v1[i]) {
					return false; // Ha de recorrer tot el vector per saber si son tots iguals
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {

		int[] vector1 = { 10, 12, 4, 5, 6,7 };
		int[] vector2 = { 10, 11, 4, 5, 6, 7, };

		if (igualsVectors(vector1, vector2)) {
			System.out.println("Son iguals.");

		} else {
			System.out.println("No son iguals.");
		}
	}

}
