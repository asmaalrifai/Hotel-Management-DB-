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

public class ConnectionProvider {

    public static Connection getCon() {
        String url = "jdbc:derby://localhost:1527/AppointmentTrackingHotelDB";
        String user = "app";
        String password="app";
        try {
            //Class.forName("jdbc:derby://localhost:1527/AppointmentTrackingHotelDB");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException ex) {
            //Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
