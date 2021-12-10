/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;


public class AccessBudgetGui extends javax.swing.JFrame {

    /**
     * Creates new form BudInfoGui
     */
    public AccessBudgetGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewBbtn = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();

        setTitle("Budget Access");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBbtn.setText("View Budgets");
        ViewBbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBbtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jlabel1.setText("Client Name:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));
        getContentPane().add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Method to search for budget
     */
    private void ViewBbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBbtnActionPerformed
        Account.accessBudget(txtCName.getText().trim());
	this.setVisible(false);
    }//GEN-LAST:event_ViewBbtnActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(AccessBudgetGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessBudgetGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessBudgetGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessBudgetGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AccessBudget().setVisible(true);
//            }
//        });
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AccessBudgetGui().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBbtn;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField txtCName;
    // End of variables declaration//GEN-END:variables
}
