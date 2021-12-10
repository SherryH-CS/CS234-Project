/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.Serializable;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Account {
    private static final ArrayList <Client> accounts = new ArrayList <Client>(); 
//    static String fileLocation = "roladex.txt";
    
    public Account () {
		 
	}
    
    
/*
* Access budget objects
* @param m Client name
*/
	public static void accessBudget(String m) {
            boolean e3 = false;
            for (int x = 0; x < accounts.size(); x++) {
		if (accounts.get(x).getName().equalsIgnoreCase(m)) {
                    e3 = true;
                    Client temp = accounts.get(x);
                    new ClientGui(temp).setVisible(true);

                }	
            }
		if (e3 != true) {
                    JOptionPane.showMessageDialog(null, "Client not found.");
            }
	}
        
/*
* Adds client object to accounts 
* @param m Client
*/
	public static void addClient(Client m) {
		accounts.add(m);
	}
        
/*
* Removes client object from accounts 
* @param m Client name
*/        
        public static void removeClient(String m) {
            boolean e1 = false;
            for (int x = 0; x < accounts.size(); x++) {
                if (accounts.get(x).getName().equalsIgnoreCase(m)) {
		accounts.remove(x);
                e1 = true;
                } 
            }
            if (e1 != true) {
                 JOptionPane.showMessageDialog(null, "Client not found.");
            }
        }
        
/*
* Modifies client object from accounts 
* @param m Client name
* @param n current Client 
*/         
        public static void modifyClient(String m, Client n) {
            boolean e2 = false;
            for (int x = 0; x < accounts.size(); x++) {
                if (accounts.get(x).getName().equalsIgnoreCase(m)) {
                    accounts.set(x, n);
                    e2 = true;
                }
            }
            if (e2 != true) {
                JOptionPane.showMessageDialog(null, "Client not found.");
            }
        }
        
/*
* Returns Client Listing, displayed in txtField 
*/         
        public static String ClientList () {
            String s = "";
            if (accounts.isEmpty()) {
               s = "No Clients";
            }
            else {
            for (int x = 0; x < accounts.size(); x++) { 												
            s += accounts.get(x).clientReport() +"\n";
                }
            }
        return s;
        }
        
    }
        
//        public static void saveRecord () {
//            try {
//                String s = "";
//                while (accounts.size()>0) {
//                    for (int w = 0; w < accounts.size(); w++) {
//                        s += accounts.get(w).toSave() +"\n";
//                        s += accounts.get(w).budFile();
//                    }                    
//                }
//                                                        
//                FileWriter w = new FileWriter(fileLocation);
//                BufferedWriter writer = new BufferedWriter(w);
//                writer.write(s);
//                //writer.newLine();
//                writer.close();
//            } 
//            catch (FileNotFoundException e) {
//                JOptionPane.showMessageDialog(null, "File error!");
//            } 
//            catch (IOException e) {
//                JOptionPane.showMessageDialog(null, "File error!");
//            }
//        }
        
        
//        public static void loadRecord () {
//            try {
//               
//            }
//            catch (FileNotFoundException e) {
//                JOptionPane.showMessageDialog(null, "File error!");
//            }
//            catch (IOException e) {
//                JOptionPane.showMessageDialog(null, "File error!");
//            }
//            catch (ClassNotFoundException e) {
//                JOptionPane.showMessageDialog(null, "File error!");
//            }
//        }


