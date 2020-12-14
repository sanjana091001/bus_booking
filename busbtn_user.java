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

public class busbtn_user extends JFrame implements ActionListener{
	JButton searchBtn;
	JLabel desc;
	JTextField n;
	busbtn_user()
	{
		setTitle("Bus Details");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		searchBtn=new JButton("Search Bus");
		searchBtn.addActionListener(this);
		add(searchBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == searchBtn)
		{
			bus obj1=new bus();
			obj1.searchBus("BUS3");
			repaint();
		}
	}
}
