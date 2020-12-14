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

public class bookingbtn extends JFrame implements ActionListener {
	JButton addbookingBtn, cancelbookingBtn, exitBtn;
	JLabel desc;
	JTextField n;
	bookingbtn()
	{
		setTitle("Booking/Cancel");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Booking/Cancel");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addbookingBtn = new JButton("Book new ticket");
		cancelbookingBtn=new JButton("Cancel ticket");
		exitBtn=new JButton("Exit");
		addbookingBtn.addActionListener(this);
		cancelbookingBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(addbookingBtn);
		add(cancelbookingBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == addbookingBtn)
		{
			booking obj1=new booking(2020,"ekm", "tvm");
			obj1.addBooking(5, "BUS3");
			repaint();
		}
		else if(ae.getSource()==cancelbookingBtn)
		{
			booking obj1=new booking(2020,"ekm", "tvm");
			obj1.cancellation(10, "BUS3");
			repaint();
		}
		else if(ae.getSource()==exitBtn)
		{
			Runtime.getRuntime().exit(1);
			repaint();
		}
	}
}
