package org.jointheleague.mole;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MessyWhackAMole implements ActionListener {

	Date timeAtStart = new Date();
	JFrame frame;
	private int wrongs;
	private int presses;

	public static void main(String[] args) {
		int moleStartPosition = 13;
		new MessyWhackAMole().createUI(moleStartPosition);
	}

	private void createUI(int molePosition) {
		frame = new JFrame("Whack a Button for Fame and Glory");
		JPanel panel = new JPanel();
		panel = new JPanel();
		makeButtons(molePosition, panel);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		// TODO make frame exit on close
	}

	public void actionPerformed(ActionEvent event) {
		presses++;
		String chosenText = ((JButton) event.getSource()).getText();
		if (!chosenText.equals("mole!")) {
			wrongs++;
			insultUser();
		} else
			playMoleSound();
		redraw();
		if (presses > 9)
			// TODO reset presses to 0
			showGameOverMessage(timeAtStart, presses);
	}

	private void makeButtons(int molePosition, JPanel panel) {
		for (int i = 0; i < 24; i++) {
			JButton butt = new JButton();
			if (i == molePosition)
				butt.setText("mole!");
			panel.add(butt);
			butt.addActionListener(this);
		}
	}

	private void redraw() {
		frame.dispose();
		createUI(new Random().nextInt(20));
	}

	private void playMoleSound() {
		playSound("http://school.wintrisstech.org/sounds/duck.wav");
	}

	private void insultUser() {
		switch (wrongs) {
		case 1:
			speak("dork");
			break;
		case 2:
			speak("idiot");
			break;
		case 3:
			speak("moron");
			break;
		default:
			speak("complete waste of atoms");
			break;
		}
	}

	private void speak(String message) {
		try {
			Runtime.getRuntime().exec("say " + message).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void playSound(String soundURL) {
		String url = soundURL;
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(url));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void showGameOverMessage(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ getWhackRate(timeAtStart, molesWhacked, timeAtEnd)
				+ " moles per second.");
	}

	private double getWhackRate(Date timeAtStart, int molesWhacked,
			Date timeAtEnd) {
		return (timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.0
				/ molesWhacked;
	}

}
/* Copyright: The League of Amazing Programmers, 2014 */