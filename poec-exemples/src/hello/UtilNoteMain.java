package hello;

public class UtilNoteMain {

	public static void main(String[] args) {
		
		UtilNote utilNote = new UtilNote();
		
		int[] notes = {18, 20, 2, 14, 7, 10};
		
		double moyenne = utilNote.calcMoyenne(notes);

		int min = utilNote.findMin(notes);
		int max = utilNote.findMax(notes);

		System.out.println(moyenne);
		System.out.println(min);
		System.out.println(max);

		int[] notes2 = {1, 2, 3, 4};
		double moyenne2 = utilNote.calcMoyenne(notes2);
		System.out.println(moyenne2);


	}

}
