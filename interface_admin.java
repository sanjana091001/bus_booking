package bus_booking;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class interface_admin extends JFrame implements ActionListener{
	JButton busBtn,adminBtn,exitBtn;
	interface_admin(){
		setTitle("Admin");
		getContentPane().setBackground(Color.white);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.white);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Admin");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		adminBtn = new JButton("Bus Details");
		busBtn = new JButton("Add Admin/change password");
		exitBtn = new JButton("Exit");
		adminBtn.addActionListener(this);
		busBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(adminBtn);
		add(busBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == busBtn) {
			 new busbtn();
	         repaint();
	      } 
		else if (ae.getSource() == adminBtn) {
			new userbtn();
	         repaint();
	      } 
		else if (ae.getSource() == exitBtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
}
