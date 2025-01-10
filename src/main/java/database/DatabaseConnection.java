package database;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/sms";
    private static final String USER = "root"; //
    private static final String PASSWORD = "admin"; //


    private DatabaseConnection() {
    }

    public static Connection getConnection() throws SQLException {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL, use this line
            // Return the connection
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database driver not found.", e);
        } catch (SQLException e) {
            throw new SQLException("Failed to connect to the database.", e);
        }
    }

    public boolean searchDatabaseWhereID(int id) {
        String query = "SELECT * FROM students WHERE id = " + id; // Search for student with the given ID

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            if (resultSet.next()) { // If a record is found
                return true; // ID found in the database
            } else {
                return false; // ID not found
            }

        } catch (SQLException e) {
            //System.err.println("Error fetching data from the database: " + e.getMessage()); // Print the error message
            return false; // In case of an error, return false
        }
    }

}
