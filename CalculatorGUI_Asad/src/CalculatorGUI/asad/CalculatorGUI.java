
/*  
 MULTI OPERAND CALCULATOR WITH OPERATOR PRECEDENCE
 */


package CalculatorGUI.asad;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorGUI implements ActionListener{
	private JTextField input;
	public static void main(String[] args) {
		new CalculatorGUI().go();
	}
	public void go() {
		JFrame frame = new JFrame("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		panel.setBackground(Color.LIGHT_GRAY);
		input = new JTextField(10);
		MyDraw draw = new MyDraw();
		draw.setPreferredSize(new Dimension(20,60));
		
		frame.getContentPane().add(BorderLayout.NORTH, draw);
		
		input.setFont(new Font("serif", Font.BOLD, 50));
		Border border = BorderFactory.createLineBorder(Color.RED, 5);
		input.setBorder(BorderFactory.createTitledBorder(border, "Multi Operand Calculator with Operator Precedence", 
				                                          TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION,
				                                          new Font("Dialog",Font.BOLD + Font.ITALIC,20) ,
				                                          Color.BLACK));
		
		input.setEditable(false);
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		JButton zero = new JButton("0"); JButton one = new JButton("1"); JButton two = new JButton("2");
		JButton three = new JButton("3"); JButton four = new JButton("4"); JButton five = new JButton("5");
		JButton six = new JButton("6"); JButton seven = new JButton("7"); JButton eight = new JButton("8");
		JButton nine = new JButton("9"); JButton dot = new JButton("."); JButton clear = new JButton("C");
		JButton plus = new JButton("+"); JButton minus = new JButton("-"); JButton multiply = new JButton("*");
		JButton divide = new JButton("/"); JButton equalTo = new JButton("="); JButton modulus = new JButton("%");
		JButton delete = new JButton("←");
		
		zero.setFont(new Font("arial",Font.BOLD,30)); one.setFont(new Font("arial",Font.BOLD,30));
		two.setFont(new Font("arial",Font.BOLD,30)); three.setFont(new Font("arial",Font.BOLD,30));
		four.setFont(new Font("arial",Font.BOLD,30)); five.setFont(new Font("arial",Font.BOLD,30));
		six.setFont(new Font("arial",Font.BOLD,30)); seven.setFont(new Font("arial",Font.BOLD,30));
		eight.setFont(new Font("arial",Font.BOLD,30)); nine.setFont(new Font("arial",Font.BOLD,30));
		plus.setFont(new Font("arial",Font.BOLD,30)); minus.setFont(new Font("arial",Font.BOLD,30));
		divide.setFont(new Font("arial",Font.BOLD,30)); multiply.setFont(new Font("arial",Font.BOLD,30));
		modulus.setFont(new Font("arial",Font.BOLD,30)); clear.setFont(new Font("arial",Font.BOLD,30));
		equalTo.setFont(new Font("arial",Font.BOLD,30)); dot.setFont(new Font("arial",Font.BOLD,30));
		delete.setFont(new Font("null",Font.BOLD,30)); 
		
		equalTo.setBackground(Color.GREEN);
		clear.setBackground(new Color(255,100,100));
		delete.setBackground(new Color(255,150,100));
		plus.setBackground(new Color(255,200,0));
		minus.setBackground(new Color(255,200,0));
		multiply.setBackground(new Color(255,200,0));
		divide.setBackground(new Color(255,200,0));
		modulus.setBackground(new Color(255,200,0));
		one.setBackground(new Color(204,255,255)); two.setBackground(new Color(204,255,255)); 
		three.setBackground(new Color(204,255,255)); four.setBackground(new Color(204,255,255));
		five.setBackground(new Color(204,255,255)); six.setBackground(new Color(204,255,255));
		seven.setBackground(new Color(204,255,255)); eight.setBackground(new Color(204,255,255));
		nine.setBackground(new Color(204,255,255)); zero.setBackground(new Color(204,255,255));
		dot.setBackground(new Color(204,255,255)); 
		
		
		zero.addActionListener(this); one.addActionListener(this); two.addActionListener(this);
		three.addActionListener(this); four.addActionListener(this); five.addActionListener(this);
		six.addActionListener(this); seven.addActionListener(this); eight.addActionListener(this);
		nine.addActionListener(this); dot.addActionListener(this); clear.addActionListener(this);
		plus.addActionListener(this); minus.addActionListener(this); multiply.addActionListener(this);
		divide.addActionListener(this); equalTo.addActionListener(this); modulus.addActionListener(this);
		delete.addActionListener(this);
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0; gbc.weighty = 1.0; 
		
		
		gbc.gridx = 0; gbc.gridy = 1; panel.add(one,gbc);
		gbc.gridx = 1; gbc.gridy = 1; panel.add(two,gbc);
		gbc.gridx = 2; gbc.gridy = 1; panel.add(three,gbc);
		gbc.gridx = 3; gbc.gridy = 1; panel.add(plus,gbc);
		gbc.gridx = 0; gbc.gridy = 2; panel.add(four,gbc);
		gbc.gridx = 1; gbc.gridy = 2; panel.add(five,gbc);
		gbc.gridx = 2; gbc.gridy = 2; panel.add(six,gbc);
		gbc.gridx = 3; gbc.gridy = 2; panel.add(minus,gbc);
		gbc.gridx = 0; gbc.gridy = 3; panel.add(seven,gbc);
		gbc.gridx = 1; gbc.gridy = 3; panel.add(eight,gbc);
		gbc.gridx = 2; gbc.gridy = 3; panel.add(nine,gbc);
		gbc.gridx = 3; gbc.gridy = 3; panel.add(divide,gbc);
		gbc.gridx = 0; gbc.gridy = 4; panel.add(dot,gbc);
		gbc.gridx = 1; gbc.gridy = 4; panel.add(zero,gbc);
		gbc.gridx = 2; gbc.gridy = 4; panel.add(delete,gbc);
		gbc.gridx = 3; gbc.gridy = 4; panel.add(multiply,gbc);
		gbc.gridx = 3; gbc.gridy = 5; panel.add(modulus, gbc);
		gbc.gridx = 2; gbc.gridy = 5; panel.add(clear,gbc);
		
		gbc.gridwidth = 4; gbc.gridx = 0; gbc.gridy = 0; panel.add(input,gbc);
		
		gbc.gridwidth = 2; gbc.gridx = 0; gbc.gridy = 5; panel.add(equalTo,gbc);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(700,600);
		frame.setVisible(true);
	
	}
	class MyDraw extends JPanel{
		public void paintComponent(Graphics g) {
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
			GradientPaint gc = new GradientPaint(0,0,Color.CYAN,this.getWidth(),this.getHeight(),Color.MAGENTA);
			g2d.setPaint(gc);
			g2d.setFont(new Font("algerian", Font.BOLD, 40));
			g2d.drawString("My Calculator", 160, 42);
			g2d.setColor(Color.orange);
			g2d.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 15));
			g2d.drawString("By:- Asad Khan", 560, 50);
			//BELOW CODE IS FOR CREATING BORDER ON "draw" PANEL
			/*g2d.setColor(Color.LIGHT_GRAY); // Border color
		    g2d.setStroke(new BasicStroke(10)); // Border thickness
		    g2d.drawRect(0, 0, getWidth()-1, getHeight()-1); // Draws a border*/
			
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("C")) {
			input.setText("");
		}
		else if(action.equals("=")) {
			input.setText(operation(input.getText()));
		}
		else if(action.equals("←")){
			input.setText(deleteOne(input.getText()));
		}
		else {
			input.setText(input.getText() + action);
		}
	}
	public String deleteOne(String txt) {
		String text = txt.substring(0, txt.length()-1); //last index is excluded
		return text;
	}
	public String operation(String st) {
		ArrayList<String> operands = new ArrayList<>();
		ArrayList<String> operators = new ArrayList<>();
		
		boolean hasNumber = true;
		char[] ch = st.toCharArray();
		String operand = "";
		for(char c : ch) {
			if(c>='0' && c<='9' || c=='.') {
				operand += c;
			}else {
				operators.add(String.valueOf(c));
				hasNumber = false;
			}
			if(!hasNumber) {
				operands.add(operand);
				operand = "";
				hasNumber = true;
			}
			
		}
		if(!operands.isEmpty()) {
			operands.add(operand);
		}
		
			//LOGIC BELOW IS TO APPLY OPERATOR PRECDENCE
			double result = 0;
			double op1;
			double op2;
			for(int i = 0; i<operators.size(); i++) {
				if(operators.get(i).equals("/") || operators.get(i).equals("*") || operators.get(i).equals("%")) {
					op1 = Double.parseDouble(operands.get(i));
					op2 = Double.parseDouble(operands.get(i+1));
					
					if(operators.get(i).equals("/")) {
						result = op1/op2;
					}else if(operators.get(i).equals("*")) {
						result = op1*op2;
					}else {
						result = op1%op2;
					}
					operators.remove(i);
					operands.remove(i+1);
					operands.set(i, String.valueOf(result));
					i--;
				}
			}
			
			for(int i = 0; i<operators.size(); i++) {
				if(operators.get(i).equals("+") || operators.get(i).equals("-")) {
					op1 = Double.parseDouble(operands.get(i));
					op2 = Double.parseDouble(operands.get(i+1));
					if(operators.get(i).equals("+")){
						result = op1+op2;
					}else {
						result = op1-op2;
					}
					operands.remove(i+1);
					operands.set(i, String.valueOf(result));
					operators.remove(i);
					i--;
					
				}
			}
			return String.valueOf(result);
		}
	}


