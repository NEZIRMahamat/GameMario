package com.mario.controller;

public class Controller {
	
	private int xPos;
	private int xBack1;
	private int xBack2;
	private int deltaX;
	
	private int yGround; //height this ground
	private int yBackground; //height background


	
	public Controller() {
		
		this.xBack1 = -50;
		this.xBack2 = 750;
		this.deltaX = 0;
		this.xPos = -1;
		this.yGround = 293;
		this.yBackground = 0;
		
	}


	public void moveBackground() { 
		
		if(xPos >= 0) {
			this.xPos = this.xPos + this.deltaX;
			this.xBack1 = this.xBack1 - this.deltaX; 
			this.xBack2 = this.xBack2 - this.deltaX; 

		
		}
		
		if(this.xBack1 ==-800) { this.xBack1 = 800;}
		else if(this.xBack2 ==-800) { this.xBack2 = 800;}
		
		else if(this.xBack1 ==800) { this.xBack1 = -800;}
		else if(this.xBack2 ==800) { this.xBack2 = -800;}
	}
	
	
	public int getXBack1() {return xBack1;	}

	public void setXBack1(int xBack1) {this.xBack1 = xBack1; }

	public int getXBack2(){ return this.xBack2; }
	
	public void setXBack2(int xBack2) { this.xBack2 = xBack2; }

	
	public int getDeltaX() {return deltaX; }


	public void setDeltaX(int deltaX) { this.deltaX = deltaX; }
	
	
	public int getXPos() { return xPos; }

	public void setXPos(int xPos) { this.xPos = xPos; }


	public int getYGround() {return yGround; }
	
	public void setYGround(int yGround) { this.yGround = yGround; }


	public int getYBackground() { return yBackground; }
	
	public void setYBackground(int yBackground) { this.yBackground = yBackground; }

	
	
	


}
