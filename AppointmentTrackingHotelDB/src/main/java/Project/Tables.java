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

public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();

            // Create the CUSTOMER table
            /*st.executeUpdate("CREATE TABLE CUSTOMER ("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(200) NOT NULL,"
                    + "mobileNumber VARCHAR(10) NOT NULL,"
                    + "nationality VARCHAR(200),"
                    + "gender VARCHAR(50),"
                    + "email VARCHAR(200) UNIQUE,"
                    + "passport VARCHAR(200),"
                    + "address VARCHAR(500),"
                    + "checkIn VARCHAR(50),"
                    + "roomNo VARCHAR(10),"
                    + "bed VARCHAR(200),"
                    + "roomType VARCHAR(200),"
                    + "pricePerDay INT,"
                    + "totalAmount VARCHAR(200),"
                    + "checkout VARCHAR(50)"
                    + ")");
            st.executeUpdate("CREATE TABLE ROOM ("
                    + "roomNo VARCHAR(200) PRIMARY KEY,"
                    + "roomType VARCHAR(200),"
                    + "bed VARCHAR(200),"
                    + "price INT,"
                    + "status VARCHAR(200)"
                    + ")");

            st.executeUpdate("CREATE TABLE APPOINTMENT ("
                    + "id INT PRIMARY KEY,"
                    + "customerId INT,"
                    + "appointmentDate VARCHAR(50),"
                    + "startTime VARCHAR(50),"
                    + "endTime VARCHAR(50)"
                    + ")");
            
            

            // Create the index on the name column
            st.executeUpdate("CREATE INDEX idx_customer_name ON CUSTOMER (name)");
            st.executeUpdate("CREATE INDEX idx_room_roomNo ON ROOM (roomNo)");
            st.executeUpdate("CREATE INDEX idx_appointment_customerId ON APPOINTMENT (customerId)");*/
            
             st.executeUpdate("CREATE TABLE APPOINTMENT ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "customerId INT,"
                    + "appointmentDate VARCHAR(50),"
                    + "startTime VARCHAR(50),"
                    + "endTime VARCHAR(50)"
                    + ")");
            
            

            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }
}
