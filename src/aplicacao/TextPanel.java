package aplicacao;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {

	private JTextField txtNumero;

	public TextPanel() {

		setLayout(new FlowLayout());

		txtNumero = new JTextField(25);
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);
		txtNumero.setEnabled(false);

		add(txtNumero);
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}
}