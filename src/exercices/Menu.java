package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1- Ajouter un nombre");
			System.out.println("2- Afficher les nombres");
			
			int choix = sc.nextInt();
			
			if (choix==1) {
				
				System.out.println("Quel nombre faut-il rajouter ?");
				int nb = sc.nextInt();
				list.add(nb);
			}
			else if (choix==2) {
				for(Integer e : list){
					System.out.print(e+" ");
				}
				System.out.println();
			}
			else {
				break;
			}
		
		}
		
		System.out.println("fin programme------");
	}

}
