/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Asmz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Select {
    public static ResultSet getData(String query){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        
        try{
            con = ConnectionProvider.getCon();
            st= con.createStatement();
            rs= st.executeQuery(query);
            return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void setData(PreparedStatement pstmt, String msg) {
        try {
            pstmt.executeUpdate();

            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
