

public class Compte {

	// Attributs
	protected int numeroCompte ; // Identifiant unique attribué à chaque compte bancaire
	protected double solde ; // protected pour être accessible par les classes dérivées
	protected String identite;

	// Constructeur qui crée un compte sans connaître le titulaire, avec un solde à 0, et qui génère un numéro de compte automatiquement
	public Compte (int num) {

		// Allocation d'un numéro de compte différent pour chaque compte en utilisant le compteur static de comptes
		numeroCompte = num ;
		solde = 0 ;
		identite = "";
    }

	// Constructeur qui crée un compte dont le titulaire est passé en paramètre, avec un solde à 0, et qui génère un numéro de compte automatiquement
	public Compte (String id, int num) {

		// Allocation d'un numéro de compte différent pour chaque compte en utilisant le compteur static de comptes
		numeroCompte = num ;
		solde = 0 ;
		identite = id;
    }

	
	// Constructeur qui crée un compte dont le titulaire est passé en paramètre, à partir d'un montant déposé et qui génère un numéro de compte automatiquement
	public Compte (String id, int num, double montantDepose) {

		numeroCompte = num ;
		solde = montantDepose ;  
		identite = id;
    }

    public int numeroCompte () {
		return numeroCompte ;
    }
    
    // Effectue une opération sur un objet CompteDepot (débit ou crédit selon le signe du paramètre réel)    
    public void operation (double montant) {
    	this.solde = this.solde + montant;
    }

	// Edite un relevé de compte
	public void editerReleve() {
		System.out.println("Le solde du compte n°" + numeroCompte + ", de M/Mme " + identite + ", est de : " + solde + " euros...");
	}

}
