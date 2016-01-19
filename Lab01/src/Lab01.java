import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Lab01 {

	public static void main(String args[]){
		JFrame frame = new JFrame("HelloWorldSwing!");
		frame.setSize(new Dimension(370,220));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.setContentPane(mainPanel);
		
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("Text:    ");	
		JTextField t = new JTextField("Hello World");
		String[] fontSize = {"Tiny", "Small", "Medium", "Large"};
		JComboBox<String> combo = new JComboBox<>(fontSize);
		p.add(l);
		p.add(t);
		p.add(combo);
		mainPanel.add(p);
		
		
		JPanel p2 =  new JPanel();
		JRadioButton b1 = new JRadioButton("Plain");
		JRadioButton b2 = new JRadioButton("Bold");
		JRadioButton b3 = new JRadioButton("Italic");
		JRadioButton b4 = new JRadioButton("Bold Italic");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		mainPanel.add(p2);
		
	
		JPanel p3 = new JPanel();
		JButton bu1 = new JButton("Show!");
		bu1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				String text = t.getText();
				JLabel bPressed = new JLabel(text);
				p3.add(bPressed);
			}
		});
		JButton bu2 = new JButton("Exit");
		
		p3.add(bu1);
		p3.add(bu2);
		mainPanel.add(p3);
		
		
		
		//frame.pack();
		frame.setVisible(true);
	}
}