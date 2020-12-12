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

public class exitbtn extends JFrame implements ActionListener{
	JButton addBtn, modifyBtn;
	JLabel desc;
	JTextField n;
	exitbtn()
	{
		setTitle("Booking");
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Booking");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
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
