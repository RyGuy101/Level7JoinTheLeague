package org.jointheleague.grumpy;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Grumpy
{
	JFrame window;
	JButton grumpyButton;

	public static void main(String[] args)
	{
		new Grumpy();
	}

	public Grumpy()
	{
		window = new JFrame("Grumpy Button");
		window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		grumpyButton = new JButton("Grumpy");
		grumpyButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Go Away!");
			}
		});
		window.add(grumpyButton);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
