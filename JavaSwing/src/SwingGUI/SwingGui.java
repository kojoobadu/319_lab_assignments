package SwingGUI;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingGui {
	
	public static void main(String args[]){
		//Creating a JFrame
		JFrame myFirstJFrame = createAndSetupFrame();
		myFirstJFrame.setVisible(true);
		myFirstJFrame.setSize(400, 400);
		myFirstJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JButton submit = new JButton("Submit");
		
		// Top panel
		JPanel topPanel = new JPanel();
		
		
	}
	
	public static JFrame createAndSetupFrame(){
		JFrame f = new JFrame("My First JFrame");
		return f;
		
	}

}