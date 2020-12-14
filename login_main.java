package bus_booking;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class login_main extends JFrame implements ActionListener{
	JButton signinBtn,signupBtn,exitBtn;
	login_main(){
		setTitle("Bus Ticket Booking System");
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.CYAN);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Login/Register");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		getContentPane().add(label);
		setBounds(600, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 

		   
		signinBtn = new JButton("Sign IN\n");
		signupBtn = new JButton("Sign UP");
		exitBtn = new JButton("EXIT");
		signinBtn.addActionListener(this);
		signupBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(signinBtn);
		add(signupBtn);
		add(exitBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == signinBtn) {
			login_check frame1 = new login_check();
			repaint();
	      } 
		else if (ae.getSource() == signupBtn) {
			adddet_login frame2 = new adddet_login();
	         repaint();
	      } 
		else if (ae.getSource() == exitBtn) {
			Runtime.getRuntime().exit(1);
	         repaint();
	      }
	}
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login_main frame = new login_main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
