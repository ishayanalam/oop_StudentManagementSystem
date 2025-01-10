package sms.classes;

import database.DatabaseConnection;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Payment {
    private int id;
    private  LocalDate payment_date;
    private double payment_amount;

    public Payment(int id, LocalDate payment_date, double payment_amount) {
        this.id = id;
        this.payment_date = payment_date;
        this.payment_amount = payment_amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public double getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public boolean savePayment(Payment payment) {
        // Adjusted query with correct column names
        String query = "INSERT INTO payment (id, paymentDate, amount) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, payment.getId()); 
            ps.setDate(2, Date.valueOf(payment.getPayment_date()));
            ps.setDouble(3, payment.getPayment_amount());
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Failed to add new payment");
            return false;
        }
    }
    
    

}



