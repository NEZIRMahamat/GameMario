package com.mario.controller;

public class Controller {
	
	private int xPos;
	private int xBack1;
	private int xBack2;
	private int deltaX;



	public void moveBackground() { 
		
		if(xPos > 0) {
			this.xPos = this.xPos + this.deltaX;
			this.xBack1 = this.xBack1 - this.deltaX; 
			this.xBack2 = this.xBack2 - this.deltaX; 

		
		}
		
		if(this.xBack1 ==-800) { this.xBack1 = 800;}
		else if(this.xBack2 ==-800) { this.xBack2 = 800;}
		
		else if(this.xBack1 ==800) { this.xBack1 = -800;}
		else if(this.xBack2 ==800) { this.xBack2 = -800;}
	}


}
