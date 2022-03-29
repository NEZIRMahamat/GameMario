package com.mario.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
	

	@Override
	public void keyPressed(KeyEvent e) { //quand on appuie sur la touche
		
		
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {			
			
			if(AppMario.scene.getXPos() == 0) {
				AppMario.scene.setXPos(1);
				AppMario.scene.setXBack1(-50);
				AppMario.scene.setXBack2(750);

			}
			
			AppMario.scene.mario.setWalking(true);
			AppMario.scene.mario.setRightWalk(true);
			AppMario.scene.setDeltaX(1);
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			AppMario.scene.setDeltaX(-1);
			
			AppMario.scene.mario.setWalking(true);
			AppMario.scene.mario.setRightWalk(false);

		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) { //quand on relâche la touche
		AppMario.scene.mario.setWalking(false);

		AppMario.scene.setDeltaX(0);

		
		
	}

	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) { 
		
		
	}

}
