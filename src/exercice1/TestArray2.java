package exercice1;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		int N = array.length;
		
		int mean=0;

		for (int i = 0; i < N; i++) {

			mean += array[i];

		}
		mean /= N;
		
		System.out.println("La moyenne est : "+mean);
		

		for (int i = 0; i < N; i++) {

			if(array[i]==15) {
				System.out.println("Index de l\'entier 15: "+i);
			}

		}

		int nbDoublons = 0;
		for (int i = 0; i < N; i++) {

			for(int j = i+1; j < N; j++) {
				
				if(array[i] == array[j]) {
					nbDoublons++;
				}
				
			}
		}
		System.out.println("nombre de doublons : "+nbDoublons);
		
	}

	
	
}
