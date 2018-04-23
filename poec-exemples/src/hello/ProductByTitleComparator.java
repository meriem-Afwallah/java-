package hello;

import java.util.Comparator;

public class ProductByTitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getTitle().length() > p2.getTitle().length()) {
			return 1;
		}else if (p1.getTitle().length() < p2.getTitle().length()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	

	
			
}
