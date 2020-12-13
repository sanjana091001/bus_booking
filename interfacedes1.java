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
		
		adminBtn = new JButton("Admin");
		userBtn = new JButton("User");
		exitBtn = new JButton("Exit");
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
