package exercicis;

public class CopiarVector {

	static void copiarVector(int[] v1, int[] v2) {
		int ec;
		if(v1.length < v2.length) {
			ec = v2.length;
		}else {
			ec = v2.length;
		}
		
		for (int i = 0; i < ec; i++) {
			v2[i] = v1[i];
			
			System.out.print(v2[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] vector1 = new int[10];
		int[] vector2 = new int[4];

		copiarVector(vector1, vector2);

	}

}
