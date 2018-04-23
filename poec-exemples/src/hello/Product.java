package hello;

public class Product {
	private String title;
	private int price;
	
	
	public Product(int price) {
		super();
		this.price = price;
	}

	public Product(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[" + title + ", " + price + "]"	;
			}
	
}
