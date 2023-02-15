package aplicacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Calc extends JFrame {
	
	public Calc() throws Exception {
		super("Calculadora");
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 350);
		setLocation(400, 200);
		
		setLayout(new BorderLayout());
		
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		new Calc(); 
	}
	

}
