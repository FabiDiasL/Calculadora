package aplicacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperacoesPanel extends JPanel implements ActionListener {

	private JTextField txtText;

	private char operacao;
	private double valor1;
	private double valor2;

	private JButton botaoSomar;
	private JButton botaoSubtrair;
	private JButton botaoMultiplicar;
	private JButton botaoDividir;
	private JButton botaoIgual;
	private JButton botaoLimpar;

	public OperacoesPanel(JTextField txtText) {
		this.txtText = txtText;

		setLayout(new GridLayout(3, 2));

		botaoSomar = new JButton("+");
		botaoSomar.addActionListener(this);
		add(botaoSomar);

		botaoSubtrair = new JButton("-");
		botaoSubtrair.addActionListener(this);
		add(botaoSubtrair);

		botaoMultiplicar = new JButton("*");
		botaoMultiplicar.addActionListener(this);
		add(botaoMultiplicar);

		botaoDividir = new JButton("/");
		botaoDividir.addActionListener(this);
		add(botaoDividir);

		botaoIgual = new JButton("=");
		botaoIgual.addActionListener(this);
		add(botaoIgual);

		botaoLimpar = new JButton("C");
		botaoLimpar.addActionListener(this);
		add(botaoLimpar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (txtText.getText().isEmpty()) {
			return;
		}

		JButton botaoClicado = (JButton) e.getSource();

		if (botaoClicado == botaoLimpar) {
			// Como operacao é do tipo char não aceita "null", no char se quero definir valor
			// nulo tenho que usar o código unicode abaixo.
			operacao = '\u0000';
			txtText.setText("");
			
		} else if (botaoClicado == botaoIgual) {

			valor2 = Double.parseDouble(txtText.getText());

			double resultado = 0.0;

			if (operacao == '+') {
				resultado = valor1 + valor2;

			} else if (operacao == '-') {
				resultado = valor1 - valor2;

			} else if (operacao == '*') {
				resultado = valor1 * valor2;

			} else if (operacao == '/') {
				resultado = valor1 / valor2;
			}

			txtText.setText(String.valueOf(resultado));
			operacao = '\u0000';
			valor1 = resultado;
			valor2 = 0;
			
		} else {
			operacao = botaoClicado.getText().charAt(0);
			valor1 = Double.parseDouble(txtText.getText());
			txtText.setText("");
		}
	}
}