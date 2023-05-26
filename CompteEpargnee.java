
  
public class CompteEpargne extends Compte {

	// tauxInteret du compte epargne
	private double tauxInteret ;

	// Constructeur (tauxInteret en %)
	public CompteEpargne (int num, double tauxInteret) {

		super (num) ;
		this.tauxInteret = tauxInteret ;
	}
 
	// Constructeur (tauxInteret en %)
	public CompteEpargne (int num, String id, double tauxInt, double montantDepose) {

		super (id, num, montantDepose);
		tauxInteret = tauxInt ;
	}
	
	// Redéfinition de la méthode opération pour empêcher les opérations conduisant à un solde négatif pour les comptes Epargne
	public void operation(double montant) {
		if (solde+montant<0) {
			System.out.println("Le solde du compte n'est pas suffisant pour réaliser cette opération...");
		}
		else {
			// Appel à la méthode opération de la classe mère
			super.operation(montant);
		}
	}
	
	// Edite un relevé de compte
	public void editerReleve() {
		
		System.out.println("Titulaire : " + identite );
		System.out.println("Compte numéro : " + numeroCompte );
		System.out.println("solde : " + solde );
		System.out.println("type du compte : " + this.getClass().getSimpleName());
		System.out.println("Taux d'intérêt : " + tauxInteret +"%");
		
	}      

	// Crédite les intérêts
	public void crediterInterets() {
		
		solde+=solde*tauxInteret/100;
	}

}
