package bus_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class interfacedes extends JFrame implements ActionListener{
	JButton userbtn, bookingbtn, busbtn, bus_standbtn, loginbtn, exitbtn;
	interfacedes(){
		setTitle("Bus Booking System");
		getContentPane().setBackground(Color.white);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.white);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus Booking System");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		userbtn = new JButton("User");
		bookingbtn = new JButton("Booking");
		busbtn = new JButton("Bus Details");
		bus_standbtn = new JButton("Bus Stand Details");
		loginbtn = new JButton("Login");
		exitbtn = new JButton("Exit");
		userbtn.addActionListener(this);
		bookingbtn.addActionListener(this);
		busbtn.addActionListener(this);
		bus_standbtn.addActionListener(this);
		loginbtn.addActionListener(this);
		exitbtn.addActionListener(this);
		add(userbtn);
		add(bookingbtn);
		add(busbtn);
		add(bus_standbtn);
		add(loginbtn);
		add(exitbtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == userbtn) {
			 new userbtn();
	         repaint();
	      } 
		else if (ae.getSource() == bookingbtn) {
			new bookingbtn();
	         repaint();
	      } 
		else if (ae.getSource() == busbtn) {
			new busbtn();
	         repaint();
	      }
		else if (ae.getSource() == bus_standbtn) {
			new bus_standbtn();
	         repaint();
	      }
		else if (ae.getSource() == loginbtn) {
			new loginbtn();
	         repaint();
	      } 
		else if (ae.getSource() == exitbtn) {
			new exitbtn();
	         repaint();
	      }
	}
}
