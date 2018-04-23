package hello;


public class PersonneMain {

	public static void main(String[] args, int age) {
		// en dessous : une instruction qui a 
		// créer un objet de type personne
		Personne p1 = new Personne("bob","l'eponge",4); 
		
		System.out.println(p1);

		// p1.prenom = "Bob";
		// p1.setPrenom("Bob");
		
		// System.out.println(p1.prenom);
		String prenom = p1.getPrenom();
		System.out.println(p1.getPrenom());
		
		//p1.nom = "L'éponge"
		// p1.setNom("L'éponge");
		System.out.println(p1.getNom());
		System.out.println(p1.getAge());
	
		// fullname => prenom + " " + nom
		System.out.println(p1.getFullname());
		
		Personne p2 = new Personne(null, null, 0);
		System.out.println(p2);
		System.out.println(p2.getPrenom());
		System.out.println(p2.getNom());
		System.out.println(p2.getAge());
	}

}
