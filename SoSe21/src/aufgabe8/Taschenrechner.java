package aufgabe8;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame{
	
	public Taschenrechner() {
		
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		
		
		this.setLocation(200, 150);
		this.setSize(300, 400);
		this.setLayout(null);
		JTextField output = new JTextField ();
		output.setBounds(50, 25, 300, 50);
		this.add(output);
		
		this.setVisible(true);
		

	
		
	
	}
	

	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		
		//JPanel center = new JPanel();

		/* 
		JTextField output = new JTextField (); 
		output.setBounds(50, 25, 300, 50);
		
		*/
		
		
	    //mainPanel.setLayout(new GridLayout(7,3,10,10));
		 
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("(");
		JButton b11 = new JButton("0");
		JButton b12 = new JButton(")");
		JButton b13 = new JButton("*");
		JButton b14 = new JButton("/");
		JButton b15 = new JButton("+");
		JButton b16 = new JButton("-");
		JButton b17 = new JButton(".");
		JButton b18 = new JButton("=");
		
		mainPanel.setBounds(50, 100, 300, 300);
		mainPanel.setLayout(new GridLayout(7,3,10,10));
	
		
		//mainPanel.add(output); if textfield is added to mainpanel, it will never be in a seperate row.
		mainPanel.add(b1);
		mainPanel.add(b2);
		mainPanel.add(b3);
		mainPanel.add(b4);
		mainPanel.add(b5);
		mainPanel.add(b6);
		mainPanel.add(b7);
		mainPanel.add(b8);
		mainPanel.add(b9);
		mainPanel.add(b10);
		mainPanel.add(b11);
		mainPanel.add(b12);
		mainPanel.add(b13);
		mainPanel.add(b14);
		mainPanel.add(b15);
		mainPanel.add(b16);
		mainPanel.add(b17);
		mainPanel.add(b18);
		
		
		
		
		return mainPanel;
		
	}
	
	

	public static void main(String[] args) {
		new Taschenrechner();

	}

}
