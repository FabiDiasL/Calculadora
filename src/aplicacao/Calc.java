package aplicacao;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Calc extends JFrame {

	public Calc() throws Exception {
		super("Calculadora");

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocation(400, 200);

		setLayout(new BorderLayout());

		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);

		JPanel digitosPanel = new JPanel();
		digitosPanel.setLayout(new BorderLayout());
		digitosPanel.add(BorderLayout.CENTER, new NumerosPanel(textPanel.getTxtNumero()));
		digitosPanel.add(BorderLayout.EAST, new OperacoesPanel(textPanel.getTxtNumero()));

		add(BorderLayout.CENTER, digitosPanel);

		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new Calc();
	}
}