package com.mario.controller;

import java.awt.event.KeyEvent;
import com.mario.view.*;
import java.awt.event.KeyListener;

import com.mario.view.AppMario;

public class Keyboard implements KeyListener {
	

	@Override
	public void keyPressed(KeyEvent e) { //quand on appuie sur la touche
		
		
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {			
			
			if(AppMario.scene.controller.getXPos() == -1) {
				AppMario.scene.controller.setXPos(0);
				AppMario.scene.controller.setXBack1(-50);
				AppMario.scene.controller.setXBack2(750);

			}
			
			AppMario.scene.mario.setWalking(true);
			AppMario.scene.mario.setRightWalk(true);
			AppMario.scene.controller.setDeltaX(1);
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {			
			AppMario.scene.mario.setWalking(true);
			AppMario.scene.mario.setRightWalk(false);
			AppMario.scene.controller.setDeltaX(-1);


		}
		else if(e.getKeyCode() ==  KeyEvent.VK_SPACE) {
			AppMario.scene.mario.setJump(true);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) { //quand on relâche la touche
		AppMario.scene.mario.setWalking(false);
		
		AppMario.scene.controller.setDeltaX(0); // remise à 0 de la variable deltaX de la scene

		
		
	}

	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) { 
		
		
	}

}
