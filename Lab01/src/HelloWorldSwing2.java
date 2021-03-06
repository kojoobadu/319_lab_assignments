import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class HelloWorldSwing2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static int state = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldSwing2 frame = new HelloWorldSwing2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HelloWorldSwing2() {
		setTitle("HelloWorldSwing!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("Test:");
		lblTest.setBounds(10, 11, 59, 17);
		contentPane.add(lblTest);
		
		JLabel label = new JLabel("");
		label.setBounds(190, 69, 136, 36);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.getDocument().addDocumentListener(new DocumentListener(){
            
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
                label.setText(textField.getText());
            }
            
        }
                                            );
		textField.setBounds(60, 9, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(167, 9, 69, 20);
		comboBox.addItem("Tiny");
		comboBox.addItem("Small");
		comboBox.addItem("Medium");
		comboBox.addItem("Large");
		contentPane.add(comboBox);
		final Font tiny = new Font("Arial",Font.PLAIN,8);
        final Font small = new Font("Arial",Font.PLAIN,12);
        final Font medium = new Font("Arial",Font.PLAIN,20);
        final Font large = new Font("Arial",Font.PLAIN,28);
		
        comboBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                JComboBox size = (JComboBox)e.getSource();
                String word = (String)size.getSelectedItem();
                if(word.equals("Tiny")){
                    label.setFont(tiny);
                }
                else if(word.equals("Small")){
                    label.setFont(small);
                }
                else if(word.equals("Medium")){
                    label.setFont(medium);
                }
                else{
                    label.setFont(large);
                }
            }
		});
        
        final Font plain = new Font("Helvetica",Font.PLAIN,12);
        final Font bold = new Font("Helvetica",Font.BOLD,12);
        final Font italic = new Font("Helvetica",Font.ITALIC,12);
        final Font Bitalic = new Font("Helvetica",Font.ITALIC + Font.BOLD,12);
		
		JRadioButton rdbtnPlain = new JRadioButton("Plain");
		rdbtnPlain.setBounds(10, 35, 109, 23);
		contentPane.add(rdbtnPlain);
		
		JRadioButton rdbtnBold = new JRadioButton("Bold");
		rdbtnBold.setBounds(10, 61, 109, 23);
		contentPane.add(rdbtnBold);
		
		JRadioButton rdbtnItalic = new JRadioButton("Italic");
		rdbtnItalic.setBounds(10, 87, 109, 23);
		contentPane.add(rdbtnItalic);
		
		JRadioButton rdbtnBoldItalic = new JRadioButton("Bold Italic");
		rdbtnBoldItalic.setBounds(10, 113, 109, 23);
		contentPane.add(rdbtnBoldItalic);
		
		rdbtnPlain.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label.setFont(plain);
            }
        });
        rdbtnBold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	label.setFont(bold);
            }
        });
        rdbtnItalic.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	label.setFont(italic);
            }
        });
        rdbtnBoldItalic.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	label.setFont(Bitalic);
            }
        });
		
		JButton btnNewButton = new JButton("Show!\r\n");
		btnNewButton.setBounds(75, 147, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e){
				if(isRed()){
                    label.setForeground(Color.RED);
                    state = 1;
                }
                else{
                    label.setForeground(Color.BLACK);
                    state = 0;
                }
			}
		});
		
		JButton btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.setBounds(209, 147, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		
		
		
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
