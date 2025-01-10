                  
package sms.gui.student;

import database.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Std_BillViewFinal extends javax.swing.JFrame {
    
    private final int studentID;
    private double totalBill;  
    private double totalPaid;
    
    public Std_BillViewFinal(int ID) {
        this.studentID = ID;
        initComponents();
        getID.setText("Student ID: " + ID);
        fetchBillData(ID);
        calculateTotalBill(ID);
        updateAmountToPayLabel();
        calculateTotalPaid(ID);
        updateAmount_TotalPaid();
        updateAmount_Outstanding();
        
    }
    private void fetchBillData(int studentID) {
    String query = "SELECT billDate, billTitle, amount FROM bill WHERE id = ?"; 
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, studentID);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          
            String[] columnNames = {"Date", "Title", "Amount"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
            while (resultSet.next()) {
                Date billDate = resultSet.getDate("billDate");
                String billTitle = resultSet.getString("billTitle");
                double amount = resultSet.getDouble("amount");
                tableModel.addRow(new Object[]{billDate, billTitle, amount});
            }
            billTable.setModel(tableModel);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error ");
    }
}
    private void calculateTotalBill(int studentID) {
    String query = "SELECT SUM(amount) AS total FROM bill WHERE id = ?"; 
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, studentID);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                this.totalBill = resultSet.getDouble("total"); 
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error");
    }
}

    private void calculateTotalPaid(int studentID)
    {
       String query = "SELECT SUM(amount) AS total FROM payment WHERE id = ?";
       try (Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, studentID);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                this.totalPaid = resultSet.getDouble("total");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error");
    }
       
    }
    
     private void updateAmountToPayLabel() {
        amountTOPay.setText("" + totalBill);
    }
     private void updateAmount_TotalPaid()
     {
         totalPaidLable.setText(""+totalPaid);
     }
     
     private void updateAmount_Outstanding()
     {
        double outstandingAmount = totalBill - totalPaid;  
        outstanding.setText("" + outstandingAmount);
     }
    private Std_BillViewFinal() {
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
        getID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        goDashboard = new javax.swing.JButton();
        amountTOPay = new javax.swing.JLabel();
        totalPaidLable = new javax.swing.JLabel();
        outstanding = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill ");
        setResizable(false);

        header.setBackground(new java.awt.Color(0, 122, 255));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        getID.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        getID.setForeground(new java.awt.Color(255, 255, 255));
        getID.setText("Student Bill Information");
        header.add(getID, new java.awt.GridBagConstraints());

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 500));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Bill Details");

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Title", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billTable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(billTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(250, 500));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Total Payable:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Total Outstanding:");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Total Paid:");

        goDashboard.setBackground(new java.awt.Color(0, 122, 255));
        goDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goDashboard.setForeground(new java.awt.Color(255, 255, 255));
        goDashboard.setText("Back");
        goDashboard.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goDashboard.setBorderPainted(false);
        goDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goDashboardActionPerformed(evt);
            }
        });

        amountTOPay.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        amountTOPay.setForeground(new java.awt.Color(255, 51, 0));
        amountTOPay.setText("amountTOPay");

        totalPaidLable.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        totalPaidLable.setText("Total Paid:");

        outstanding.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        outstanding.setText("DueAmount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(goDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(amountTOPay)
                    .addComponent(totalPaidLable)
                    .addComponent(outstanding))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(amountTOPay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(totalPaidLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outstanding)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(goDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Std_Dashboard goDashboard = new Std_Dashboard(studentID);
        goDashboard.setVisible(true);
    }//GEN-LAST:event_goDashboardActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Std_BillViewFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountTOPay;
    private javax.swing.JTable billTable;
    private javax.swing.JLabel getID;
    private javax.swing.JButton goDashboard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outstanding;
    private javax.swing.JLabel totalPaidLable;
    // End of variables declaration//GEN-END:variables
}
