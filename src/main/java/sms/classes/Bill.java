package sms.classes;

import database.DatabaseConnection;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Bill {
    private int id;
    private LocalDate bill_date;
    private String bill_type;
    private double bill_amount;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bill(int id, LocalDate bill_date, String bill_type, double bill_amount) {
        this.id = id;
        this.bill_date = bill_date;
        this.bill_type = bill_type;
        this.bill_amount = bill_amount;
    }

    public LocalDate getBill_date() {
        return bill_date;
    }
    public void setBill_date(LocalDate bill_date) {
        this.bill_date = bill_date;
    }
    public String getBill_type() {
        return bill_type;
    }
    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }
    public double getBill_amount() {
        return bill_amount;
    }
    public void setBill_amount(double bill_amount) {
        this.bill_amount = bill_amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public boolean addBill(Bill bill) {
        String query = "INSERT INTO bill (id, billDate, billTitle, amount) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, bill.getId());
            ps.setDate(2, Date.valueOf(bill.getBill_date()));
            ps.setString(3, bill.getBill_type());
            ps.setDouble(4, bill.getBill_amount());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    
}
