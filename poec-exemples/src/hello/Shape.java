package hello;

public interface Shape {
	// les methodes d'une interface sont publiques par defaut 
	double calcArea();

	//depuis java 8
	//default double calcArea(){
	// }
	//return 0 ;
}
