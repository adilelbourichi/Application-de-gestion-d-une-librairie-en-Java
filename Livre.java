
public class Livre {
    /* proprietes (ou attributs) d'un objet de la classe Livre */ 
	long ISSN;
	String titre;
	String langue;
	String auteur;
	double prix;
	
	public Livre(long ISSN, String titre, String langue, String auteur, double prix) {
		
		this.ISSN = ISSN; // this est une reference sur l'objet en cours
		
	    this.titre = titre;
	    
	    this.langue = langue;
	    
	    this.auteur = auteur;
	    
	    this.prix = prix;
	        
		
	}

}
