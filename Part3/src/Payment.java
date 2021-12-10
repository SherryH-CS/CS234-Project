/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;


public class Payment extends Expense {
    private String payDate;
    
    public Payment (String Name, int Value, String Date) {
		super (Name, Value);
		payDate = Date;
	}
	
	public String toString () {
		return super.toString() +"	Paid on: " +payDate;
	}
        
//        public String toSave () {
//		return super.toSave() +"," +payDate;
//	}
        
}
