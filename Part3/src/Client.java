/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Client {
    private String cName;
    private String cNumber;
    private String cAddress;
    private  ArrayList <Budget> bud;

    public Client (String Name, String Phone, String Address) {
		cName = Name;
		cNumber = Phone;
		cAddress = Address;
                bud = new ArrayList <>();
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
        
//        public String toSave () {
//            return cName +"," +cNumber + "," +cAddress;
//        }
        
/*
* Prints Client information (Name, Phone number, Address)
*/
	public String clientReport() {
		return cName +",    " +cNumber +",  " +cAddress;
	}

/*
* Access exp/pay objects 
* @param m budget name
*/
	public void accessExpPay(String m) {
            boolean e3 = false;
            for (int x = 0; x < bud.size(); x++) {
		if (bud.get(x).getName().equalsIgnoreCase(m)) {
                    e3 = true;
                    Budget temp = bud.get(x);
                    new BudgetGui(temp).setVisible(true);
                }	
            }
		if (e3 != true) {
                    JOptionPane.showMessageDialog(null, "Budget not found.");
            }
	}
        
/*
* Adds budget object to bud 
* @param a budget 
 */
	public void addBudget(Budget a) {
		bud.add(a);
	}

/*
* Removes budget object from bud 
* @param m budget name
*/        
        public void removeBudget(String m) {
            boolean e1 = false;
            for (int x = 0; x < bud.size(); x++) {
                if (bud.get(x).getName().equalsIgnoreCase(m)) {
		bud.remove(x);
                e1 = true;
                } 
            }
            if (e1 != true) {
                 JOptionPane.showMessageDialog(null, "Budget not found.");
            }
        }
        
/*
* Modifies budget object from bud 
* @param m budget name
* @param n edited budget 
*/         
        public void modifyBudget(String m, Budget n) {
            boolean e2 = false;
            for (int x = 0; x < bud.size(); x++) {
                if (bud.get(x).getName().equalsIgnoreCase(m)) {
                    bud.set(x, n);
                    e2 = true;
                }
            }
            if (e2 != true) {
                JOptionPane.showMessageDialog(null, "Budget not found.");
            }
        }
        
/*
* Returns Budget Listing, displayed in txtField 
*/         
        public String BudgetList () {
            String s = "";
            if (bud.isEmpty()) {
               s = "No Budgets";
            }
            else {
            for (int x = 0; x < bud.size(); x++) { 												
            s += bud.get(x).budReport() +"\n";
                }
            }
        return s;
        }
        
//        public String budFile () {
//            String s = "";
//            while (bud.size() >0) {
//                for (int x = 0; x < bud.size(); x++) {
//                    s += "\t" +bud.get(x).toSave() +"\n";
//                    s += bud.get(x).expFile();
//                    s += bud.get(x).payFile();
//                }
//            }
//            return s;
//        }
        
}
