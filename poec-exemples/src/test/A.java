package test;

import java.util.Objects;

public class A {
	
	/**
	 * Génère la représentation hexadécimale pour une
	 * couleur.
	 * Par exemple
	 * black => #000000
	 * White => #FFFFFF
	 * red => FF0000
	 * @param name le nom de la couleur
	 * @return représentation héxadécimale de la couleur
	 * @throws RunTimeException quand la couleur n'est pas supportée
	 * @throws NullPointerException si la name est null
	 */

	public String getHexColor(String name) {
		Objects.requireNonNull(name,"Must not be null");
		switch(name) {
		case "black": return "#000000";
		case "white" : return "#FFFFFF";
		case "red" : return "#FF0000";
		
		default: throw new RuntimeException("Unsupported color");
		}
	
		
	}
}
