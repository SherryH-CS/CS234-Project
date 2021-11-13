/*Sherry Hayes
 *Project Part 2
 *Computer Science II - CS234 */


import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	private String cName;
	private String cNumber;
	private String cAddress;
	private static ArrayList <Budget> bud; 
	
/*
Constructor receives parameters and initializes bud
@param Name. client name.
@param Phone. client phone number.
@param Address. client address.
*/		
	public Client (String Name, String Phone, String Address) {
		cName = Name;
		cNumber = Phone;
		cAddress = Address;
		bud = new ArrayList <Budget>();
	}
	
/*
Initiates budget menu
*/
	public static void menu () {
		Scanner in = new Scanner (System.in);

		while (true) { 
	// Menu Prompt			
			System.out.println("			Budget Menu" +"\n"
					  +"A)dd Budget R)emove Budget M)odify Budget P)rint Budget info." +"\n"
					  +" B)udget list E)xpense/Payment info. C)lient menu or Q)uit");
			String i = in.nextLine();
			switch (i.toLowerCase()) {
	// Add
			case ("a"):
					System.out.println("Enter budget name: ");
					String l = in.nextLine();
					System.out.println("Enter budget description: ");
					String m = in.nextLine();
					System.out.println("Enter estimate: ");
					int n = in.nextInt();
					in.nextLine();
					System.out.println("Enter estimate date: i.e. MM/DD/YYYY");
					String o = in.nextLine();
					Budget b1 = new Budget(l,m,n,o);
					addBud(b1);
					break;
	// Remove				
				case ("r"):
					System.out.println("Enter budget name: ");
					String p = in.nextLine();
					boolean e1 = false;
					for (int x = 0; x < bud.size(); x++) {
						if (bud.get(x).getName().equalsIgnoreCase(p)) {
							bud.remove(x);
							e1= true;
						}
					}
					if (e1 != true) {
						System.out.println("No budget found.");
					}
					break;
	// Modify				
				case ("m"):
					System.out.println("Enter budget name: ");
					String a = in.nextLine();
					System.out.println("Enter budget description: ");
					String b = in.nextLine();
					System.out.println("Enter estimate: ");
					int c = in.nextInt();
					in.nextLine();
					System.out.println("Enter estimate date: i.e. MM/DD/YYYY");
					String d = in.nextLine();
					boolean e2 = false;
					Budget b2 = new Budget(a,b,c,d);
					for (int x = 0; x < bud.size(); x++) {
						if (bud.get(x).getName().equalsIgnoreCase(a)) {
							bud.set(x, b2);
							e2 = true;
						}	
					}
					if (e2 != true) {
						System.out.println("No budget found.");
					}
					break;
	// Access Budget expenses/payments				
				case ("e"):
					System.out.println("Enter budget name: ");
					String q = in.nextLine();
					boolean e3 = false;
					for (int x = 0; x < bud.size(); x++) {
						if (bud.get(x).getName().equalsIgnoreCase(q)) {
							bud.get(x).menu();
							e3 = true;
						}	
					}
					if (e3 != true) {
						System.out.println("No budget found.");
					}
					break;
	// Print				
				case ("p"):
					System.out.println("Enter budget name: ");
					String s = in.nextLine();
					boolean e4 = false;
					for (int x = 0; x < bud.size(); x++) {
						if (bud.get(x).getName().equalsIgnoreCase(s)) {
							bud.get(x).budReport();
							e4 = true;
						}	
					}
					if (e4 != true) {
						System.out.println("No budget found.");
					}
					break;
	// Print Client list					
				case ("b"):
					for (int x = 0; x < bud.size(); x++) {		
							System.out.println();
							bud.get(x).budReport();							
					}
					break;
	// Go to previous menu					
				case ("c"):
					Account.menu();
					break;
	// Quit				
				case ("q"):
					System.exit(0);
					break;
	// Error				
				default :
					System.out.println("Not a vaild option.");
					break;	
			}
		}
	}
	
	public String getName () {
		return cName;
	}
	
	public String getNumber () {
		return cNumber;
	}
	
	public String getAddress () {
		return cAddress;
	}
	
/*
Prints Client information (Name, Phone number, Address)
*/
	public void clientReport() {
		System.out.println(getName() +"\n");
		System.out.println(getNumber() +"\n");
		System.out.println(getAddress() +"\n");
	}
	
/*
Adds budget object to bud 
 */
	public static void addBud (Budget a) {
		bud.add(a);
	}

	
}
