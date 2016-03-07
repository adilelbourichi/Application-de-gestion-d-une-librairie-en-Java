
public class Application {
	
	static Transaction [] toutesLesTransactions;
	
	static int nombreDesTransactions;
	
	public static void main(String[] args) {
		
		nombreDesTransactions = 0;
		
		toutesLesTransactions = new Transaction[100];
        
		Livre l1 = new Livre(9356978561012L, "Origine des Especes", "Fr", "Charles Darwin", 10.50);
		
		Livre l2 = new Livre(9758415604410L, "Les Miserables", "Fr", "Victor Hugo", 8.65);
		
		Client c1 = new Client(750100500, "Adil", "Philosopher");
		
		Transaction t1 = new Transaction(l1, c1);
		
		ajouterTransaction(t1);
		
		Transaction t2 = new Transaction(l2, new Client());
		
		Application app = new Application();
		
		app.AfficherToutesLesTransactions(); //afficher toutes les transactions
		
	}

	private static void ajouterTransaction(Transaction t1) {
		// TODO Auto-generated method stub
		
	}

	void AfficherToutesLesTransactions() {
		
	}

}
