package com.mario.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import com.mario.entity.Mario;
import com.mario.controller.*;
import com.mario.modele.*;
@SuppressWarnings("serial")
public class Scene extends JPanel {

		public Controller controller;
		public Loader loader;
		public Mario mario;
		private Blocus blocus;
		private Pipe pipe;
		
		
		
		public Scene() {
			super();
			
			this.loader = new Loader();
			this.mario = new Mario(270, 245);
			this.blocus = new Blocus(400, 200);
			this.pipe = new Pipe(550, 230);
			this.controller = new Controller();
			
			
			this.setFocusable(true);
			this.requestFocusInWindow();
			this.addKeyListener(new Keyboard());
			
			Thread threadChrono = new Thread(new Chrono());
			threadChrono.start();
		}
						
		
		//*****//
		
		//movement back screen


		public void paintComponent(Graphics graphic1) {
			
			super.paintComponent(graphic1);
			Graphics graphic2 = (Graphics2D) graphic1;
			
			//detection contact
			if( this.mario.close(pipe)) {this.mario.contact(pipe);}
			
			if(this.mario.close(blocus)){this.mario.contact(blocus);	}
						
			
			
			//this.mario.contact(pipe);
			//this.mario.contact(blocus);
		
			this.controller.moveBackground();
			
			this.pipe.move();
			this.blocus.move();
		
			//System.out.println(this.pipe.getX());

			graphic2.drawImage(this.loader.getImageBackground1(), this.controller.getXBack1(), 0, null); // Dessin de l'image de fond  		 	    
			graphic2.drawImage(this.loader.getImageBackground2(), this.controller.getXBack2(), 0, null);
			graphic2.drawImage(this.loader.getImageChateau(), 10 - this.controller.getXPos() , 95, null);
			graphic2.drawImage(this.loader.getImageDeparture(), 200 - this.controller.getXPos(), 234,null);
			
			graphic2.drawImage(this.blocus.getImageBlocus(), this.blocus.getX()  , this.blocus.getY(), null);
			
			//graphic2.drawImage(this.blocus.getImageBlocus(), 330  - this.controller.getXPos(), 150, null);

			//graphic2.drawImage(this.blocus.getImageBlocus(), 700  - this.controller.getXPos(), 230, null);

			graphic2.drawImage(this.pipe.getImagePipe(), this.pipe.getX(), this.pipe.getY(), null);
			
			if(this.mario.isJump() == true) {
				graphic2.drawImage(this.mario.jumped(), this.mario.getX(),  this.mario.getY(), null); 

			}else {
				graphic2.drawImage(this.mario.walk(25), this.mario.getX(),  this.mario.getY(), null); 

			}

			
		}
		
}

