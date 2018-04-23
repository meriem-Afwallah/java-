package hello;

public class ControlStatements {

	public static void main(String[] args) {

		String a = "spanish";
		
		if(a == "french") {
			System.out.println("bonjour");
		} else if (a == "english") {
			System.out.println("hello");
		} else if (a == "italian") {
			System.out.println("buongiorno");
		} else {
			System.out.println(":-)");
		}
		
		System.out.println("- the end -");
	}

}
