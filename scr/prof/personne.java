package prof;

public class personne {
	private String Nom;
	private String Prenom;
	
	public personne () {
		Prenom = "Laurence";
		Nom = "Ago";
	}
	
	public personne( String nom) {
		Prenom = "lolo";
		this.Nom = nom;
	}
	
	public personne(String prenom, String nom) {
		this.Prenom = prenom;
		this.Nom = nom;
	}
	
	public String getNom () {
		return Nom;
	}
	
	public String getPrenom () {
		return Prenom;
	}
}
