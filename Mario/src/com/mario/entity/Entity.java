package com.mario.entity;

import java.awt.Image;

import com.mario.modele.ObjetGame;
import com.mario.view.AppMario;

@SuppressWarnings("unused")
public abstract class Entity implements Movement {
	
	protected int x, y;
	protected int count; //compteur de marche de Mario
	protected int height, width;
	protected boolean walking;
	protected boolean rightWalk;

	
	public Entity(int x, int y, int width, int height ) {
		this.x = x;
		this.y = y;
		this.count = 0;
		this.height = height;
		this.width = width;
		this.walking = false;
		this.rightWalk = true;
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isWalking() {
		return walking;
	}

	public void setWalking(boolean walking) {
		this.walking = walking;
	}

	public boolean isRightWalk() {
		return rightWalk;
	}

	public void setRightWalk(boolean rightWalk) {
		this.rightWalk = rightWalk;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	//Contact with things
	
	
	public boolean isContactRight(ObjetGame objectGame){
		if(this.x + this.width < objectGame.getX() || this.x + this.width > objectGame.getX() + 5 ||
			       this.y + this.height <= objectGame.getY() || this.y >= objectGame.getY() + objectGame.getHeight()){
			return false;
			}
		else{return true;}
	}
		

	public boolean isContactLeft(ObjetGame objectGame) {
		if(this.x + this.width < objectGame.getX() + objectGame.getWidth() -5 || this.x > objectGame.getX() + objectGame.getWidth() || 
				this.y +this.height <= objectGame.getY() || this.y >= objectGame.getY() + objectGame.getHeight()) {
			return false;
		}else {
			return true;
		}
	}

	public boolean isContactBottom(ObjetGame objectGame) {
		if(this.x + this.width < objectGame.getX() + 5 || this.x > objectGame.getX() + objectGame.getWidth()-5||
				this.y + this.getHeight() < objectGame.getY() || this.y + this.height > objectGame.getY()+ 5) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isContactTop(ObjetGame objectGame) {
		if(this.x + this.width < objectGame.getX() + 5|| this.x > objectGame.getX() + objectGame.getWidth()-5  ||
				this.getY() < objectGame.getY() + objectGame.getHeight() || this.y > objectGame.getY() + objectGame.getHeight()+5) {
			return false;
		}
		else {
			return  true;
		}
	}
	
	
	public boolean close(ObjetGame objectGame) {
		if( (this.x > objectGame.getX() - 10 && this.x < objectGame.getX() + objectGame.getWidth() + 10 ) ||
				(this.x +this.width > objectGame.getX() -10 && this.x + this.width < objectGame.getX() + objectGame.getWidth()+10)){
			return true;
			
		}else {
			return false;
		}
	}



	
	


	

}
