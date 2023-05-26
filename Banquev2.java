
public class Banquev2 {

	public static void main(String args[]) {

/*		Compte c = new Compte("Aude Javell", 101, 1000);
		CompteDepot cd = new CompteDepot(103, "Jacques Célair", 200);
		CompteEpargne ce = new CompteEpargne(102, "Aude Javell", 2.5, 100);
		
		c.operation(-150.99);
		cd.operation(-49.99);
		
		c.editerReleve();
		System.out.println("---------------");
		cd.editerReleve();
		System.out.println("---------------");
		ce.editerReleve();
*/		
		Compte[] comptes = new Compte[10];
		
		Compte cs = new Compte(104);
		comptes[3] = cs;
		
		Compte c = new CompteDepot(101, "Jacques Célair", 0);
	
		comptes[0] = new CompteDepot(102, "Aude Javell", 1000);
		comptes[1] = new CompteEpargne(103, "Jacques Célair", 1.5, 200);
		comptes[2] = c;
		
		comptes[0].operation(-49.99);
		comptes[2].operation(2500);
		c.operation(-87.23);
		
		for (int i = 0; i < 4 ; i++) {
			comptes[i].editerReleve();
			System.out.println("---------");
		}
		
		c.editerReleve();
	}

}
