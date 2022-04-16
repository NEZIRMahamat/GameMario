package com.mario.view;

import javax.swing.JFrame;


public class AppMario {
	
	public static Scene scene;
	
	
	
	
	public static void runApp() {
		
		JFrame windows = new JFrame("Game Mario");
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setSize(800, 360);
		windows.setLocationRelativeTo(null); //screen centered
		windows.setResizable(false);
		windows.setAlwaysOnTop(true);
		
		
		
		scene=new Scene();
		windows.setContentPane(scene);
		windows.setVisible(true);
	}

}
