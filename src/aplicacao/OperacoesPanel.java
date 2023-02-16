package aplicacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperacoesPanel extends JPanel implements ActionListener{
	
	private JTextField txtText;
	
	private JButton botaosomar;
	private JButton botaosubtrair;
	private JButton botaomultiplicar;
	private JButton botaodividir;
	private JButton botaoigual;
	private JButton botaoLimpar;
	
	public OperacoesPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(3, 2));
		
		botaosomar = new JButton("+");
		botaosomar.addActionListener(this);
		add(botaosomar);
		
		botaosubtrair = new JButton("-");
		botaosubtrair.addActionListener(this);
		add(botaosubtrair);
		
		botaomultiplicar = new JButton("*");
		botaomultiplicar.addActionListener(this);
		add(botaomultiplicar);
		
		botaodividir = new JButton("/");
		botaodividir.addActionListener(this);
		add(botaodividir);
		
		botaoigual = new JButton("=");
		botaoigual.addActionListener(this);
		add(botaoigual);
		
		botaoLimpar = new JButton("C");
		botaoLimpar.addActionListener(this);
		add(botaoLimpar);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {				
	}

}
