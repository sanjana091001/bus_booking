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
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus Details");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
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
