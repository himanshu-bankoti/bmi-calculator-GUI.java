package bmi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class b2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b2 frame = new b2();
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
	public b2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(21, 10, 520, 711);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblNewLabel_1.setBounds(42, 36, 663, 62);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("calculate again");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			b1 h=new b1();
		    h.setVisible(true);
		    dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(100, 651, 204, 38);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		lblNewLabel_2.setBounds(81, 104, 360, 516);
		panel.add(lblNewLabel_2);
		
		if((b1.k).equals("Male"))
		{
			if(b1.bmi<=17.5)
			{
				lblNewLabel_1.setText("Severly underweight");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/hj.jpg")));
			}
			else if(b1.bmi>=17.6&&b1.bmi<=18.4)
			{
				lblNewLabel_1.setText("underweight");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/hj.jpg")));
			}
			else if(b1.bmi>=18.5&&b1.bmi<=25)
			{
				lblNewLabel_1.setText("Optimal Fitness");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/ghu.jpg")));
			}
			else if(b1.bmi>=25.1&&b1.bmi<=30)
			{
				lblNewLabel_1.setText("overweight");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/ppo.jpg")));
			}
			else if(b1.bmi>=30.1&&b1.bmi<40)
			{
				lblNewLabel_1.setText("obese");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/df.jpg")));
			}
			else if(b1.bmi>=40.1)
			{
				lblNewLabel_1.setText("severly obese");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/sb.jpg")));
			}
			
		}
		
		else if(b1.k.equals("Female"))
		{
			if(b1.bmi<=18.5)
			{
				lblNewLabel_1.setText("underweight");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/hj.jpg")));
			}
			else if(b1.bmi>=18.5&&b1.bmi<=24.9)
			{
				lblNewLabel_1.setText("optimal fitness");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/ghu.jpg")));
			}
			else if(b1.bmi>=25.0&&b1.bmi<=29.9)
			{
				lblNewLabel_1.setText("overweight");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/ppo.jpg")));
			}
			else if(b1.bmi>=30&&b1.bmi<=40)
			{
				lblNewLabel_1.setText("obese");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/df.jpg")));
			}
			else if(b1.bmi>=40)
			{
				lblNewLabel_1.setText("Severly obese");
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/image/sb.jpg")));
			}
			
		}
		//lblNewLabel_1.setText(Double.toString(b1.bmi));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(64, 224, 208));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\image.jpg"));
		lblNewLabel.setBounds(0, 0, 1129, 764);
		contentPane.add(lblNewLabel);
	}
}
