package exercice1;

import java.util.*;

public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int N = array.length;
		
		int tmp = 0;
		for (int i = N-1; i > 0; i--) {

			for(int j = 0; j < i; j++) {
				
				if(array[j+1] < array[j]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
				
			}
		}
		
		for (int i = 0; i < N; i++) {

			System.out.print(array[i] + " ");

		}
		System.out.println();
		
		Arrays.sort(array);
		
		for (int i = 0; i < N; i++) {

			System.out.print(array[i] + " ");

		}
		System.out.println();

	}

}
