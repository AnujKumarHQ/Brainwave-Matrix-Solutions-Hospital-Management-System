
package hospitalmanagment;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    public int i=0;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(974, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/two arrow.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(250, 59));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, 70, 46));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/add diag.png"))); // NOI18N
        jButton2.setText("Add Diagnosis Information");
        jButton2.setPreferredSize(new java.awt.Dimension(259, 59));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 162, 251, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/add new patient.png"))); // NOI18N
        jButton3.setText("Add New Patient Record");
        jButton3.setPreferredSize(new java.awt.Dimension(259, 59));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 87, 251, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/rsz_history1.png"))); // NOI18N
        jButton4.setText("Full History Of The Patient");
        jButton4.setPreferredSize(new java.awt.Dimension(259, 59));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 235, 251, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/rsz_update_details.png"))); // NOI18N
        jButton5.setText("Update Patient Record");
        jButton5.setPreferredSize(new java.awt.Dimension(259, 57));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 312, 251, 59));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/rsz_hospital_information.png"))); // NOI18N
        jButton6.setText("Hospital Information");
        jButton6.setPreferredSize(new java.awt.Dimension(259, 59));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 389, 251, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/exit.png"))); // NOI18N
        jButton8.setText("Logout");
        jButton8.setPreferredSize(new java.awt.Dimension(259, 59));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 466, 251, -1));
        jButton8.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagment/background for the menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ( i == 0){
            jButton2.setLocation(110,30);
            jButton3.setLocation(370,30);
            jButton4.setLocation(630,30);
            jButton5.setLocation(890,30);
            jButton6.setLocation(1150,30);
            jButton8.setLocation(1150,89);
            i=1;
        }
        else{
            jButton2.setLocation(10,107);
            jButton3.setLocation(10,184);
            jButton4.setLocation(10,261);
            jButton5.setLocation(10,338);
            jButton6.setLocation(10,415);
            jButton8.setLocation(10,490);
            i=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new AddDIagnosisInformation().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AddNewPatient().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new LOGIN().setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    new UpdatePatientRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    new FullHistoryOfTthePatient().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    new hospitalInformation().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
