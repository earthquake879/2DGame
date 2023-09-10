package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		JFrame window = new JFrame();
		GamePanel gp = new GamePanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Title");
		window.add(gp);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gp.setupGame();
		gp.startGameThread();
		
	}

}