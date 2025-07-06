package Frame;
import Entity.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BusFrame extends JFrame implements ActionListener, MouseListener {
    private Font f1 = new Font("Cambria", Font.BOLD, 26);
    private Font f2 = new Font("Cambria", Font.PLAIN, 18);
    private Color c2;
    private JPanel panel;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
    private JTextField tf1, tf2, tf3, tf4;
    private JRadioButton rb1, rb2, rb3, rb4, rb5;
    private ButtonGroup bg1,bg2;
    private JComboBox<String> cbFrom, cbTo, jb;
    private JCheckBox cb1, cb2, cb3, cb4;
    private JTextArea  ta;
    private JButton bt1, bt2, bt3;
    private ImageIcon img;

    public BusFrame() {
        super("Bus Ticket Booking System");
        setBounds(400, 100, 950, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c2 = new Color(230, 250, 255);    
        panel.setBackground(c2);

        label1 = new JLabel("Bus Ticket Booking Form");
        label1.setBounds(300, 10, 400, 40);
        label1.setFont(f1);
        label1.setForeground(Color.BLUE);
        panel.add(label1);

        label2 = new JLabel("Name");
		label2.setBounds(30, 70, 120,25);
		label2.setFont(f2);
		panel.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(160, 70, 200,25);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label3 = new JLabel("Phone No");
		label3.setBounds(30, 110, 120,25);
		label3.setFont(f2);
		panel.add(label3);
		
		tf2 = new JTextField();
		tf2.setBounds(160, 110, 200,25);
	    tf2.setFont(f2);
		tf2.addActionListener(this);
		panel.add(tf2);
		
        label4 = new JLabel("Your Gender");
        label4.setBounds(30, 150, 120, 25);
        label4.setFont(f2);
        panel.add(label4);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(160, 150, 80, 25);
        rb1.setFont(f2);
        rb1.setBackground(c2);
        panel.add(rb1);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(250, 150, 100, 25);
        rb2.setFont(f2);
        rb2.setBackground(c2);
        panel.add(rb2);

        rb3 = new JRadioButton("Other");
        rb3.setBounds(360, 150, 100, 25);
        rb3.setFont(f2);
        rb3.setBackground(c2);
        panel.add(rb3);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);

        label5 = new JLabel("From");
        label5.setBounds(30, 190, 120, 25);
        label5.setFont(f2);
        panel.add(label5);


        cbFrom = new JComboBox<>();
        cbFrom.addItem("");
        cbFrom.addItem("Dhaka");
        cbFrom.addItem("Khulna");
        cbFrom.addItem("Tangail");
        cbFrom.setBounds(160, 190, 200, 25);
        cbFrom.setFont(f2);
        panel.add(cbFrom);

        label6 = new JLabel("To");
        label6.setBounds(30, 230, 120, 25);
        label6.setFont(f2);
        panel.add(label6);

        cbTo = new JComboBox<>();
        cbTo.addItem("");
        cbTo.addItem("Dhaka");
        cbTo.addItem("Mymensingh");
        cbTo.addItem("Khulna");
        cbTo.addItem("Tangail");
        cbTo.setBounds(160, 230, 200, 25);
        cbTo.setFont(f2);
        panel.add(cbTo);

        label7 = new JLabel("Bus Type");
        label7.setBounds(30, 270, 120, 25);
        label7.setFont(f2);
        panel.add(label7);

        jb = new JComboBox<>();
        jb.addItem("");
        jb.addItem("AC");
        jb.addItem("Non-AC");
        jb.addItem("Sleeper");
        jb.addItem("Luxury");
        jb.setBounds(160, 270, 200, 25);
        jb.setFont(f2);
        panel.add(jb);

        label8 = new JLabel("Ticket Type");
        label8.setBounds(30, 310, 120, 25);
        label8.setFont(f2);
        panel.add(label8);

        rb4 = new JRadioButton("Single");
        rb4.setBounds(160, 310, 100, 25);
        rb4.setFont(f2);
        rb4.setBackground(c2);
        panel.add(rb4);

        rb5 = new JRadioButton("Return");
        rb5.setBounds(250, 310, 100, 25);
        rb5.setFont(f2);
        rb5.setBackground(c2);
        panel.add(rb5);

        bg2 = new ButtonGroup();
        bg2.add(rb4);
        bg2.add(rb5);

        label9 = new JLabel("Seats");
		label9.setBounds(30, 350, 120,25);
		label9.setFont(f2);
		panel.add(label9);
		
		cb1 = new JCheckBox("A1");
		cb1.setBounds(160, 350, 60,25);
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("A2");
		cb2.setBounds(230, 350, 60,25);
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("B1");
		cb3.setBounds(300, 350, 60,25);
		cb3.setFont(f2);
		panel.add(cb3);
		
		cb4 = new JCheckBox("B2");
		cb4.setBounds(370, 350, 60,25);
		cb4.setFont(f2);
		panel.add(cb4);

        label10 = new JLabel("Travel Date (dd/mm/yyyy)");
        label10.setBounds(30, 390, 230, 25);
        label10.setFont(f2);
        panel.add(label10);

        tf3 = new JTextField();
        tf3.setBounds(260, 390, 200, 25);
        tf3.setFont(f2);
        panel.add(tf3);
		
        label11 = new JLabel("Number of Ticket");
        label11.setBounds(30, 430, 200, 25);
        label11.setFont(f2);
        panel.add(label11);

        tf4 = new JTextField();
        tf4.setBounds(260, 430, 200, 30);
        tf4.setFont(f2);
        panel.add(tf4);

        img = new ImageIcon("Picture/Bus.png");
        label12 = new JLabel(img);
        label12.setBounds(240, 10, 50, 40);
        panel.add(label12);

        bt1 = new JButton("Submit");
        bt1.setBounds(30, 490, 150, 30);
        bt1.setFont(f2);
        bt1.setBackground(Color.GREEN);
        bt1.setOpaque(true);
        bt1.setContentAreaFilled(true);
        bt1.setBorderPainted(false);
        bt1.addMouseListener(this);
        bt1.addActionListener(this);
        panel.add(bt1);


        bt2 = new JButton("Show Tickets");
        bt2.setBounds(200, 490, 170, 30);
        bt2.setFont(f2);
        bt2.setBackground(Color.ORANGE);
        bt2.setOpaque(true);
        bt2.setContentAreaFilled(true);
        bt2.setBorderPainted(false);
        bt2.addActionListener(this);
        panel.add(bt2);


        bt3 = new JButton("Exit");
        bt3.setBounds(115, 530, 150, 30);
        bt3.setFont(f2);
        bt3.setBackground(Color.RED);
        bt3.setForeground(Color.BLACK);
        bt3.setOpaque(true);
        bt3.setContentAreaFilled(true);
        bt3.setBorderPainted(false);
        bt3.addActionListener(this);
        panel.add(bt3);

        ta = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setBounds(500, 70, 440, 550);
        ta.setFont(f2);
        panel.add(scrollPane);

        add(panel);

        
    }

    public void mouseClicked(MouseEvent me) 
    {
        if (me.getSource() == label1) {
            label1.setText("Bus Ticketing System");
        }
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == bt1) {
            bt1.setBackground(Color.BLUE);
            bt1.setForeground(Color.BLACK);
        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == bt1) {
            bt1.setBackground(Color.GREEN);
            bt1.setForeground(Color.BLACK);
        }
    }
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt3) {
            System.exit(0);
        } else if (ae.getSource() == bt2) {
            showTickets();
        } else if (ae.getSource() == bt1) {
           String s1 = tf1.getText().trim();
            String s2 = tf2.getText().trim();

            if (!s2.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(this, "Invalid phone number! Must be 11 digits.");
                return;
            }

            String s3 = rb1.isSelected() ? rb1.getText() : rb2.isSelected() ? rb2.getText() : rb3.isSelected() ? rb3.getText() : "";
            String s4 = cbFrom.getSelectedItem().toString();
            String s5 = cbTo.getSelectedItem().toString();

            if (s4.equals(s5)) {
                JOptionPane.showMessageDialog(this, "From and To cannot be the same!");
                return;
            }

            String s6 = jb.getSelectedItem().toString();
            String s7 = rb4.isSelected() ? rb4.getText() : rb5.isSelected() ? rb5.getText() : "";

            StringBuilder seatBuilder = new StringBuilder();
            if (cb1.isSelected()) seatBuilder.append(cb1.getText()).append(" ");
            if (cb2.isSelected()) seatBuilder.append(cb2.getText()).append(" ");
            if (cb3.isSelected()) seatBuilder.append(cb3.getText()).append(" ");
            if (cb4.isSelected()) seatBuilder.append(cb4.getText()).append(" ");
            String s8 = seatBuilder.toString().trim();

            String s9 = tf3.getText().trim();
            String s10 = tf4.getText().trim();

            if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty() || s10.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all required fields!");
                return;
            }

            Ticket t = new Ticket(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
            t.insertInfo();
            JOptionPane.showMessageDialog(this, "Ticket booked!");
            showTickets();
        }
    }
    
    public void showTickets() {
        ta.setText("");
        try (BufferedReader br = new BufferedReader(new FileReader("./Data/ticketdata.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
                ta.append(line + "\n");
            }

        } 
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(this, "Error reading file!");
        }
    }
    
}