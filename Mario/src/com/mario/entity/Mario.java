package com.mario.entity;

import com.mario.game.AppMario;
import com.mario.game.Loader;
import com.mario.game.ObjetGame;

import java.awt.Image;


public class Mario extends Entity {
	
	private Loader loader;
	public Loader getLoader() {
		return loader;
	}

	public void setLoader(Loader loader) {
		this.loader = loader;
	}

	private boolean jumped; //saut de Mario
	private int countJump; //compteur de saut


	public Mario(int x, int y) {
		super(x, y, 28, 50);
		this.loader = new Loader();	
		this.jumped = false;
		this.setCountJump(0);
	}

	public boolean isJumped() {
		return jumped;
	}


	public void setJumped(boolean isJumped) {
		this.jumped = isJumped;
	}
	
	
	
	
	public void jump() {
		
	}
	
	public Image walk(int frequency) {
			Image image;
			
			if(this.walking == false || AppMario.scene.getXPos()<= 0) {
				if(this.rightWalk ==true) { image = loader.getImageMarioStopRight(); }
				else { image = loader.getImageMarioStopLeft(); }
			}
			else {
				this.count++;
				if(this.count / frequency == 0) {
					if(this.rightWalk == true) { image = this.loader.getImageMarioStopRight();}
					else { image = this.loader.getImageMarioStopLeft(); }
				}
				else { 
					if(this.rightWalk == true) { image =this.loader.getImageMarioWalkRight() ;}
					else { image = this.loader.getImageMarioWalkLeft(); }
				}
				if(this.count == 2 * frequency) {this.count = 0;}
			}
			return image;
	}

	public void contact(ObjetGame object) {
		
	
	}

	public int getCountJump() {
		return countJump;
	}

	public void setCountJump(int countJump) {
		this.countJump = countJump;
	}


	

}
