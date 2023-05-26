
public class CompteDepot extends Compte {

	// Déclaration d'un tableau pour stocker les dernières opérations
	private double[] operations  ;
	private int nbreOperations ;

	// Constructeurs
	public CompteDepot (int num) {

		// Appel du constructeur de la super classe
		super(num);
		operations = new double [1000] ;
		nbreOperations = 0;
	}

	public CompteDepot (int num, String id, double montantDepose) {

		// Appel du constructeur de la super classe
		super(id, num, montantDepose);
		operations = new double [1000] ;
		nbreOperations = 0;
		operations[nbreOperations] = montantDepose;
		nbreOperations++;
	}
	
	 
	/** 
	 * Redéfinition de la méthode opération dans la classe CompteDepot
	 * @param montant représente le montant de l'opération réalisée
	 */
	public void operation ( double montant ) {
           
		// Enregistrement de l'opération et incrémentation du nombre d'opérations
		operations[ nbreOperations ] = montant ;
		nbreOperations++ ;
		//solde+=montant;
		super.operation(montant); // Equivalent à l'instruction précédente, appel de la méthode opération définie dans la super-classe
	}

	/** 
	 * Redéfinition de la méthode opération dans la classe CompteDepot pour afficher les opérations réalisées
	 * @param montant représente le montant de l'opération réalisée
	 */
	public void editerReleve() {

		System.out.println("Compte numéro : " + numeroCompte );
		System.out.println("solde : " + solde );
		System.out.println("titulaire : " + identite);
		System.out.println("type du compte : " + this.getClass().getSimpleName());

		System.out.println("Liste des opérations : ");
		for (int i = 0; i < nbreOperations; i++) {
			System.out.println(operations [i]) ;
		}
	}
	
	/**
	 * Sert à redéfinir l'affichage avec la méthode print pour les objets de type CompteDepot
	 * @return renvoie la chaine à afficher pour ce type d'objets
	 */
	public String toString() {
		return "Solde du compte : " + solde;
	}
}
