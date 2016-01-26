import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class HelloWorldSwing3 {
    
    private static JLabel bPressed, lblNewLabel;
    private static String text, secondTextFieldText, input;
    private static JTextField t,newTextField;
    private static JRadioButton b1,b2, b3, b4;
    private static int state, nState, seconds;
    static Timer timer;
    private static int cnt,count;
    private static JButton show;
    private static boolean checked;
     
    
    public static void main(String args[]){
    	state = 0;
    	nState = 0;
        JFrame frame = new JFrame("HelloWorldSwing!");
        frame.setSize(new Dimension(370,220));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(mainPanel);
        
        
        JPanel p = new JPanel();
        JLabel l = new JLabel("Text:    ");
        l.setBounds(10, 11, 59, 17);
        t = new JTextField(6);
        t.setBounds(60, 9, 86, 20);
  
        t.getDocument().addDocumentListener(new DocumentListener(){
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
                
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
                
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
                
            }
            
            public void update(){
                bPressed.setText(t.getText());
            }
            
        }
                                            );
        
        timer = new Timer(3000, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("wow");
				lblNewLabel.setText("");
			}
		});
        
        

        
        
        
        String[] fontSize = {"Tiny", "Small", "Medium", "Large"};
        JComboBox<String> combo = new JComboBox<>(fontSize);
        final Font tiny = new Font("Arial",Font.PLAIN,8);
        final Font small = new Font("Arial",Font.PLAIN,12);
        final Font medium = new Font("Arial",Font.PLAIN,20);
        final Font large = new Font("Arial",Font.PLAIN,28);
        combo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                JComboBox size = (JComboBox)e.getSource();
                String word = (String)size.getSelectedItem();
                if(word.equals("Tiny")){
                    bPressed.setFont(tiny);
                }
                else if(word.equals("Small")){
                    bPressed.setFont(small);
                }
                else if(word.equals("Medium")){
                    bPressed.setFont(medium);
                }
                else{
                    bPressed.setFont(large);
                }
            }
        });
        
        JCheckBox checkBox = new JCheckBox();
        final JLabel newLabel = new JLabel("clear after:");
       newTextField = new JTextField("0");
       secondTextFieldText = newTextField.getText();
       int textValue = Integer.parseInt(secondTextFieldText);
       seconds = textValue * 1000;
        p.add(l);
        p.add(t);
        p.add(combo);
        p.add(checkBox);
        p.add(newLabel);
        p.add(newTextField);
        mainPanel.add(p);
        
        t.addKeyListener(new KeyAdapter(){
        	@Override
        	public void keyPressed(KeyEvent e){
        		String value = t.getText();
        		int l = value.length();
        		input = "";
        		cnt = Integer.parseInt(input);
//        		cnt = Integer.parseInt(t.getText());
        		if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' && cnt < 11){
        			t.setEditable(true);
        			lblNewLabel.setText("");
        			input += e.getKeyChar();
        		}
        		else{
        			t.setEditable(false);
        			lblNewLabel.setText("Enter a number from 1 to 10");
        		}
        	}
        });
      
        checkBox.addActionListener(new ActionListener(){
        	
			@Override
			public void actionPerformed(ActionEvent e){
				AbstractButton abstructButton = (AbstractButton)e.getSource();
				checked = abstructButton.getModel().isSelected();
				System.out.println(checked);
				if(checked){
					nState = 1;
				}
			}
        });
        	
     
        
        JPanel p2 =  new JPanel();
        b1 = new JRadioButton("Plain");
        b2 = new JRadioButton("Bold");
        b3 = new JRadioButton("Italic");
        b4 = new JRadioButton("Bold Italic");
        
        final Font plain = new Font("Helvetica",Font.PLAIN,12);
        final Font bold = new Font("Helvetica",Font.BOLD,12);
        final Font italic = new Font("Helvetica",Font.ITALIC,12);
        final Font Bitalic = new Font("Helvetica",Font.ITALIC + Font.BOLD,12);
        
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                bPressed.setFont(plain);
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                bPressed.setFont(bold);
            }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                bPressed.setFont(italic);
            }
        });
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                bPressed.setFont(Bitalic);
            }
        });
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.setLayout(new GridLayout(5,1));
        
        JPanel P2 = new JPanel();
        bPressed = new JLabel(text);
        P2.add(bPressed);
        P2.setLayout(new GridLayout(1,1));
        
        JPanel p2P2 = new JPanel();
        p2P2.add(p2);
        p2P2.add(P2);
        p2P2.setLayout(new BoxLayout(p2P2, BoxLayout.X_AXIS));
        mainPanel.add(p2P2);
        
        
        
        JPanel p3 = new JPanel();
         show = new JButton("Show!");
        show.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(nState == 1){
                	timer.start();
                }
            }
        });
        
        
        
        JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Closed");
                System.exit(0);
                
            }
        });
        lblNewLabel = new JLabel(""); //this shows the error message
		lblNewLabel.setBounds(178, 150, 36, 16);      
        p3.add(show);
        p3.add(lblNewLabel);
        p3.add(exit);
        mainPanel.add(p3);
        mainPanel.setLayout(new GridLayout(3, 1));
        
        
        
        //frame.pack();
        frame.setVisible(true);
    }
   
    
    private static boolean isRed(){
        if(state == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}

