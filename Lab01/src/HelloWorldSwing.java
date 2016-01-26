import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class HelloWorldSwing {
    
    private static JLabel bPressed;
    private static String text;
    private static JTextField t;
    private static JRadioButton b1,b2, b3, b4;
    private static int state = 0;
    
    
    
    public static void main(String args[]){
        JFrame frame = new JFrame("HelloWorldSwing!");
        frame.setSize(new Dimension(370,220));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(mainPanel);
        
        
        JPanel p = new JPanel();
        JLabel l = new JLabel("Text:    ");
        t = new JTextField(20);
        /*	t.addActionListener(new ActionListener(){
         
         @Override
         public void actionPerformed(ActionEvent e){
         text = t.getText();
         bPressed.setText(text);
         }
         });*/
        
        //This is the new code for it to appear automatically on bPressed(Jlabel)
        //without pressing enter.
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
        p.add(l);
        p.add(t);
        p.add(combo);
        mainPanel.add(p);
        
        
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
        JButton show = new JButton("Show!");
        show.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(isRed()){
                    bPressed.setForeground(Color.RED);
                    state = 1;
                }
                else{
                    bPressed.setForeground(Color.BLACK);
                    state = 0;
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
        
        
        p3.add(show);
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


	

