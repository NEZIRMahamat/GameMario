package com.mario.entity;

import java.awt.Image;

import com.mario.modele.ObjetGame;
import com.mario.view.AppMario;
import com.mario.view.Loader;


public class Mario extends Entity {
	
	private Loader loader;
	

	private boolean jump; //jump of Mario: true if jumped Mario, else false.
	private int countJump; //compteur: durée du saut et height de saut


	public Mario(int x, int y) {
		super(x, y, 28, 50);
		this.loader = new Loader();	
		this.jump = false;
		this.countJump = 0;
	}

	public boolean isJump() {
		return jump;
	}

	public void setJump(boolean isJumped) {
		this.jump = isJumped;
	}
	
	public int getCountJump() {
		return countJump;
	}

	public void setCountJump(int countJump) {
		this.countJump = countJump;
	}
	
	public Loader getLoader() {
		return loader;
	}


	
	
	
	
	public Image jumped() {
		
		Image image;
		
		this.countJump++;
		
		//saut du mario
		if(this.countJump <= 35) {
			if(this.y > AppMario.scene.controller.getYBackground()) {this.setY(this.y - 4);}
			else { this.countJump = 36; }
			
			if(this.isRightWalk() == true) {
				image =this.loader.getImageMarioJumpRight();
			}else {
				image = this.loader.getImageMarioJumpLeft();
			}
			
		}
		//retombée du mario
		
		else if(this.y + this.height < AppMario.scene.controller.getYGround()) {
			this.setY(this.y + 1) ; 
			if(this.isRightWalk() == true) { image =this.loader.getImageMarioJumpRight(); }
			else { image = this.loader.getImageMarioJumpLeft(); }
		}
			//end jump
		else {
			if(this.isRightWalk() == true) { image = this.loader.getImageMarioStopRight(); }
			else { image = this.loader.getImageMarioStopLeft(); }	
			this.jump = false;
			this.countJump = 0;
		}
			return image;

	}
	
	public Image walk(int frequency) {
			Image image;
			
			if(this.walking == false || AppMario.scene.controller.getXPos()<= 0) {
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
		//contact right
		if( (super.isContactRight(object) == true && isRightWalk() == true) ||
		(super.isContactLeft(object) == true && this.isRightWalk() == false)) {
			AppMario.scene.controller.setDeltaX(0);
			this.setWalking(false);
		}
		
		if((super.isContactBottom(object) == true && this.jump == true)){ //Mr jump on the thing
			AppMario.scene.controller.setYGround(object.getY());
		}else if(super.isContactBottom(object) == false){ /// Mr fall on the initial ground
			AppMario.scene.controller.setYGround(293); //initial height ground
			if(this.jump == false) {
				this.setY(243); //initial altitude of Mr
			}
		}
			
		// contact top Mr with object
		if (super.isContactTop(object)==true){
			AppMario.scene.controller.setYBackground(object.getY() +object.getHeight());
			}
		else if(super.isContactTop(object) == false && this.jump == false) {
			AppMario.scene.controller.setYGround(0); //initial height in the background of game
		}
	}

	
	
}