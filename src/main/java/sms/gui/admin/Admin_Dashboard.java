/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sms.gui.admin;
import database.DatabaseConnection;

import javax.swing.JOptionPane;
import sms.gui.LOGIN;

/**
 *
 * @author mdsee
 */
public class Admin_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Temp
     */
    public Admin_Dashboard() {
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

        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addStudent = new javax.swing.JButton();
        editStudent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Login_goDashboard7 = new javax.swing.JButton();
        Login_goDashboard4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        getID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        goPayment = new javax.swing.JButton();
        checkResult = new javax.swing.JButton();
        Login_goDashboard5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewBill = new javax.swing.JButton();
        editResult = new javax.swing.JButton();
        Login_goDashboard2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setResizable(false);

        header.setBackground(new java.awt.Color(0, 122, 255));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Management System");
        header.add(jLabel2, new java.awt.GridBagConstraints());

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));

        addStudent.setBackground(new java.awt.Color(0, 122, 255));
        addStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addStudent.setForeground(new java.awt.Color(255, 255, 255));
        addStudent.setText("Add Student");
        addStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        addStudent.setBorderPainted(false);
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        editStudent.setBackground(new java.awt.Color(0, 122, 255));
        editStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editStudent.setForeground(new java.awt.Color(255, 255, 255));
        editStudent.setText("Edit Student");
        editStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        editStudent.setBorderPainted(false);
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Student ");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Academic");

        Login_goDashboard7.setBackground(new java.awt.Color(0, 122, 255));
        Login_goDashboard7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login_goDashboard7.setForeground(new java.awt.Color(255, 255, 255));
        Login_goDashboard7.setText("Add Term");
        Login_goDashboard7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Login_goDashboard7.setBorderPainted(false);
        Login_goDashboard7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_goDashboard7ActionPerformed(evt);
            }
        });

        Login_goDashboard4.setBackground(new java.awt.Color(0, 122, 255));
        Login_goDashboard4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login_goDashboard4.setForeground(new java.awt.Color(255, 255, 255));
        Login_goDashboard4.setText("View Student");
        Login_goDashboard4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Login_goDashboard4.setBorderPainted(false);
        Login_goDashboard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_goDashboard4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Login_goDashboard7, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38))
                    .addComponent(Login_goDashboard4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_goDashboard4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(Login_goDashboard7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        getID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Enter Student ID");

        goPayment.setBackground(new java.awt.Color(0, 122, 255));
        goPayment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goPayment.setForeground(new java.awt.Color(255, 255, 255));
        goPayment.setText("Payment");
        goPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goPayment.setBorderPainted(false);
        goPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goPaymentActionPerformed(evt);
            }
        });

        checkResult.setBackground(new java.awt.Color(0, 122, 255));
        checkResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkResult.setForeground(new java.awt.Color(255, 255, 255));
        checkResult.setText("Check Result");
        checkResult.setActionCommand("");
        checkResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        checkResult.setBorderPainted(false);
        checkResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkResultActionPerformed(evt);
            }
        });

        Login_goDashboard5.setBackground(new java.awt.Color(0, 122, 255));
        Login_goDashboard5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login_goDashboard5.setForeground(new java.awt.Color(255, 255, 255));
        Login_goDashboard5.setText("Insert Result");
        Login_goDashboard5.setActionCommand("");
        Login_goDashboard5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Login_goDashboard5.setBorderPainted(false);
        Login_goDashboard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_goDashboard5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel1.setText("Results And Billing");

        viewBill.setBackground(new java.awt.Color(0, 122, 255));
        viewBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewBill.setForeground(new java.awt.Color(255, 255, 255));
        viewBill.setText("Billing");
        viewBill.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        viewBill.setBorderPainted(false);
        viewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBillActionPerformed(evt);
            }
        });

        editResult.setBackground(new java.awt.Color(0, 122, 255));
        editResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editResult.setForeground(new java.awt.Color(255, 255, 255));
        editResult.setText("Edit  Result");
        editResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        editResult.setBorderPainted(false);
        editResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editResultActionPerformed(evt);
            }
        });

        Login_goDashboard2.setBackground(new java.awt.Color(0, 122, 255));
        Login_goDashboard2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Login_goDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        Login_goDashboard2.setText("SIGN OUT");
        Login_goDashboard2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Login_goDashboard2.setBorderPainted(false);
        Login_goDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_goDashboard2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(viewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkResult, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(goPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editResult, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Login_goDashboard5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getID, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login_goDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login_goDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkResult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_goDashboard5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editResult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goPaymentActionPerformed
        // TODO add your handling code here:
        String idText = getID.getText(); 
        try {
   
    int ID = Integer.parseInt(idText);
    
    
    Admin_PaymentsView openStudentPaymentFrame = new Admin_PaymentsView(ID);
    openStudentPaymentFrame.setVisible(true);
    
    
    this.dispose();
} catch (NumberFormatException e) {
   
    JOptionPane.showMessageDialog(
        this, 
        "Invalid ID format. Please enter a valid integer.", 
        "Input Error", 
        JOptionPane.ERROR_MESSAGE
    );
}
        
        
    }//GEN-LAST:event_goPaymentActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        
        Admin_StudentAdd addStudentFrame = new Admin_StudentAdd();
        addStudentFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addStudentActionPerformed

    private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
           // TODO add your handling code here:
           Admin_StudentEdit mainStudentFrame = new Admin_StudentEdit();
           mainStudentFrame.setVisible(true);
           this.dispose();
           
    }//GEN-LAST:event_editStudentActionPerformed

    private void getIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getIDActionPerformed
     
    }//GEN-LAST:event_getIDActionPerformed

    private void checkResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkResultActionPerformed
