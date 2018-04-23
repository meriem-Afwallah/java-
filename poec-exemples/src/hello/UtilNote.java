package hello;

public class UtilNote {

	public double calcMoyenne(int tab[]) {

		int somme = 0;
		for (int i = 0; i < tab.length; i++) {

			somme = somme + tab[i];
		}
		double moyenne = (double) somme / tab.length;
		return moyenne;
	}

	public int findMin(int notes[]) { // signature de la méthode
		int min = notes[0];
		for (int i = 0; i < notes.length; i++){
			if (notes[i] < min) {
				min = notes[i];	
			}
		}
		
		return min;
	}
	
	public int findMax(int notes[]) {
		int max = notes[0];
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] > max ) {
				max = notes[i];
			}
		}
		return max;
	}
}
