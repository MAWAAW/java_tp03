package exercices;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Choisir le rang N pour fibo...");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int f1 = 0;
		int f2 = 1;
		int f3 = 0;

		for (int i = 0; i < N; i++) {

			if (N == 0) {
				f3 = 0;
				break;
			}

			if (N == 1) {
				f3 = 1;
				break;
			}

			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;

		}

		sc.close();
		System.out.println("Fibo pour le rang " + N + " : " + f3);

	}

}
