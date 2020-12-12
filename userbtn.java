package bus_booking;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class userbtn extends JFrame implements ActionListener {
	JButton addBtn, modifyBtn;
	JLabel desc;
	JTextField n;
	userbtn()
	{
		setTitle("User");
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("User");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		desc=new JLabel("User id");
		n=new JTextField("User1", 5);
		addBtn = new JButton("Add new user");
		modifyBtn=new JButton("Modify details");
		addBtn.addActionListener(this);
		modifyBtn.addActionListener(this);
		add(addBtn);
		add(desc);
		add(n);
		add(modifyBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		user obj=new user("user1","pass1");
		if(ae.getSource() == addBtn)
		{
			try
			{
				obj.addDetails();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
		else if(ae.getSource()==modifyBtn)
		{
			try
			{
				obj.modifyDetails(n.getText());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
	}

}
