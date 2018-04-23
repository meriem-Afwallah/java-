package hello;

public class TTTGrid {

	private char[][] tab;

	public TTTGrid(int size) {
		tab = new char[size][size];
	}

	public void put(char c, int x, int y) {
		tab[x][y] = c;
	}
	
	public void print() {
		StringBuilder output = new StringBuilder();

		// pour toutes les lignes
		for (int y = 0; y < tab.length; y++) {
			// séparateur haut
			printSeparator(output);
			// générer une ligne
			printLine(y, output);
		}
		// dernier séparateur
		printSeparator(output);

		System.out.println(output);

	}
	
	private void printSeparator(StringBuilder output) {
		for (int i = 0; i < tab.length; i++) {
			output.append("----");
		}
		output.append("-\n");	
	}
	
	private void printLine(int y, StringBuilder output) {
		for (int x = 0; x < tab.length; x++) {
			output.append("| ");
			if (tab[x][y] == '\u0000') {
				output.append(" ");
			} else {
				output.append(tab[x][y]);
			}
			output.append(" ");
		}
		output.append("|\n");
	}

	
	public boolean thereIsAWinner() {
		
		return thereIsAWinnerHorizontally() 
			|| thereIsAWinnerVertically()
			|| thereIsAWinnerDiagonally();
	}

	private boolean thereIsAWinnerHorizontally() {
		for(int y = 0; y < tab.length; y++) {
			if(tab[0][y] == '\u0000') { 
				continue; 
			}
			
			boolean isEqual = true;
			for (int x = 0; x < tab.length - 1; x++) {
				isEqual = (tab[x][y] == tab[x+1][y]);
				
				if(! isEqual) { break;}
			}
			if(isEqual) {
				return true;
			}
		}
		return false;
	}
	
	private boolean thereIsAWinnerVertically() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean thereIsAWinnerDiagonally() {
		return false;
	}





}