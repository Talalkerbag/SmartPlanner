/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartplanner;

import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author kerbag and Douglas
 */
public class signUp extends javax.swing.JFrame {
 Connectivity c = new Connectivity();
 
 
    /**
     * Creates new form signUp1
     */
    public signUp() {
        initComponents();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        signUpPasswordTextField1 = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        signUpButton = new javax.swing.JButton();
        signInText = new javax.swing.JLabel();
        signUpLastNameTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        signUpEmailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        signUpPasswordTextField2 = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        signUpFirstNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Sign Up");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 150, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 40, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 150, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 270, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 270, 30));

        signUpPasswordTextField1.setBackground(new java.awt.Color(0, 0, 51));
        signUpPasswordTextField1.setForeground(new java.awt.Color(255, 255, 255));
        signUpPasswordTextField1.setText("jPasswordField1");
        signUpPasswordTextField1.setBorder(null);
        signUpPasswordTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(signUpPasswordTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 270, 30));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 120, 30));

        signUpButton.setBackground(new java.awt.Color(0, 153, 153));
        signUpButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 140, 50));

        signInText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        signInText.setForeground(new java.awt.Color(255, 255, 255));
        signInText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInText.setText("Sign In");
        signInText.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        signInText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInTextMouseClicked(evt);
            }
        });
        jPanel2.add(signInText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 140, 30));

        signUpLastNameTextField.setBackground(new java.awt.Color(0, 0, 51));
        signUpLastNameTextField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        signUpLastNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        signUpLastNameTextField.setText("Enter your lastname");
        signUpLastNameTextField.setBorder(null);
        signUpLastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpLastNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(signUpLastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 150, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Smart Planner");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartplanner/Calender.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 270));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tasks & Events");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        signUpEmailTextField.setBackground(new java.awt.Color(0, 0, 51));
        signUpEmailTextField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        signUpEmailTextField.setForeground(new java.awt.Color(255, 255, 255));
        signUpEmailTextField.setText("Enter your email");
        signUpEmailTextField.setBorder(null);
        signUpEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(signUpEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 270, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Re-enter Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 170, 30));

        signUpPasswordTextField2.setBackground(new java.awt.Color(0, 0, 51));
        signUpPasswordTextField2.setForeground(new java.awt.Color(255, 255, 255));
        signUpPasswordTextField2.setText("jPasswordField1");
        signUpPasswordTextField2.setBorder(null);
        signUpPasswordTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(signUpPasswordTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 270, 30));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 270, 30));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, 30));

        signUpFirstNameTextField.setBackground(new java.awt.Color(0, 0, 51));
        signUpFirstNameTextField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        signUpFirstNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        signUpFirstNameTextField.setText("Enter your firstname");
        signUpFirstNameTextField.setBorder(null);
        signUpFirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpFirstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(signUpFirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Your Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 170, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("First:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpPasswordTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordTextField1ActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
//        int correct = 0;
        String firstName = signUpFirstNameTextField.getText();
        String lastName = signUpLastNameTextField.getText();
        String email = signUpEmailTextField.getText();
        String password = String.valueOf(signUpPasswordTextField1.getPassword());
        String password2 = String.valueOf(signUpPasswordTextField2.getPassword());
        String phone = null;
        
        credentialTester test = new credentialTester(firstName, lastName, email, password, password2);
        test.registerCredentialTester();

    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signInTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInTextMouseClicked
        // TODO add your handling code here:
        signIn obj1 = new signIn();
        obj1.setVisible(true);
        dispose();
    }//GEN-LAST:event_signInTextMouseClicked

    private void signUpLastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpLastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpLastNameTextFieldActionPerformed

    private void signUpEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpEmailTextFieldActionPerformed

    private void signUpPasswordTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordTextField2ActionPerformed

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
       
        
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void signUpFirstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpFirstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpFirstNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel signInText;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpEmailTextField;
    private javax.swing.JTextField signUpFirstNameTextField;
    private javax.swing.JTextField signUpLastNameTextField;
    private javax.swing.JPasswordField signUpPasswordTextField1;
    private javax.swing.JPasswordField signUpPasswordTextField2;
    // End of variables declaration//GEN-END:variables
}