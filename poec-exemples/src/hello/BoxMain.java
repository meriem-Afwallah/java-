package hello;

public class BoxMain {

	public static void main(String[] args) {
		Box<Article> b = new Box<Article>();
		Box<String> b2 = new Box<>();// inferance de type: 
		
		b.setElements(new Article("article", 10));
		b2.setElements("string");
	}

}
