package Interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Asmz
 */
import Project.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
        initComponents();
    }

    private void refreshRoomList() {
        DefaultTableModel model = (DefaultTableModel) tblManageRoom.getModel();
        model.setRowCount(0); 
        
        ResultSet rs = Select.getData("SELECT * FROM room");

        try {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("ROOMNO"),
                    rs.getString("ROOMTYPE"),
                    rs.getString("BED"),
                    rs.getString("PRICE"),
                    rs.getString("STATUS")
                });
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRoom = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbBed = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddRoom = new javax.swing.JButton();
        rtbAc = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnDeleteRoom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asmz\\OneDrive\\Documents\\NetBeansProjects\\AppointmentTrackingHotelDB\\src\\main\\java\\Images\\manage room.png")); // NOI18N
        jLabel1.setText("Manage Rooms");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 25, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asmz\\OneDrive\\Documents\\NetBeansProjects\\AppointmentTrackingHotelDB\\src\\main\\java\\Images\\close.png")); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 33, -1, -1));

        tblManageRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Nnumber", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblManageRoom);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 112, 553, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 112, -1, -1));
        getContentPane().add(txtRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 149, 197, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 189, -1, -1));

        cmbBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(cmbBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 303, 197, -1));

        jLabel4.setText("Bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 269, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 197, -1));

        btnAddRoom.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnAddRoom.setText("Addd Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        buttonGroup1.add(rtbAc);
        rtbAc.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        rtbAc.setText("AC");
        getContentPane().add(rtbAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 226, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jRadioButton2.setText("Non-AC");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 226, -1, -1));

        btnDeleteRoom.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        // TODO add your handling code here:
        String roomNo = txtRoomNumber.getText().trim();
        String roomType = rtbAc.isSelected() ? "AC" : "Non-AC";
        String bed = (String) cmbBed.getSelectedItem();
        String price = txtPrice.getText().trim();

        
        if (roomNo.isEmpty() || roomType.isEmpty() || bed.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
            return;
        }

       
        try {
            int roomNumber = Integer.parseInt(roomNo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid room number. Please enter a valid integer.");
            return;
        }

        
        try {
            int roomPrice = Integer.parseInt(price);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid price. Please enter a valid number.");
            return;
        }

        
        if (isRoomNumberExists(roomNo)) {
            JOptionPane.showMessageDialog(null, "Room number already exists. Please enter a different room number.");
            return;
        }

        
        String query = "INSERT INTO ROOM (roomNo, roomType, bed, price, status) VALUES (?, ?, ?, ?, 'Available')";

        try ( Connection con = ConnectionProvider.getCon();  PreparedStatement pstmt = con.prepareStatement(query)) {

           
            pstmt.setString(1, roomNo);
            pstmt.setString(2, roomType);
            pstmt.setString(3, bed);
            pstmt.setInt(4, Integer.parseInt(price));

            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Room added successfully.");

                
                txtRoomNumber.setText("");
                rtbAc.setSelected(true);
                cmbBed.setSelectedIndex(0);
                txtPrice.setText("");

                
                refreshRoomList();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add room.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean isRoomNumberExists(String roomNo) {
        String query = "SELECT COUNT(*) FROM ROOM WHERE roomNo = ?";

        try ( Connection con = ConnectionProvider.getCon();  PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, roomNo);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("SELECT * FROM room");
        DefaultTableModel model = (DefaultTableModel) tblManageRoom.getModel();

        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageRoom.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a room to delete.");
            return;
        }

        String roomNo = tblManageRoom.getValueAt(selectedRow, 0).toString();
        String status = tblManageRoom.getValueAt(selectedRow, 4).toString();

        if (status.equals("Available")) {
            
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete room " + roomNo + "?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                
                String query = "DELETE FROM ROOM WHERE roomNo = ?";

                try ( Connection con = ConnectionProvider.getCon();  PreparedStatement pstmt = con.prepareStatement(query)) {
                  
                    pstmt.setString(1, roomNo);

                    
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Room deleted successfully.");

                        
                        refreshRoomList();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete room.");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cannot delete room. It is currently unavailable.");
        }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbBed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rtbAc;
    private javax.swing.JTable tblManageRoom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}