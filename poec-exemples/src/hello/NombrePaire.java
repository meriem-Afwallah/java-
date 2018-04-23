package hello;

public class NombrePaire {

	public static void main(String[] args) {
		
		// 1) afficher les nombres de 1 à 100;	
		for (int i = 0; i <= 100; i++) {
		System.out.println(i);
			
		}
		// 2) afficher les nombres pair de 1 à 100;
		for (int i = 0; i <=100; i++) {
			if(i%2==0) {
			System.out.println(i);			
			}
		}
		// 2') essayer de trouver une autre manière
		// d' afficher les nombres pair de 1 à 100;
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}

	}

}
