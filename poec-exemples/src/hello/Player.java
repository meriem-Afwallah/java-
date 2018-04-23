package hello;

public class Player {
	
	private String nom;
	private char symbol;
	
	public Player(String nom, char symbol) {
		
		this.nom = nom;
		this.symbol = symbol;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	

}

