package swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Gui extends JFrame {

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public Gui(){
		super("The Title");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField("Kojo is awesome and hot");
		add(tf);
		
		pb = new JRadioButton("Plain",true);
		bb = new JRadioButton("Bold",false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold and Italic",false);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		tf.setFont(pf);
		
		pb.addItemListener(new theHandler(pf));
		bb.addItemListener(new theHandler(bf));
		ib.addItemListener(new theHandler(itf));
		bib.addItemListener(new theHandler(bif));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	
	private class theHandler implements ItemListener{
		
		private Font font;
		
		public theHandler(Font f){
			font = f;
		}
		
		
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			tf.setFont(font);
		}
		
	}

	
	
}
