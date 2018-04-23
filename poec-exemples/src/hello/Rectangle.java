package hello;

public class Rectangle implements Shape  {
	//variables d'instance
	private int width;
	private int height;
	
	/**
	 * Construit un rectangle à partir de saa largeur et sa hauteur.
	 * @param width entier, largeur du rectangle
	 * @param height , hauteur du rectangle
	 * @throws IllegalArgumentException si width ou height est négatif
	 */
	public Rectangle(int width, int height) {
		if(width<0) {
			throw new IllegalArgumentException("width must be positive");
			//jetter une exception
		}
		if(height<0) {
			throw new IllegalArgumentException("height must be positive");
			//jetter une exception
		}
		
		this.width = width;
		this.height = height;
	}


	//méthodes
	public double calcArea() {
		return  width * height;
		
		
		
	}
}
