package aufgabe9;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame implements ActionListener{
	
	JButton[] number = new JButton[10]; 
	JButton[] function = new JButton[11];
	JButton bo, bc, mul, div, plus, minus, dot, eq, clr, del, neg;
	
	JTextField output = new JTextField ();
	double num1=0;
	double num2=0;
	double result=0;
	char c;
	
	public Taschenrechner() {
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);	
		this.setLocation(200, 150);
		this.setSize(400, 500);
		this.setLayout(null);
		
		output.setBounds(50, 25, 300, 50);
		this.add(output);		
		this.setVisible(true);
		
	
		
	}
	
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel(); 

	
	
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		
		JButton bo = new JButton("(");
		JButton b11 = new JButton("0");
		JButton bc = new JButton(")");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton dot = new JButton(".");
		JButton eq = new JButton("=");
		JButton clr = new JButton("clr");
		JButton del = new JButton("del");
		JButton neg = new JButton("(-)");
		
		number[0]= b1;
		number[1]= b2;
		number[2]= b3;
		number[3]= b4;
		number[4]= b5;
		number[5]= b6;
		number[6]= b7;
		number[7]= b8;
		number[8]= b9;
		number[9]= b11;
		
		
		function[0]= bo;
		function[1]= bc;
		function[2]= mul;
		function[3]= div;
		function[4]= plus;
		function[5]= minus;
		function[6]= dot;
		function[7]= eq;
		function[8]= clr;
		function[9]= del;
		function[10]= neg;
		
		for(int i =0;i<11;i++) {

			function[i].addActionListener(this);

			
		}

		
		for(int i =0;i<10;i++) {

			number[i] = new JButton(String.valueOf(i));

			number[i].addActionListener(this);

		}
			
		
		mainPanel.setBounds(50, 100, 300, 300);
		mainPanel.setLayout(new GridLayout(7,3,10,10));
	
		mainPanel.add(number[0]);
		mainPanel.add(number[1]);
		mainPanel.add(number[2]);
		mainPanel.add(number[3]);
		mainPanel.add(number[4]);
		mainPanel.add(number[5]);
		mainPanel.add(number[6]);
		mainPanel.add(number[7]);
		mainPanel.add(number[8]);
		mainPanel.add(number[9]);
		mainPanel.add(function[0]);
		mainPanel.add(function[1]);
		mainPanel.add(function[2]);
		mainPanel.add(function[3]);
		mainPanel.add(function[4]);
		mainPanel.add(function[5]);
		mainPanel.add(function[6]);
		mainPanel.add(function[7]);
		mainPanel.add(function[8]);
		mainPanel.add(function[9]);
		mainPanel.add(function[10]);
		
			
		return mainPanel;	
	}
	
	
	public static void main(String[] args) {
		new Taschenrechner();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			if(e.getSource()== number[i]) {
				output.setText(output.getText().concat(String.valueOf(number)));	
			}
		}
		if(e.getSource()== Taschenrechner.this.initContent()) {
			output.setText(output.getText().concat("."));	
		}
		if(e.getSource()== bo) {
			output.setText(output.getText().concat("("));	
		}
		
		if(e.getSource()== bc) {
			output.setText(output.getText().concat(")"));	
		}
		
		if(e.getSource()== plus) {
			num1= Double.parseDouble(output.getText());
					c = '+';
					output.setText("");
		}
		
		if(e.getSource()== minus) {
			num1= Double.parseDouble(output.getText());
			c = '-';
			output.setText("");
		}
		
		if(e.getSource()== mul) {
			num1= Double.parseDouble(output.getText());
			c = '*';
			output.setText("");
		}
		if(e.getSource()== div) {
			num1= Double.parseDouble(output.getText());
			c = '/';
			output.setText("");
		}
		if(e.getSource()== eq) {
			num2= Double.parseDouble(output.getText());
			
			switch(c) {
			case'+':

				result=num1+num2;

				break;

			case'-':

				result=num1-num2;

				break;

			case'*':

				result=num1*num2;

				break;

			case'/':

				result=num1/num2;

				break;
			}
			output.setText(String.valueOf(result));
			num1=result;
	}
		if(e.getSource()== clr) {

			output.setText("");
		}
		if(e.getSource()== del) {

			String string = output.getText();

			output.setText("");

			for(int i=0;i<string.length()-1;i++) {

				output.setText(output.getText()+string.charAt(i));

			}

		}

		if(e.getSource()== neg) {

			double temp = Double.parseDouble(output.getText());

			temp*=-1;

			output.setText(String.valueOf(temp));

		}
}
}

