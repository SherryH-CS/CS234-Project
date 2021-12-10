/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;

//import java.io.Serializable;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Budget {
    private String bName;
    private String bDescription;
    private int estimate;
    private String estDate;
    private ArrayList <Expense> exp; 
    private ArrayList <Payment> pay;
        
    public Budget (String Name, String Description, int Est, String Date) {
		bName = Name;
		bDescription = Description;
		estimate = Est;
		estDate = Date;	
		exp = new ArrayList <>();
		pay = new ArrayList <>();
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
        
//        public String toSave () {
//		return bName +"," +bDescription + "," +estimate + "," +estDate;
//	}
        
/*
* Prints budget information (Name, Description, Estimate, EstDate)
*/	
	public String budReport() {
		return bName +",    " +bDescription +",    $" +estimate +",   " +estDate;	
	}

/*
* Adds expense object to exp 
* @param m expense
*/
	public void addExpense (Expense m) {
		exp.add(m);
	}
	        
/*
* Removes expense object from exp 
* @param m expense name
*/        
        public void removeExp(String m) {
            boolean e1 = false;
            for (int x = 0; x < exp.size(); x++) {
                if (exp.get(x).getName().equalsIgnoreCase(m)) {
		exp.remove(x);
                e1 = true;
                } 
            }
            if (e1 != true) {
                 JOptionPane.showMessageDialog(null, "Expense not found.");
            }
        }
        
/*
* Modifies expense object from exp
* @param m expense name
* @param n edited expense 
*/         
        public void modifyExp(String m, Expense n) {
            boolean e2 = false;
            for (int x = 0; x < exp.size(); x++) {
                if (exp.get(x).getName().equalsIgnoreCase(m)) {
                    exp.set(x, n);
                    e2 = true;
                }
            }
            if (e2 != true) {
                JOptionPane.showMessageDialog(null, "Expense not found.");
            }
        }
        
/*
* Prints expense information (Name, Value)
*/
        public String getExps () {
            String s = "";
           for (int x = 0; x < exp.size(); x++) {
		s += exp.get(x).toString() +"\n";							
		} 
           return s;
        }

/*
* Adds payment object to pay 
* @param m payment name
*/
	public void addPayment(Payment m) {
		pay.add(m);
	}        
        
/*
* Removes payment object from pay
* @param m payment name
*/        
        public void removePay(String m) {
            boolean e1 = false;
            for (int x = 0; x < pay.size(); x++) {
                if (pay.get(x).getName().equalsIgnoreCase(m)) {
		pay.remove(x);
                e1 = true;
                } 
            }
            if (e1 != true) {
                 JOptionPane.showMessageDialog(null, "Payment not found.");
            }
        }
        
/*
* Modifies payment object from pay 
* @param m payment name
* @param n edited payment 
*/         
        public void modifyPay(String m, Payment n) {
            boolean e2 = false;
            for (int x = 0; x < pay.size(); x++) {
                if (pay.get(x).getName().equalsIgnoreCase(m)) {
                    pay.set(x, n);
                    e2 = true;
                }
            }
            if (e2 != true) {
                JOptionPane.showMessageDialog(null, "Payment not found.");
            }
        }      
        
/*
* Prints payment information (Name, Value, Pay date)
*/
        public String getPays () {
            String t = "";
            for (int x = 0; x < pay.size(); x++) {
                t += pay.get(x).toString() +"\n";							
		}
            return t;
        }        

/*
* Adds all the expense values
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
* Adds all the payments and subtracts total expense to find profit
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
        
/*
* Prints budget details (exps, total exp, payments, profit)
*/        
        public String BudDetails () {
            String s = "";
            if (exp.isEmpty()&&pay.isEmpty()) {
                s += "No Information";
            }
            else {
            s += "Expenses:" +"\n"; 
            s += getExps() +"\n";
            s += "Expense Total:" +"\t" +"$";
            s += getTotExp() +"\n";     
            s += "\n" +"Payments:" +"\n"; 
            s += getPays() +"\n"; 
            s += "Profit:" +"\t" +"$" +getProfit();
            }
        return s;
            }
        
        
        

        
//        public String expFile () {
//            String s = "";
//            while (exp.size() >0) {
//                for (int x = 0; x < exp.size(); x++) {
//                    s += "\t\t" +exp.get(x).toSave() +"\n";
//                }
//            }
//            return s;
//        }
//        
//        public String payFile () {
//            String s = "";
//            while (pay.size() >0) {
//                for (int x = 0; x < pay.size(); x++) {
//                    s += "\t\t\t" +pay.get(x).toSave() +"\n";
//                }
//            }
//            return s;
//        }
        
}
