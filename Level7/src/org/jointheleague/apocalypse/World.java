package org.jointheleague.apocalypse;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class World
{
	public static void main(String[] args)
	{
		new World();
	}

	public World()
	{
		final Apocalypse theElectricityApocalypse = new Apocalypse();
		theElectricityApocalypse.registerObserver(new Alex());
		theElectricityApocalypse.registerObserver(new Drew());
		theElectricityApocalypse.registerObserver(new Robert());
		theElectricityApocalypse.registerObserver(new Stephen());
		theElectricityApocalypse.registerObserver(new Ryan());

		JFrame window = new JFrame("Grumpy Button");
		window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		JButton apocalyspeButton = new JButton("Start Apocalypse");
		apocalyspeButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				theElectricityApocalypse.ringTheAlarm();
			}
		});
		window.add(apocalyspeButton);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
