package swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiCheckBox extends JFrame {
	
	private JList list;
	private static String colornames[] = {"red", "yellow", "green", "blue"};
	private static Color colors[] = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE};
	
	public GuiCheckBox(){
		
		super("The Title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scroll = new JScrollPane(list);
		add(list);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent event){
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
				
			}
		});
		
		
		
	}

}
