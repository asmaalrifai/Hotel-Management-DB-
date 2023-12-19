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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InsertUpdateDelete {
    public static void setData(String Query, String msg){
        Connection con = null;
        Statement st = null;
        
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.execute(Query);
            if (!msg.equals(""))
                JOptionPane.showConfirmDialog(null, msg);
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null,e);
        }finally{
            try{
            
        }catch(Exception e){
            
        }
        }
    }
}
