package aplicacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumerosPanel extends JPanel implements ActionListener {

	private JTextField txtText;

	public NumerosPanel(JTextField txtText) {
		this.txtText = txtText;

		setLayout(new GridLayout(4, 3));

		JButton botao1 = new JButton("1");
		botao1.addActionListener(this);
		add(botao1);

		JButton botao2 = new JButton("2");
		botao2.addActionListener(this);
		add(botao2);

		JButton botao3 = new JButton("3");
		botao3.addActionListener(this);
		add(botao3);

		JButton botao4 = new JButton("4");
		botao4.addActionListener(this);
		add(botao4);

		JButton botao5 = new JButton("5");
		botao5.addActionListener(this);
		add(botao5);

		JButton botao6 = new JButton("6");
		botao6.addActionListener(this);
		add(botao6);

		JButton botao7 = new JButton("7");
		botao7.addActionListener(this);
		add(botao7);

		JButton botao8 = new JButton("8");
		botao8.addActionListener(this);
		add(botao8);

		JButton botao9 = new JButton("9");
		botao9.addActionListener(this);
		add(botao9);

		JButton botaovazio1 = new JButton("");
		botaovazio1.setEnabled(false);
		botaovazio1.setContentAreaFilled(false);
		botaovazio1.setBackground(Color.white);
		add(botaovazio1);

		JButton botao0 = new JButton("0");
		botao0.addActionListener(this);
		add(botao0);

		JButton botaovazio2 = new JButton("");
		botaovazio2.setEnabled(false);
		botaovazio2.setContentAreaFilled(false);
		botaovazio2.setBackground(Color.white);
		add(botaovazio2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (txtText.getText().length() == 10) {
			return;
		}

		// O método getSource() retorna qual foi o objeto que disparou o evento.
		// E no caso, esse objeto é um botão.

		JButton botaoClicado = (JButton) e.getSource();

		// O método getText() vai retornar para mim qual o texto do botão que foi
		// clicado.
		String numero = botaoClicado.getText();

		txtText.setText(txtText.getText() + numero);
	}
}