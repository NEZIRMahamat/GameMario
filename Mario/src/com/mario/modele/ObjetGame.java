package com.mario.modele;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.mario.view.AppMario;

public abstract class ObjetGame {
	
	
	protected int x, y;
	protected int width, height;
	
	
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public ObjetGame(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		//this.iconObject = new ImageIcon();
		
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void move() {
		
		if(AppMario.scene.controller.getXPos() >= 0) {
			this.x = this.x - AppMario.scene.controller.getDeltaX();
		}
	}


	public abstract Image getImageObject();
	
	
}
