
package sms.gui.student;

import database.DatabaseConnection;

import javax.swing.*;
import java.sql.*;
import sms.gui.StudentLogin;

public class Std_Dashboard extends javax.swing.JFrame {
    private final int studentID;
    public Std_Dashboard(int ID) {
        this.studentID = ID;
        initComponents();
        loadStudentData(ID);
        
    }
    private void loadStudentData(int studentId) {
        String query = "SELECT * FROM students WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, studentId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    getStudentID.setText(resultSet.getString("id"));
                    getName.setText(resultSet.getString("name"));
                    getEmail.setText(resultSet.getString("email"));
                    getPhone.setText(resultSet.getString("phone"));
                    getAddress.setText(resultSet.getString("address"));
                    getAdvisor.setText(resultSet.getString("advisor"));
                    getDegree.setText(resultSet.getString("degree"));
                    getGender.setText(resultSet.getString("gender"));
                    getDOB.setText(resultSet.getString("dateOfBirth"));
                    getDept.setText(resultSet.getString("department"));
                    getMinor.setText(resultSet.getString("minor"));
                    getProgram.setText(resultSet.getString("programName"));
                    getBatch.setText(String.valueOf(resultSet.getInt("batchNumber")));
                } else {
                    getStudentID.setText("NOT FOUND");
                }
            }
        } catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(this, "Error ");
            }
    }

    private Std_Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        HeaderButton = new javax.swing.JPanel();
        goPayment = new javax.swing.JButton();
        goBill = new javax.swing.JButton();
        Login_goDashboard2 = new javax.swing.JButton();
        goResult = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        getStudentID = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        getAdvisor = new javax.swing.JLabel();
        getDept = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        getMinor = new javax.swing.JLabel();
        getGender = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        getPhone = new javax.swing.JLabel();
        getBatch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        getDegree = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        getDOB = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        getAddress = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        getEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        getProgram = new javax.swing.JLabel();
        getName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Dashboard");
        setResizable(false);

        header.setBackground(new java.awt.Color(0, 122, 255));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Management System");
        header.add(jLabel2, new java.awt.GridBagConstraints());

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        HeaderButton.setPreferredSize(new java.awt.Dimension(800, 100));

        goPayment.setBackground(new java.awt.Color(0, 122, 255));
        goPayment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goPayment.setForeground(new java.awt.Color(255, 255, 255));
        goPayment.setText("Payment Details");
        goPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goPayment.setBorderPainted(false);
        goPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goPaymentActionPerformed(evt);
            }
        });

        goBill.setBackground(new java.awt.Color(0, 122, 255));
        goBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goBill.setForeground(new java.awt.Color(255, 255, 255));
        goBill.setText("Bill Details");
        goBill.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goBill.setBorderPainted(false);
        goBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBillActionPerformed(evt);
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

        goResult.setBackground(new java.awt.Color(0, 122, 255));
        goResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goResult.setForeground(new java.awt.Color(255, 255, 255));
        goResult.setText("Result Details");
        goResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goResult.setBorderPainted(false);
        goResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderButtonLayout = new javax.swing.GroupLayout(HeaderButton);
        HeaderButton.setLayout(HeaderButtonLayout);
        HeaderButtonLayout.setHorizontalGroup(
            HeaderButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(goBill, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goResult, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(Login_goDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        HeaderButtonLayout.setVerticalGroup(
            HeaderButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderButtonLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(HeaderButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_goDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goResult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(HeaderButton);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 400));

        getStudentID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getStudentID.setText("StudentID");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Degree:");

        getAdvisor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getAdvisor.setText("getAdvisor");

        getDept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getDept.setText("showDept");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Batch:");

        getMinor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getMinor.setText("showMinor");

        getGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getGender.setText("showGender");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Department: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Gender:");

        getPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getPhone.setText("showPhone");

        getBatch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getBatch.setText("getBatch");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address:");

        getDegree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getDegree.setText("showDegree");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Program:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Phone:");

        getDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getDOB.setText("showDOB");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Date of Birth:");

        getAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getAddress.setText("showAddress");
        getAddress.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Advisor:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Minor:");

        jLabel1.setBackground(new java.awt.Color(0, 122, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 122, 255));
        jLabel1.setText("Personal Information");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("E-mail:");

        getEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getEmail.setText("showEmail");

        jLabel3.setBackground(new java.awt.Color(0, 122, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 122, 255));
        jLabel3.setText("Academic Information");

        getProgram.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getProgram.setText("showProgram");

        getName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getName.setText("showName");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(getName))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(getEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(getPhone))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(getGender))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(getDOB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(getMinor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(getDegree))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(getProgram))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(getDept))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getBatch)
                            .addComponent(getAdvisor)))
                    .addComponent(jLabel3))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(getName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(getPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(getEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(getGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(getDOB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(getAddress)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getDegree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(getDept))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(getProgram))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(getBatch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(getAdvisor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(getMinor))))
                .addGap(114, 114, 114))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("You are logged in as Student ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getStudentID)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(getStudentID))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goPaymentActionPerformed
        // TODO add your handling code here:
        Std_PaymentsViewFinal openPayment = new Std_PaymentsViewFinal(studentID);
        openPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goPaymentActionPerformed

    private void goBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBillActionPerformed
        // TODO add your handling code here:
        Std_BillViewFinal viewBill = new Std_BillViewFinal(studentID);
        viewBill.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_goBillActionPerformed

    private void Login_goDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_goDashboard2ActionPerformed
        // TODO add your handling code here:
        
        StudentLogin newLogin = new StudentLogin(); 
        newLogin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Login_goDashboard2ActionPerformed

    private void goResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goResultActionPerformed
        // TODO add your handling code here:
        Std_ResultViewFinal viewResult = new Std_ResultViewFinal(studentID);
        viewResult.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goResultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Std_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderButton;
    private javax.swing.JButton Login_goDashboard2;
    private javax.swing.JLabel getAddress;
    private javax.swing.JLabel getAdvisor;
    private javax.swing.JLabel getBatch;
    private javax.swing.JLabel getDOB;
    private javax.swing.JLabel getDegree;
    private javax.swing.JLabel getDept;
    private javax.swing.JLabel getEmail;
    private javax.swing.JLabel getGender;
    private javax.swing.JLabel getMinor;
    private javax.swing.JLabel getName;
    private javax.swing.JLabel getPhone;
    private javax.swing.JLabel getProgram;
    private javax.swing.JLabel getStudentID;
    private javax.swing.JButton goBill;
    private javax.swing.JButton goPayment;
    private javax.swing.JButton goResult;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
