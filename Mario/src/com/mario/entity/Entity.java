package com.mario.entity;

import java.awt.Image;

import com.mario.game.AppMario;

@SuppressWarnings("unused")
public abstract class Entity {
	
	protected int x, y;
	protected int count;
	protected int height, width;
	protected boolean walking;
	protected boolean rightWalk;

	
	public Entity(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.count = 0;
		this.height = height;
		this.width = width;
		this.walking = false;
		this.rightWalk = true;
	}
	
	
	
	public abstract Image walk(int frequency); 

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

	
	


	

}
