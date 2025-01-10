package sms.classes;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Result {
    private int id;
    private String term;
    private float gpa;

    public Result(int id, String term, float gpa) {
        this.id = id;
        this.term = term;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void saveResultToDatabase(int studentId, String term, float gpa) {
        String query = "INSERT INTO result (id, term, gpa) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, studentId);
            statement.setString(2, term);
            statement.setFloat(3, gpa);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "GPA successfully inserted for Term: " + term);
            }
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    public void editResult(int studentId, String term, float gpa) {
        String updateQuery = "UPDATE result SET gpa = ? WHERE id = ? AND term = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(updateQuery)) {
     
            statement.setFloat(1, gpa);
            statement.setInt(2, studentId);
            statement.setString(3, term);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) 
            {
                JOptionPane.showMessageDialog(null,"GPA updated successfully for term: " + term);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"Result not found for the selected term");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}





