package ui.bad;

public class Humain {

	private String nom;
	private String prenom;
	private int age;

	 public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void details() {
	        System.out.println("Nom : " + nom+ "Prénom : " + prenom+"Âge : " + age);
	       
	    }
	public String toString() {
        return "Nom : " + nom + "\nPrénom : " + prenom + "\nÂge : " + age;
    }
	public void manger() {
		 System.out.println("mange");
	}
	public void boire() {
		 System.out.println("boire");
	}
	
}
