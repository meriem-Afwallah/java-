package hello;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Cr�er un jeu de morpion qui peut se jouer � 2 joueurs
		
		TTTGrid grid = new TTTGrid(3);
		grid.print();
		
		char currentPlayer = 'X';
		
		for(;;) {
			// 1) de demander au joueur X/O la case il veut jouer
			System.out.println("Joueur " + currentPlayer);
			System.out.println("Saisir x:");
			int x = Integer.parseInt(scanner.nextLine());
			System.out.println("Saisir y:");
			int y = Integer.parseInt(scanner.nextLine());
			
			// 2) faire le put correspondant
			grid.put(currentPlayer, x, y);
			
			// 3) afficher la grille
			grid.print();
			
			if(grid.thereIsAWinner()) {
				System.out.format("Joueur %s a gagn�%n " ,currentPlayer);
				break;
			}
			
			// switch le joueur courant
			currentPlayer = (currentPlayer == 'X' ? 'O':'X');
		}		
		
		
// Pour ceux qui ont d�j� fait jouer les joueurs
		// 1)
		// Faire appara�tre le concept de joueur
			// Classe Player
					// nom, symbol
		
		// Au debut du programme
			// Initialiser 2 joueurs, en leur demandant � tour de r�le
			// de choisir un symbole et leur nom
		
		// 2) Comptage des scores
			// le joueur ayant gagn� marque 1 point
			// en fin de partie afficher les points des joueurs

	}

}