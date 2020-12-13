package bus_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class userbtn extends JFrame implements ActionListener{
	JButton addBtn, modifyBtn,exitbtn;
	TextField text = new TextField(20);
	userbtn(){
		setTitle("User");
		getContentPane().setBackground(Color.white);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.white);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("User");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
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