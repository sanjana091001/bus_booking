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
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Admin");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		busBtn = new JButton("Bus");
		exitBtn = new JButton("Exit");
		busBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(busBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == busBtn) {
			 new busbtn_admin();
	         repaint();
	      } 
		else if (ae.getSource() == exitBtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
}
