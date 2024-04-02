package ui.bad;

public class Femme extends Humain {
	
	 public Femme(String nom, String prenom, int age) {
	        super(nom, prenom, age); // Appel au constructeur de la classe parente Humain
	    }
	public static void main(String[] args) {
		Femme vao= new Femme("vao","soa",14);
		Homme koto= new Homme("koto", "rabe",15);
		
		vao.ami(koto, 100);
	}
}
