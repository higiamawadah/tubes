package smartroom;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author higia
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class database {

    private Statement stat = null;
    private Connection conn = null;
    private ResultSet rs = null;

    public database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
            stat = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Connect Database: "+e.getMessage());
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stat.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error GetData: "+e.getMessage());
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stat.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Query: "+e.getMessage());
        }
    }
}
