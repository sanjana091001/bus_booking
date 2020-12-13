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

public class busbtn_admin extends JFrame implements ActionListener{
	JButton addBtn, searchBtn, deleteBtn, editBtn, exitBtn;
	JLabel desc;
	JTextField n;
	busbtn_admin()
	{
		setTitle("Bus");
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Bus");
		label.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		getContentPane().add(label);
		setBounds(400, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton addBtn = new JButton("Add new Bus");
		JButton searchBtn=new JButton("Search Bus");
		JButton editBtn=new JButton("Edit Bus");
		JButton deleteBtn=new JButton("Delete Bus");
		JButton exitBtn=new JButton("Exit");
		addBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		editBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(addBtn);
		add(searchBtn);
		add(editBtn);
		add(deleteBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == addBtn)
		{
			bus obj1=new bus();
			obj1.addBus(50,"owner15", "driver15","conductor15", "BUS155", 15);
			repaint();
		}
		else if(ae.getSource()==searchBtn)
		{
			bus obj1=new bus();
			obj1.searchBus("BUS3");
			repaint();
		}
		else if(ae.getSource()==editBtn)
		{
			bus obj1=new bus();
			obj1.editBus("BUS3");
			repaint();
		}
		else if(ae.getSource()==deleteBtn)
		{
			bus obj1=new bus();
			repaint();
		}
		else if(ae.getSource()==exitBtn)
		{
			Runtime.getRuntime().exit(1);
			repaint();
		}
		
	}


}