package bus_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class userbtn extends JFrame implements ActionListener{
	JButton addBtn, modifyBtn,exitbtn;
	TextField text = new TextField(20);
	userbtn(){
		setTitle("User");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("User");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addBtn = new JButton("Add new User ");
		addBtn.addActionListener(this);
		modifyBtn = new JButton("Change password");
		modifyBtn.addActionListener(this);
		exitbtn = new JButton("Exit");
		exitbtn.addActionListener(this);
		add(addBtn);
		add(modifyBtn);
		add(exitbtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == addBtn) {
			user obj1=new user("user111","pass111");
			obj1.addDetails();
			repaint();
	      } 
		else if (ae.getSource() == modifyBtn) {
			user obj1=new user("user111","pass111");
			obj1.modifyDetails("newpass111");
	         repaint();
	      } 
		else if (ae.getSource() == exitbtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
}