
package br.com.alura.threads.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		Runnable task = new MultiplyTask(first, second, result);
		Thread calculoThread = new Thread(task, "Calculator Thread");
		calculoThread.start();
	}

}