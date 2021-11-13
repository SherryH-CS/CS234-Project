/*Sherry Hayes
 *Project Part 2
 *Computer Science II - CS234 */


import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	private static ArrayList <Client> accounts;
	
/*
Constructor to initialize accounts
*/	
	public Account () {
		accounts = new ArrayList <Client>(); 
	}

/*
Initiates  menu
*/
	public static void menu() {
		Scanner in = new Scanner (System.in);
		while (true) {
	// Prompt			
			System.out.println("			Client Menu" +"\n"
							  +"A)dd Client R)emove Client M)odify Client P)rint Client info." +"\n"
							  +"		C)lient list B)udget info. or Q)uit");
			String i = in.nextLine();
			switch (i.toLowerCase()) {
	// Add	
			case ("a"):
					System.out.println("Enter Client name: ");
					String a = in.nextLine();
					System.out.println("Enter Client phone nuber: i.e. 575-745-9352");
					String b = in.nextLine();
					System.out.println("Enter Client address: i.e. 7241 White Oak Lane Portales, NM");
					String c = in.nextLine();
					Client c1 = new Client(a,b,c);
					addClient(c1);
					break;	
	// Remove					
				case ("r"):
					System.out.println("Enter Client name: ");
					String p = in.nextLine();
					boolean e1 = false;
					for (int x = 0; x < accounts.size(); x++) {
						if (accounts.get(x).getName().equalsIgnoreCase(p)) {
							accounts.remove(x);
							e1= true;
						}
					}
					if (e1 != true) {
						System.out.println("No client found.");
					}
					break;
	// Modify				
				case ("m"):
					System.out.println("Enter Client name: ");
					String l = in.nextLine();
					System.out.println("Enter Client phone nuber: i.e. 972-765-7382");
					String m = in.nextLine();
					System.out.println("Enter Client address: i.e. 7241  White Oak, Clovis, NM");
					String n = in.nextLine();
					Client c2 = new Client(l,m,n);
					boolean e2 = false;
					for (int x = 0; x < accounts.size(); x++) {
						if (accounts.get(x).getName().equalsIgnoreCase(l)) {
							accounts.set(x, c2);
							e2 = true;
						}
					}
					if (e2 != true) {
						System.out.println("No client found.");
					}
					break;
	// Print Client info				
				case ("p"):
					System.out.println("Enter Client name: ");
					String s = in.nextLine();
					boolean e3= false;
					for (int x = 0; x < accounts.size(); x++) {
						if (accounts.get(x).getName().equalsIgnoreCase(s)) {
							accounts.get(x).clientReport();
							e3 = true;
						}	
					}
					if (e3 != true) {
						System.out.println("No client found.");
					}
					break;
	// Access budget menu				
				case ("b"):
					System.out.println("Enter Client name: ");
					String q = in.nextLine();
					boolean e4 = false;
					for (int x = 0; x < accounts.size(); x++) {
						if (accounts.get(x).getName().equalsIgnoreCase(q)) {
							accounts.get(x);
							Client.menu();
							e4 = true;
						}	
					}
					if (e4 != true) {
						System.out.println("No client found.");
					}
					break;
	// Print Client list					
				case ("c"):
					for (int x = 0; x < accounts.size(); x++) {		
							System.out.println();
							accounts.get(x).clientReport();							
					}
					break;
	// Quit				
				case ("q"):
					System.exit(0);
					break;
	// Error					
				default:
					System.out.println("Not a vaild option.");
					break;	
			}
		}	
	}

/*
Adds client object to accounts 
*/
	public static void addClient(Client m) {
		accounts.add(m);
	}
	
	
}
