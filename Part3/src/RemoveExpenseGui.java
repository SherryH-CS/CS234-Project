/*
 * Sherry Hayes
 * Project - Part 3
 * Computer Science - CS 234
 */
package com.mycompany.csiiproject;


public class RemoveExpenseGui extends javax.swing.JFrame {
    private Budget temp;
    
    /**
     * Creates new form RemoveExpenseGui
     */
    public RemoveExpenseGui(Budget x) {
        initComponents();
        temp = x;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removeExpbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtExpName = new javax.swing.JTextField();

        setTitle("Remove Expense");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeExpbtn.setText("Remove Expense");
        removeExpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeExpbtnActionPerformed(evt);
            }
        });
        getContentPane().add(removeExpbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel1.setText("Expense Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        getContentPane().add(txtExpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 20));

        setBounds(0, 0, 419, 340);
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Remove expense window
    */
    private void removeExpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeExpbtnActionPerformed
        String a = txtExpName.getText().trim();
        temp.removeExp(a);
        this.setVisible(false);
        BudgetGui.update(temp);
    }//GEN-LAST:event_removeExpbtnActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveExpenseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveExpenseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveExpenseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveExpenseGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RemoveExpenseGui().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeExpbtn;
    private javax.swing.JTextField txtExpName;
    // End of variables declaration//GEN-END:variables
}
