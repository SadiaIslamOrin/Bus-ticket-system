package Entity;
import java.lang.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Ticket {
    private String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
    private File file;
    private FileWriter fwriter;

    public Ticket(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.s10 =s10;
    }

    public void insertInfo() {
        try {
            file = new File("./Data/ticketdata.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String timeAndDate = now.format(format);

            int numberOfTickets = Integer.parseInt(s10);
            int ticketPrice = calculatePrice(s4, s5, s7);
            int totalPrice = ticketPrice * numberOfTickets;

            fwriter = new FileWriter(file, true);
            fwriter.write("Date and Time: " + timeAndDate + "\n");
            fwriter.write("========================================================\n");
            fwriter.write("Name: " + s1 + "\n");
            fwriter.write("Phone: " + s2 + "\n");
            fwriter.write("Gender: " + s3 + "\n");
            fwriter.write("From: " + s4 + "\n");
            fwriter.write("To: " + s5 + "\n");
            fwriter.write("Bus Type: " + s6 + "\n");
            fwriter.write("Ticket Type: " + s7 + "\n");
            fwriter.write("Seats: " + s8 + "\n");
            fwriter.write("Travel Date: " + s9 + "\n");
            fwriter.write("Number of Ticket: " + s10 + "\n");
            fwriter.write("Ticket Price (each): " + ticketPrice + " Taka\n");
            fwriter.write("Total Price: " + totalPrice + " Taka\n");
            fwriter.write("--------------------------------------------------------\n");

            fwriter.flush();
            fwriter.close();

        } 
       catch (IOException ioe) 
        {
           ioe.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error writing to file!");
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(null, "Invalid ticket number input!");
        }
    }

    private int calculatePrice(String from, String to, String ticketType) 
    {
        int price = 0;
        from = from.trim().toLowerCase();
        to = to.trim().toLowerCase();
        ticketType = ticketType.trim().toLowerCase();

        
        if (from.equals("dhaka") && to.equals("mymensingh")) 
        {
         if (ticketType.equals("single")) 
         { price = 300; } 
         else 
         {price = 500; }
        } 
        else if (from.equals("dhaka") && to.equals("khulna")) 
        {
          if (ticketType.equals("single")) {
          price = 800;
          } else {
          price = 1400;
          }
        } 
        else if (from.equals("dhaka") && to.equals("tangail")) 
        {
          if (ticketType.equals("single")) {
          price = 200;}
          else { price = 350;}
        } 
        else 
        {
          if (ticketType.equals("single")) {price = 400;} 
          else {price = 700;}
        }

        return price;
    }
}