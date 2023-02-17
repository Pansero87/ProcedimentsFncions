package exercicis;

import java.util.Scanner;

public class LLegirVectorInt {
	static Scanner llegir = new Scanner(System.in);

	static void llegirVectorInt(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Element " + i + ":");
			v[i] = llegir.nextInt();

		}
		
//		for (int i = 0; i < v.length; i++) {
//			System.out.print(v[i]);
//			if (i < v.length - 1)
//				System.out.print(",");
//		}
	}

	public static void main(String[] args) {

		int[] vector = new int[5];

		llegirVectorInt(vector);

	}

}
