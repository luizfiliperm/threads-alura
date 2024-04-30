
package br.com.alura.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener {

	private JTextField first;
	private JTextField second;
	private JLabel result;

	public ButtonAction(JTextField first, JTextField second, JLabel result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		long value1 = Long.parseLong(first.getText());
		long value2 = Long.parseLong(second.getText());
		BigInteger calculo = new BigInteger("0");
		
		for (int i = 0; i < value1; i++) {
			for (int j = 0; j < value2; j++) {
				calculo = calculo.add(new BigInteger("1"));
			}
		}

		result.setText(calculo.toString());
	}

}