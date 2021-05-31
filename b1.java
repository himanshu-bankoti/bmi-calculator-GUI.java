package bmi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class b1 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	static int h;
	static int w;
	 JComboBox combo1;
	 static String k;
	 static double bmi;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b1 frame = new b1();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b1() {


Add:




		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1071, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) { //making jtextfields excepts integer only
			char h=e.getKeyChar();
			if(Character.isLetter(h)&&!e.isAltDown()) {
				e.consume();
			}//making jtextfields excepts integer only
			}
					});
		t1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		t1.setBounds(363, 241, 364, 58);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {//making jtextfields excepts integer only
				char h=e.getKeyChar();
				if(Character.isLetter(h)&&!e.isAltDown()) {
					e.consume();
				}//making jtextfields excepts integer only
				
			}
		});
		t2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		t2.setBounds(363, 373, 364, 58);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("Calculate");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		
			
				 k=(String) combo1.getSelectedItem();//getting value of combobox
				
				h=Integer.parseInt(t1.getText());//getting the values from the jtextfields and converting them to int
				w=Integer.parseInt(t2.getText());//getting the values from the jtextfields and converting them to int
				float a=(h/100f);//converting height in to meters
			
				bmi=(w/(a*a));//main formula for calculating the BMI
				
				b2 him=new b2();
				him.setVisible(true);
				dispose();
				
				//JOptionPane.showMessageDialog(null,"%.2f"+ bmi);
			}
			
			catch (Exception ed)
			{
				JOptionPane.showMessageDialog(null, ed);
			}
			}
		});
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(32, 178, 170));
		b1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		b1.setBounds(365, 517, 150, 40);
		contentPane.add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(363, 196, 180, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(".cm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(737, 286, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Weight");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(362, 309, 230, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(".kg");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(737, 410, 45, 21);
		contentPane.add(lblNewLabel_4);
		
		combo1 = new JComboBox();
		combo1.setFont(new Font("Tahoma", Font.BOLD, 19));
		combo1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		combo1.setToolTipText("");
		combo1.setBounds(362, 455, 212, 35);
		contentPane.add(combo1);
		
		JLabel lblNewLabel_5 = new JLabel("BMI Calculator");
		lblNewLabel_5.setFont(new Font("Chiller", Font.BOLD, 86));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(380, 33, 447, 123);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/image/image.jpg")));
		lblNewLabel.setBounds(0, 0, 1067, 745);
		contentPane.add(lblNewLabel);
	}
}
