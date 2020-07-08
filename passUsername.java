
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ui implements ActionListener{

	JFrame frame;
	JPanel panel;
	JTextField username;
	JPasswordField password;
	JLabel user,pass;
	JButton button;
	
	Ui(){
		frame=new JFrame("Login Window");
		panel=new JPanel();
		username=new JTextField(10);
		password=new JPasswordField(10);
 		user=new JLabel("Username: ");
		pass=new JLabel("Password: ");
		button=new JButton("Login");
		button.addActionListener(this);
		panel.add(user);
		panel.add(username);
		panel.add(pass);
		panel.add(password);
		panel.add(button);
		frame.add(panel);
		frame.setSize(250,250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ui();
	}

	@Override
	public void actionPerformed(ActionEvent obj) {
		// TODO Auto-generated method stub
		if(obj.getSource()==button){
			if(username.getText().equals("xyz")){
				if(password.getText().equals("xyz")){
					System.out.println("User authorised");
					//frame.dispose();
					//new Ui1();
				}
				else{
					System.out.println("password is wrong");
				}
			}
			else
				System.out.println("Username is wrong");
		}
	}
	
}
