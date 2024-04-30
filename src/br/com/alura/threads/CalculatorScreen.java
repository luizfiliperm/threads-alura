package br.com.alura.threads;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorScreen {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Delay Multiply");

		JTextField first = new JTextField(10);
		JTextField second = new JTextField(10);
		JButton button = new JButton(" = ");
		JLabel result = new JLabel("           ?          ");

		button.addActionListener(new ButtonAction(first, second, result));
		
		JPanel panel = new JPanel();
		panel.add(first);
		panel.add(new JLabel("x"));
		panel.add(second);
		panel.add(button);
		panel.add(result);
		
		janela.add(panel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}
}


