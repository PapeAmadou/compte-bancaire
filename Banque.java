
public class Banque {
	
	public static void main(String args[]) {
		
		Compte c1 = new Compte("Aline Héa",101);
		Compte c2 = new Compte("Jean Peuplus",302, 250);
//		CompteDepot cd = new CompteDepot(102, "Dupont", 300);
		
		c1.operation(100);
		c2.operation(-39.99);
		c1.operation(-19);
//		cd.operation(-121);
//		cd.operation(25);
				
		c1.editerReleve();
		c2.editerReleve();
//		cd.editerReleve();
	}
}
