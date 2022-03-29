package com.mario.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.mario.entity.Mario;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	public Loader loader;
	
	public Mario mario;
	
	private Blocus blocus;
	private Pipe pipe;
	
	private int xBack1; // abscisse du X de l'image de fond;
	private int xBack2;
	private int xPos;
	

	private int deltaX;
	
	
	public Scene() {
		super();
		
		this.xBack1 = -50;
		this.xBack2 = 750;
		this.deltaX = (0);
		this.xPos = 0;
		
		this.loader = new Loader();
		this.mario = new Mario(300, 245);
		this.blocus = new Blocus(450, 120);
		this.pipe = new Pipe(400, 230);
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
		
		Thread threadChrono = new Thread(new Chrono());
		threadChrono.start();
	}
	
	//******Getters and Setters*******//
	
	public int getXBack1() {return xBack1;	}


	public void setXBack1(int xBack1) {this.xBack1 = xBack1; }


	public int getDeltaX() {return deltaX; }


	public void setDeltaX(int deltaX) { this.deltaX = deltaX; }
	
	public void setXBack2(int xBack2) { this.xBack2 = xBack2; }
	
	public int getXPos() { return xPos; }

	public void setXPos(int xPos) { this.xPos = xPos; }
	
	
	//*****//
	
	//movement back screen
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

	public void paintComponent(Graphics graphic1) {
		
		super.paintComponent(graphic1);
		Graphics graphic2 = (Graphics2D) graphic1;
		
		this.moveBackground();

		
		graphic2.drawImage(this.loader.getImageBackground1(), this.xBack1, 0, null); // Dessin de l'image de fond  		 	    
		graphic2.drawImage(this.loader.getImageBackground2(), this.xBack2, 0, null);
		graphic2.drawImage(this.loader.getImageChateau(), 10 - this.xPos , 95, null);
		graphic2.drawImage(this.loader.getImageDeparture(), 200 - this.xPos, 234,null);
		graphic2.drawImage(this.mario.walk(30), this.mario.getX(),  this.mario.getY(), null); 
		
		graphic2.drawImage(this.blocus.getImageBlocus(), this.blocus.getX()  - this.xPos, this.blocus.getY(), null);
		
		graphic2.drawImage(this.blocus.getImageBlocus(), 500  - this.xPos, 150, null);

		graphic2.drawImage(this.blocus.getImageBlocus(), 700  - this.xPos, 230, null);

		graphic2.drawImage(this.pipe.getImagePipe(), this.pipe.getX()  - this.xPos, this.pipe.getY(), null);
		
		
	}

	
	
	}
