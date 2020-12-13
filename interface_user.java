package bus_booking;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class interface_user extends JFrame implements ActionListener{
	JButton userbtn,bookingbtn,busbtn,bus_standbtn,exitbtn;
	interface_user(){
		setTitle("USER");
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
		
		userbtn = new JButton("Add user/change password");
		bookingbtn = new JButton("Book/Cancel Ticket");
		busbtn = new JButton("Bus Details");
		bus_standbtn = new JButton("Bus Stand Details");
		exitbtn = new JButton("Exit");
		userbtn.addActionListener(this);
		bookingbtn.addActionListener(this);
		busbtn.addActionListener(this);
		bus_standbtn.addActionListener(this);
		exitbtn.addActionListener(this);
		add(userbtn);
		add(bookingbtn);
		add(busbtn);
		add(bus_standbtn);
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
			new busbtn_user();
	         repaint();
	      } 
		else if (ae.getSource() == bus_standbtn) {
			new bus_standbtn();
	         repaint();
	      }
		else if (ae.getSource() == exitbtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
}
