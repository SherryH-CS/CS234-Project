/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;


public class AccountGui extends javax.swing.JFrame {

    /**
     * Creates new form AccountGui
     */
    public AccountGui() {
        initComponents();
        update ();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        clientListing = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileA = new javax.swing.JMenu();
        load = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        editA = new javax.swing.JMenu();
        addC = new javax.swing.JMenuItem();
        removeC = new javax.swing.JMenuItem();
        modifyC = new javax.swing.JMenuItem();
        budAccess = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clients");

        clientListing.setColumns(20);
        clientListing.setRows(5);
        jScrollPane2.setViewportView(clientListing);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        fileA.setText("File");

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        fileA.add(load);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        fileA.add(save);

        jMenuBar1.add(fileA);

        editA.setText("Menu");

        addC.setText("Add Client");
        addC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCActionPerformed(evt);
            }
        });
        editA.add(addC);

        removeC.setText("Remove Client");
        removeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCActionPerformed(evt);
            }
        });
        editA.add(removeC);

        modifyC.setText("Modify Client");
        modifyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCActionPerformed(evt);
            }
        });
        editA.add(modifyC);

        budAccess.setText("Budget Information");
        budAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budAccessActionPerformed(evt);
            }
        });
        editA.add(budAccess);

        jMenuBar1.add(editA);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 576, 410);
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Add client window
    */
    private void addCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCActionPerformed
        new AddClientGui().setVisible(true);
    }//GEN-LAST:event_addCActionPerformed

    /*
    * Remove client window
    */
    private void removeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCActionPerformed
        new RemoveClientGui().setVisible(true);
    }//GEN-LAST:event_removeCActionPerformed

    /*
    * Modify client window
    */
    private void modifyCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCActionPerformed
        new ModifyClientGui().setVisible(true);
    }//GEN-LAST:event_modifyCActionPerformed

    /*
    * Access budget window
    */
    private void budAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budAccessActionPerformed
        new AccessBudgetGui().setVisible(true);
    }//GEN-LAST:event_budAccessActionPerformed

    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
//        Account.saveRecord ();
    }//GEN-LAST:event_saveActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        //Account.loadRecord ();
    }//GEN-LAST:event_loadActionPerformed

    /*
    * updates client display window
    */
    public static void update () {
        clientListing.setText(Account.ClientList ());        
    }
    
    /**
     * Main method for program
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        Client client1 = new Client ("Sherry H","972-755-7483","1024 White Oak Dr. 88101");
        Account.addClient(client1);
        Budget bud1 = new Budget ("Car","Body Work",500,"11/13/21");
        client1.addBudget(bud1);
        Expense exp1 = new Expense ("Quote",20);
        bud1.addExpense(exp1);
        
        Budget bud2 = new Budget ("Roof","Re-shingle",1000,"01/19/20");
        client1.addBudget(bud2);
        Payment pay1 = new Payment ("Down",100,"11/18/21");
        bud2.addPayment(pay1);
        Budget bud3 = new Budget ("Carpet","Patch",100,"07/05/17");
        client1.addBudget(bud3);
        
        Client client2 = new Client ("John Smith","575-222-3344","100 Circle Rd. 88103");
        Account.addClient(client2);
        Budget bud4 = new Budget ("Landscaping","Stump removal",250,"05/23/18");
        client2.addBudget(bud4);
        Expense exp2 = new Expense ("Quote",20);
        bud4.addExpense(exp2);
        Expense exp3 = new Expense ("Removal",75);
        bud4.addExpense(exp3);
        Payment pay2 = new Payment ("Full",250,"06/01/18");
        bud4.addPayment(pay2);
        
        Client client3 = new Client ("Adam West","903-555-7878","2603 136 St. 88101");
        Account.addClient(client3);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountGui().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addC;
    private javax.swing.JMenuItem budAccess;
    private static javax.swing.JTextArea clientListing;
    private javax.swing.JMenu editA;
    private javax.swing.JMenu fileA;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem load;
    private javax.swing.JMenuItem modifyC;
    private javax.swing.JMenuItem removeC;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables

   }
