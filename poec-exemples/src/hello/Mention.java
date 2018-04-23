package hello;

public class Mention {

	public static void main(String[] args) {

		int note = 200;

		if (note < 10) {
			System.out.println("peut mieux faire");
		} else if (10 <= note && note < 12) {
			System.out.println("passable");
		} else if (12 <= note && note < 14) {
			System.out.println("assez bien");
		} else if (14 <= note && note < 16) {
			System.out.println("bien");
		} else if (16 <= note) {
			System.out.println("très bien");
		}
	}

}
