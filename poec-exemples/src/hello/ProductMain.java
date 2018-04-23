package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {

		Product p1 = new Product("voiture rouge");
		Product p2 = new Product("voiture rouge");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		HashSet<Product> productSet = new HashSet<Product>();
		productSet.add(p1);
		productSet.add(p2);
		
		System.out.println(productSet.size());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		
		ProductByTitleComparator comparatorByTitleLength = new ProductByTitleComparator();
		System.out.println(comparatorByTitleLength.compare(p1,p2));
		
		Product p3 = new Product("ordinateur");
		System.out.println(comparatorByTitleLength.compare(p1, p3));
		
		ProductByPriceComparator comparatorByPrice = new ProductByPriceComparator();
		System.out.println(comparatorByPrice.compare(p1,p2));
		
		
		ArrayList<Product> productsList = new ArrayList<Product>();
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		
		
		productsList.sort(comparatorByTitleLength);
		System.out.println(productsList);
		
		productsList.sort(comparatorByPrice);
		System.out.println(productsList);
		
		productSet.add(p3);
		
		ArrayList<Product> anotherProductList = new ArrayList<Product>(productSet);
		TreeSet<Product> productsTreeSet = new TreeSet<Product>(comparatorByPrice);
		
		productsTreeSet.add(p1);
		productsTreeSet.add(p2);
		productsTreeSet.add(p3);
		
		System.out.println(productsTreeSet);
	}

}
