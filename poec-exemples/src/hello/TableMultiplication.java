package hello;


public class TableMultiplication {

	public void print(int a, int b) {
		for (int i = 1; i <= b; i++) {
			int res = a*i; 
			System.out.println(res);
			
			
			
		}
		
	}

	public void affiche(int a) {
		for (int i = 0; i <=a; i++) {
			for (int j = 0; j <=a; j++) {
				System.out.println(i*j);
			}
			
		}
		
	}

}
