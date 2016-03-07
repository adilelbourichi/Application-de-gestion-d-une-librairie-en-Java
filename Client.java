
public class Client {

	int id;
	String prenom;
	String nom;
	
	Client(int id, String prenom, String nom){
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	Client(){
		this.id = 0;
		this.prenom = "anonyme";
		this.nom = "anonyme";
	}
}