String idText = getID.getText(); 

try {
   
    int ID = Integer.parseInt(idText);
    
   
    Admin_ResultView openStudentResultFrame = new Admin_ResultView(ID);
    openStudentResultFrame.setVisible(true);
    
   
    this.dispose();
} catch (NumberFormatException e) {
   
    JOptionPane.showMessageDialog(
        this, 
        "Invalid ID format. Please enter a valid integer.", 
        "Input Error", 
        JOptionPane.ERROR_MESSAGE
    );
}
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_checkResultActionPerformed

    private void Login_goDashboard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_goDashboard5ActionPerformed
        // TODO add your handling code here:
        String idText = getID.getText(); 

try {
    
    int ID = Integer.parseInt(idText);
    Admin_ResultAdd openResultAddFrame = new Admin_ResultAdd(ID); 
    openResultAddFrame.setVisible(true);
     
} catch (NumberFormatException e) {
    
    JOptionPane.showMessageDialog(
        this, 
        "Invalid ID format. Please enter a valid integer.", 
        "Input Error", 
        JOptionPane.ERROR_MESSAGE
    );
}

        
    }//GEN-LAST:event_Login_goDashboard5ActionPerformed

    private void viewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBillActionPerformed
           // TODO add your handling code here:
        String idText = getID.getText();
        try 
        {
            int ID = Integer.parseInt(idText);
            Admin_BillViewTemp openStudentBillFrame = new Admin_BillViewTemp(ID);
            openStudentBillFrame.setVisible(true);
            this.dispose();
        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog
        (
        this, 
        "Invalid ID format. Please enter a valid integer.", 
        "Input Error", 
        JOptionPane.ERROR_MESSAGE
        );
}

    }//GEN-LAST:event_viewBillActionPerformed

    private void Login_goDashboard7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_goDashboard7ActionPerformed
        // TODO add your handling code here:
        Admin_Term addNewTerm = new Admin_Term();
        addNewTerm.setVisible(true);
        
    }//GEN-LAST:event_Login_goDashboard7ActionPerformed

    private void Login_goDashboard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_goDashboard4ActionPerformed
                // TODO add your handling code here:
                Admin_StudentMain newStudenMain = new Admin_StudentMain ();
                newStudenMain.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Login_goDashboard4ActionPerformed

    private void editResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editResultActionPerformed
      
        String idText = getID.getText(); 

    try {
       
        int ID = Integer.parseInt(idText);
        
        
        Admin_EditResult editResultFrame = new Admin_EditResult(ID);
        editResultFrame.setVisible(true);
        
        
        
    } catch (NumberFormatException e) {
      
        JOptionPane.showMessageDialog(
            this, 
            "Invalid ID format. Please enter a valid integer.", 
            "Input Error", 
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_editResultActionPerformed

    private void Login_goDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_goDashboard2ActionPerformed
        // TODO add your handling code here:

        LOGIN newLogin = new LOGIN();
        newLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login_goDashboard2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_goDashboard2;
    private javax.swing.JButton Login_goDashboard4;
    private javax.swing.JButton Login_goDashboard5;
    private javax.swing.JButton Login_goDashboard7;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton checkResult;
    private javax.swing.JButton editResult;
    private javax.swing.JButton editStudent;
    private javax.swing.JTextField getID;
    private javax.swing.JButton goPayment;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton viewBill;
    // End of variables declaration//GEN-END:variables
}
