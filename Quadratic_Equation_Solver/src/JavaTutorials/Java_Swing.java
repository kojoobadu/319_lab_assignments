	package JavaTutorials;

import javax.swing.JOptionPane;

public class Java_Swing {
	
	public static void main(String args[]){
	
	String fn;
	String sn;
	int num1 = 0;
	int num2 = 0;
	int sum = 0;
	
	
	fn = JOptionPane.showInputDialog("Enter first number");
	sn = JOptionPane.showInputDialog("Enter second number");
	
	num1 = Integer.parseInt(fn);
	num2 = Integer.parseInt(sn);
	
	sum = num1 + num2;
	
	JOptionPane.showMessageDialog(null, "The answer is " + sum ,
			"Sum", JOptionPane.PLAIN_MESSAGE);
	
	}

}
