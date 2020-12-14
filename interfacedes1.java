package bus_booking;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class interfacedes1 extends JFrame implements ActionListener{
	JButton adminBtn,userBtn,exitBtn;
	interfacedes1(){
		setTitle("Admin or User");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus Booking System");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		   
		adminBtn = new JButton("ADMIN");
		userBtn = new JButton("USER");
		exitBtn = new JButton("EXIT");
		adminBtn.addActionListener(this);
		userBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(adminBtn);
		add(userBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == adminBtn) {
			new interface_admin();
			repaint();
	      } 
		else if (ae.getSource() == userBtn) {
			new interface_user();
	         repaint();
	      } 
		else if (ae.getSource() == exitBtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
}
