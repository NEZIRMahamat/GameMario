package com.mario.game;

public class Chrono implements Runnable {
	
	private final int PAUSE = 3; //three mili second;
	
	
	
	@Override
	public void run() {
		
		while(true) {
			AppMario.scene.repaint();
			
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
		
	}
	

}
