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
		
		
		addBtn = new JButton("Add new Bus");
		searchBtn=new JButton("Search Bus");
		editBtn=new JButton("Edit Bus");
		deleteBtn=new JButton("Delete Bus");
		exitBtn=new JButton("Exit");
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
			add_details obj=new add_details();
			/*String bus_cond=obj.bus_cond;
			String bus_own=obj.bus_own;
			String bus_driv=obj.bus_driv;
			String bus_id=obj.bus_id;
			int route=obj.route;
			int nos=obj.nos;
			bus bus1=new bus();
			bus1.addBus(nos, bus_own, bus_driv, bus_cond, bus_id, route);*/
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
			obj1.deleteBus("BUS10");
			repaint();
		}
		else if(ae.getSource()==exitBtn)
		{
			Runtime.getRuntime().exit(1);
			repaint();
		}
		
	}


}