/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;

//import java.io.Serializable;


public class Expense {
    private String eName;
    private int eValue;
    
    public Expense (String Name, int Value) {
		eName = Name;
		eValue = Value;
	}
	
	public String getName () {
		return eName;
	}
	
	public int getValue () {
		return eValue;
	}
	
	public String toString () {
		return eName +",    $" +eValue;
	}
        
//        public String toSave () {
//		return eName +"," +eValue;
//	}
        
}
