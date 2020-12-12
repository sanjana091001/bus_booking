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

public class busbtn extends JFrame implements ActionListener{
	JButton addBtn, searchBtn, editBtn, deleteBtn;
	JLabel desc;
	JTextField n;
	busbtn()
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
		addBtn.addActionListener(new ActionListener() {
			bus obj=new bus(1,50,"bus_type1","bus_ownner1","driver1", "cond1", "bus1",33);
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					obj.addBus();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
			});
		JButton searchBtn=new JButton("Search Bus");
		JButton editBtn=new JButton("Edit Bus");
		JButton deleteBtn=new JButton("Delete Bus");
		deleteBtn.addActionListener(new ActionListener() {
			bus obj=new bus(1,50,"bus_type1","bus_ownner1","driver1", "cond1", "bus1",33);
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					obj.deleteBus("BUS1");
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
			});
		addBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		editBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		add(addBtn);
		add(searchBtn);
		add(editBtn);
		add(deleteBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		bus obj=new bus(1,50,"bus_type1","bus_owner1","driver1", "cond1", "bus1",33);
		if(ae.getSource() == addBtn)
		{
			try
			{
				obj.addBus();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
		else if(ae.getSource()==searchBtn)
		{
			try
			{
				obj.searchBus("bus1");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
		else if(ae.getSource()==editBtn)
		{
			try
			{
				obj.editBus("bus1");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
		else if(ae.getSource()==deleteBtn)
		{
			try
			{
				obj.deleteBus("BUS1");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
		
	}
}
