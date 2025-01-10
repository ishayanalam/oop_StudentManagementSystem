package sms.classes;

import database.DatabaseConnection;

import java.sql.*;
import java.time.LocalDate;

public class GraduateStudent extends Student {
    private String department;
    private String minor;
    private String programName;
    private int batchNumber;

    public GraduateStudent(String name, String email, String phone, String address, String advisor, String degree, String gender, LocalDate dob, String password, String department, String minor, String programName, int batchNumber) {
        super(name, email, phone, address, advisor, degree, gender, dob, password);
        setDegree("Graduate"); 
        this.department = department;
        this.minor = minor;
        this.programName = programName;
        this.batchNumber = batchNumber;
    }

    @Override
    public boolean saveDatabase() {
        String sql = "INSERT INTO students (name, email, phone, address, advisor, degree, gender, dateOfBirth, password, department, minor, programName, batchNumber) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, getName());  
            stmt.setString(2, getEmail()); 
            stmt.setString(3, getPhone()); 
            stmt.setString(4, getAddress()); 
            stmt.setString(5, getAdvisor()); 
            stmt.setString(6, getDegree());  
            stmt.setString(7, getGender()); 
            stmt.setDate(8, java.sql.Date.valueOf(getDob())); 
            stmt.setString(9, getPassword()); 
            stmt.setString(10, getDepartment()); 
            stmt.setString(11, getMinor()); 
            stmt.setString(12, getProgramName());  
            stmt.setInt(13, getBatchNumber());  
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int generatedId = generatedKeys.getInt(1);  
                        setId(generatedId);  
                        return true;  
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }
}
