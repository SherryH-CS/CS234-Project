/*Sherry Hayes
 *Project Part 2
 *Computer Science II - CS234 */


import java.util.ArrayList;
import java.util.Scanner;

public class Budget {
	private String bName;
	private String bDescription;
	private int estimate;
	private String estDate;
	private ArrayList <Expense> exp; 
	private ArrayList <Payment> pay;

/*
Constructor receives parameters and initializes bud
@param Name. budget name.
@param Description. budget description 
@param Est. budget estimate
@param Date. date budget estimate was submitted/created
*/		
	public Budget (String Name, String Description, int Est, String Date) {
		bName = Name;
		bDescription = Description;
		estimate = Est;
		estDate = Date;	
		exp = new ArrayList <Expense>();
		pay = new ArrayList <Payment>();
	}
	
/*
Initiates exp/pay menu
*/	
	public void menu () {
	    Scanner in = new Scanner (System.in);

		while (true) { 
	// Menu Prompt
			System.out.println("	Expense/Payment Menu" +"\n"
					  +"A)dd R)emove M)odify P)rint Budget info. " +"\n"
					  +"	B)udget menu or Q)uit");
			String i = in.nextLine();
			switch (i.toLowerCase()) {
	// Add
			case ("a"):
	// Exp/Pay choice Prompt
				System.out.println("Add E)xpense or P)ayment");
				String o = in.nextLine();

				switch (o.toLowerCase()) {
					case ("e"):
				//Expense case
						System.out.println("Enter expense name: ");
						String j = in.nextLine();
						System.out.println("Enter expense value: ");
						int k = in.nextInt();
						in.nextLine();
						Expense e1 = new Expense(j,k);
						addExpense(e1);
						break;
						
					case ("p"):
				//Payment case
						System.out.println("Enter payment name: ");
						String l = in.nextLine();
						System.out.println("Enter payment value: ");
						int m = in.nextInt();
						in.nextLine();
						System.out.println("Enter payment date: i.e. MM/DD/YYYY");
						String n = in.nextLine();
						Payment p1 = new Payment(l,m,n);
						addPayment(p1);
						break;
				// Exp/Pay Error				
					default :
						System.out.println("Not a vaild option.");
						break;	
				}
				break;
	// Remove				
			case ("r"): 
	// Exp/Pay choice Prompt
				System.out.println("Remove E)xpense or P)ayment");
				String u = in.nextLine();
				
					switch (u.toLowerCase()) {
					case ("e"):
				//Expense case
						System.out.println("Enter expense name: ");
						String j = in.nextLine();
						boolean e1 = false;
						for (int x = 0; x < exp.size(); x++) {
							if (exp.get(x).getName().equalsIgnoreCase(j)) {
								exp.remove(x);
								e1 = true;
							}	
						}
						if (e1 != true) {
							System.out.println("No expense found.");
						}
						break;
						
					case ("p"):
				//Payment case
						System.out.println("Enter payment name: ");
						String l = in.nextLine();
						boolean e2 = false;
						for (int x = 0; x < pay.size(); x++) {
							if (pay.get(x).getName().equalsIgnoreCase(l)) {
								pay.remove(x);
								e2 = true;
							}	
						}
						if (e2 != true) {
							System.out.println("No payment found.");
						}
						break;
				// Exp/Pay Error				
					default :
						System.out.println("Not a vaild option.");
						break;	
					}
				break;
	// Modify				
			case ("m"): 
	// Exp/Pay choice Prompt
				System.out.println("Modify E)xpense or P)ayment");
				String e = in.nextLine();
				
					switch (e.toLowerCase()) {
				//Expense case		
					case ("e"):
						System.out.println("Enter expense name: ");
						String j = in.nextLine();
						System.out.println("Enter expense value: ");
						int k = in.nextInt();
						in.nextLine();
						Expense e1 = new Expense(j,k);
						boolean e3 = false;
						for (int x = 0; x < exp.size(); x++) {
							if (exp.get(x).getName().equalsIgnoreCase(j)) {
								exp.set(x, e1);
								e3 = true;
							}
						}
						if (e3 != true) {
							System.out.println("No expense found.");
						}
						break;
						
					case ("p"):
				//Payment case
						System.out.println("Enter payment name: ");
						String l = in.nextLine();
						System.out.println("Enter payment value: ");
						int m = in.nextInt();
						in.nextLine();
						System.out.println("Enter payment date: ");
						String n = in.nextLine();
						Payment p1 = new Payment(l,m,n);
						boolean e4 = false;
						for (int x = 0; x < pay.size(); x++) {
							if (pay.get(x).getName().equalsIgnoreCase(l)) {
								pay.set(x, p1);
								e4 = true;
							}
						}
						if (e4 != true) {
							System.out.println("No payment found.");
						}
						break;
				// Exp/Pay Error				
					default :
						System.out.println("Not a vaild option.");
						break;	
					}
				break;
	// Print				
			case ("p"):
				budReport();
				System.out.println("Expenses: ");
				for (int x = 0; x < exp.size(); x++) {		
					System.out.println();
					System.out.println(exp.get(x).toString());							
				}
				System.out.println("\n" +"Expense Total: $" +getTotExp() +"\n");
				System.out.println("Payments:");
				for (int x = 0; x < pay.size(); x++) {		
					System.out.println();
					System.out.println(pay.get(x).toString());							
				}
				System.out.println("\n" +"Profit: $" +getProfit());
				break;
	// Go to previous menu
			case ("b"):
				Client.menu();
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
	
	
	public String getName () {
		return bName;
	}
	
	public String getDscp () {
		return bDescription;
	}
	
	public int getEst () {
		return estimate;
	}
	
	public String getEstDate () {
		return estDate;
	}
	
/*
Prints budget information (Name, Description, Estimate, EstDate)
*/	
	public void budReport() {
			System.out.println(getName() +"\n");
			System.out.println(getDscp() +"\n");
			System.out.println(getEst() +"\n");
			System.out.println(getEstDate() +"\n");		
	}

/*
Adds expense object to exp 
*/
	public void addExpense (Expense m) {
		exp.add(m);
	}
	
/*
Adds payment object to pay 
*/
	public void addPayment(Payment m) {
		pay.add(m);
	}

/*
Adds all the expense values
*/	
	public int getTotExp () {
		int total = 0;
	    for (int i=0; i<exp.size(); i++)
	    {
	        total += exp.get(i).getValue();
	    }
		return total;
	}

/*
Adds all the payments and subtracts total expense to find profit
*/
	public int getProfit() {
		int totPay = 0;
	    for (int i=0; i<pay.size(); i++)
	    {
	        totPay += pay.get(i).getValue();
	    }
	    int totExp = getTotExp();
	    int profit = totPay - totExp;
	    return profit;
	}


}
