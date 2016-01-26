package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class examSwing extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JLabel label;
	
	private JPasswordField passwordField;
	
	public examSwing (){
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		item2 = new JTextField("Enter text here");
		item3 = new JTextField("Uneditable", 20);	 
		item3.setEditable(false);
		
		passwordField = new JPasswordField("myPass");
		
		add(item1);
		add(item2);
		add(item3);
		add(passwordField);
		
		theHandler handle = new theHandler();
		item1.addActionListener(handle);
		item2.addActionListener(handle);
		item3.addActionListener(handle);
		passwordField.addActionListener(handle);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	private class theHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				
			String word = "";
			
			if(e.getSource() == item1){
				word = word.format("Field 1 was: %s", e.getActionCommand());
			}
			else if(e.getSource() == item2){
				word = word.format("Field 2 was: %s", e.getActionCommand());
			}
			else if(e.getSource() == item3){
				word = word.format("Field 3 was: %s", e.getActionCommand());
			}
			else if(e.getSource() == passwordField){
				word = word.format("Password field was: %s", e.getActionCommand());
			}	
			
			JOptionPane.showMessageDialog(null, word);
		}
		
		
	}
	
}
