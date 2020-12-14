package bus_booking;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class bus_standbtn extends JFrame implements ActionListener{
	JButton addBtn, modifyBtn;
	JLabel desc;
	JTextField n;
	bus_standbtn()
	{
		setTitle("Booking");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus Stand");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		desc=new JLabel("User id");
		n=new JTextField("User1", 5);
		JButton addBtn = new JButton("Add new user");
		JButton modifyBtn=new JButton("Modify details");
		addBtn.addActionListener(this);
		modifyBtn.addActionListener(this);
		add(addBtn);
		add(modifyBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		user obj=new user("user4", "pass4");
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
				obj.modifyDetails("newPass4");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
	}
}
