import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator {
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divbutton;
	JButton decButton, eqlButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Ink free",Font.BOLD,30);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	
	Calculator(){
		frame=new JFrame("calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		
		
		
		frame.setVisible(true);
		
	}
		

	public static void main(String[] args) {
		Calculator calc = new Calculator();

	}

}
