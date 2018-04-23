package hello;

public class Personne {
	// variables d'instance
	// instance fields 
	private String  prenom;
	private String nom;
	private int age;
	
	public Personne(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	//méthodes
	public String getFullname() {
		
		return prenom +" "+ nom;
	}
	public String getPrenom() {
	
		return prenom;
	}
	public void setPrenom(String nouveauPrenom){
		
		this.prenom = nouveauPrenom;
		
	}
	public String getNom() {

		return nom;
		
	}
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
