/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package API;

/**
 *
 * @author Asmz
 */
public class ApiFormatter {
    
    public static String formatAppointment(Appointment appointment) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Name: ").append(appointment.getCustomer().getName()).append("\n");
        sb.append("Mobile Number: ").append(appointment.getCustomer().getMobileNumber()).append("\n");
        sb.append("Nationality: ").append(appointment.getCustomer().getNationality()).append("\n");
        sb.append("Gender: ").append(appointment.getCustomer().getGender()).append("\n");
        sb.append("Email: ").append(appointment.getCustomer().getEmail()).append("\n");
        sb.append("Passport: ").append(appointment.getCustomer().getPassport()).append("\n");
        sb.append("Address: ").append(appointment.getCustomer().getAddress()).append("\n");
        sb.append("Room Number: ").append(appointment.getRoomNumber()).append("\n");
        sb.append("Bed: ").append(appointment.getRoom().getBed()).append("\n");
        sb.append("Room Type: ").append(appointment.getRoom().getRoomType()).append("\n");
        sb.append("Check-in Date: ").append(appointment.getCheckIn()).append("\n");
        sb.append("Check-out Date: ").append(appointment.getCheckOut()).append("\n");
        sb.append("Price per Day: ").append(appointment.getPricePerDay()).append("\n");
        sb.append("Total Price: ").append(appointment.getTotalPrice()).append("\n");
        
        return sb.toString();
    }
}


