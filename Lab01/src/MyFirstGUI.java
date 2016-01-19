import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFirstGUI {
	private static JPanel createBottomPanel() {
		JPanel p = new JPanel();
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Submitted");
					}
					
				});
		submitButton.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("We made it");
					}
					
				});
		
		p.add(submitButton);
		return p;
	}
	static JPanel createTopPanel() {
		JPanel p = new JPanel();
		p.add(new JLabel("Name:"));
		p.add(new JTextField("Please enter your name here"));
		return p;
	}
	static JFrame createAndSetupFrame() {
		JFrame f = new JFrame("My new Awesome JFrame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		return f;
	}

	public static void main(String[] args) {

		// CREATE A JFRAME 
		JFrame f = createAndSetupFrame();
		f.setSize(370,220);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		f.setContentPane(mainPanel);
		
		// CREATE THE TOP PANEL
		JPanel topPanel = createTopPanel();
		mainPanel.add(topPanel);
				
		// CREATE THE MIDDLE PANEL
		
		// CREATE THE BOTTOM PANEL
		JPanel bottomPanel = createBottomPanel();
		mainPanel.add(bottomPanel);
		
		// SHOW ME
		//f.pack();
		f.setVisible(true);
	}


}
