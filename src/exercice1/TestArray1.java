package exercice1;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int N = array.length;

		for (int i = 0; i < N; i++) {

			System.out.print(array[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < N; i++) {

			System.out.print(array[N - 1 - i] + " ");

		}
		System.out.println();

		for (int i = 0; i < N; i++) {

			if (array[i] > 3) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < N; i++) {

			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();

		int maxValue = 0;
		for (int i = 0; i < N; i++) {

			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("Le plus grand element: " + maxValue);

		int minValue = 9999;
		for (int i = 0; i < N; i++) {

			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("Le plus petit element: " + minValue);

	}

}
