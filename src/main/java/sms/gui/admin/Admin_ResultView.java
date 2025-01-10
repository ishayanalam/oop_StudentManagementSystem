
package sms.gui.admin;
import database.DatabaseConnection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Admin_ResultView extends javax.swing.JFrame {
    
    private final int studentID;

  public Admin_ResultView(int id) {
        initComponents(); 
        this.studentID = id; 
        loadTableData(studentID);
        calculateTotalGPA(id);
    }

    private Admin_ResultView() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
 private void loadTableData(int studentId) {
    
    String query = "SELECT term, gpa FROM result WHERE id = ? ORDER BY term ASC";

    try (
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(query)
    ) {
        
        statement.setInt(1, studentId);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Result not found, Please check student ID");
            return;
        }
        String[] columnNames = {"Term", "GPA"};
        DefaultTableModel resultData = new DefaultTableModel(columnNames, 0);
        do {
            String term = resultSet.getString("term");
            float gpa = resultSet.getFloat("gpa");
            Object[] row = {term, gpa};
            resultData.addRow(row);
        } while (resultSet.next());
        resultTable.setModel(resultData);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
}
    
    private double totalCGPA; 

private void calculateTotalGPA(int studentID) {
    String query = "SELECT AVG(gpa) AS total FROM result WHERE id = ?"; 
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, studentID);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                this.totalCGPA = resultSet.getDouble("total"); 
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    getCGPA.setText(String.format("CGPA: %.2f", totalCGPA)); 
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        getCGPA = new javax.swing.JLabel();
        goAdminDashboard = new javax.swing.JButton();
        editResult1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result");

        header.setBackground(new java.awt.Color(0, 122, 255));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Result");
        header.add(jLabel2, new java.awt.GridBagConstraints());

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 500));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Semester-wise GPA");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Term", "CGPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(250, 500));

        getCGPA.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        getCGPA.setText("0.00");

        goAdminDashboard.setBackground(new java.awt.Color(0, 122, 255));
        goAdminDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goAdminDashboard.setForeground(new java.awt.Color(255, 255, 255));
        goAdminDashboard.setText("Back");
        goAdminDashboard.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        goAdminDashboard.setBorderPainted(false);
        goAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goAdminDashboardActionPerformed(evt);
            }
        });

        editResult1.setBackground(new java.awt.Color(0, 122, 255));
        editResult1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editResult1.setForeground(new java.awt.Color(255, 255, 255));
        editResult1.setText("Edit  Result");
        editResult1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        editResult1.setBorderPainted(false);
        editResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editResult1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(getCGPA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(editResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goAdminDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Admin_Dashboard adminDashboard = new Admin_Dashboard();
        adminDashboard.setVisible(true);
    }//GEN-LAST:event_goAdminDashboardActionPerformed

    private void editResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editResult1ActionPerformed
        // TODO add your handling code here:
        

        try {
           
            Admin_EditResult editResultFrame = new Admin_EditResult(studentID);
            editResultFrame.setVisible(true);

          

        } catch (NumberFormatException e) {
          
            JOptionPane.showMessageDialog(
                this,
                "Invalid ID format. Please enter a valid integer.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_editResult1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_ResultView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editResult1;
    private javax.swing.JLabel getCGPA;
    private javax.swing.JButton goAdminDashboard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
