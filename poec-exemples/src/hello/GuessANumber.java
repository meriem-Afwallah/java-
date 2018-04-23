package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nombreADeviner = 8;
		int i;
	
		int compteur = 0;
		for (;;) {
			
			int choixUtilisateur = sc.nextInt();
			compteur++;
			
			if (nombreADeviner == choixUtilisateur) {
				System.out.println("Gagné en " + compteur + " coups");
				break;
			} else {
				System.out.println("Perdu");
			}
		}	

		

	}

}
