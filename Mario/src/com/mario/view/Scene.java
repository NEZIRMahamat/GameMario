package com.mario.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;
import com.mario.entity.Mario;
import com.mario.controller.*;
import com.mario.modele.*;
@SuppressWarnings("serial")
public class Scene extends JPanel {

		public Controller controller;
		public Loader loader;
		public Mario mario;
	
		private Blocus blocus1;
		private Blocus blocus2;
		private Blocus blocus3;
		private Blocus blocus4;
		private Blocus blocus5;
		private Blocus blocus6;
		private Blocus blocus7;
		private Blocus blocus8;
		private Blocus blocus9;
		private Blocus blocus10;
		private Blocus blocus11;
		private Blocus blocus12;
		
		private Piece piece1;
		private Piece piece2;
		private Piece piece3;
		private Piece piece4;
		private Piece piece5;
		private Piece piece6;
		private Piece piece7;
		private Piece piece8;
		private Piece piece9;
		private Piece piece10;
		
		
		private Pipe pipe1;
		private Pipe pipe2;
		private Pipe pipe3;
		private Pipe pipe4;
		private Pipe pipe5;
		private Pipe pipe6;
		private Pipe pipe7;
		private Pipe pipe8;
		
		public ArrayList<ObjetGame> objectsArrays;
		
		public ArrayList<Piece> piecesArrays;


		
		
		public Scene() {
			super();
			
			this.objectsArrays = new ArrayList<>();
			this.piecesArrays = new ArrayList<>();
			
			this.loader = new Loader();
			this.mario = new Mario(270, 245);
			this.controller = new Controller();
			
			this.blocus1 = new Blocus(400, 180);
			this.blocus2 = new Blocus(1200, 180);
			this.blocus3 = new Blocus(1270, 170);
			this.blocus4 = new Blocus(1340, 160);
			this.blocus5 = new Blocus(2000, 180);
			this.blocus6 = new Blocus(2600, 160);
			this.blocus7 = new Blocus(2650, 180);
			this.blocus8 = new Blocus(3500, 160);
			this.blocus9 = new Blocus(3550, 140);
			this.blocus10 = new Blocus(4000, 170);
			this.blocus11 = new Blocus(4200, 200);
			this.blocus12 = new Blocus(4300, 210);
			
			this.objectsArrays.add(blocus1);
			this.objectsArrays.add(blocus2);
			this.objectsArrays.add(blocus3);
			this.objectsArrays.add(blocus4);
			this.objectsArrays.add(blocus5);
			this.objectsArrays.add(blocus6);
			this.objectsArrays.add(blocus7);
			this.objectsArrays.add(blocus8);
			this.objectsArrays.add(blocus9);
			this.objectsArrays.add(blocus10);
			this.objectsArrays.add(blocus11);
			this.objectsArrays.add(blocus12);
			
			
			this.pipe1 = new Pipe(600, 230);
			this.pipe2 = new Pipe(1000, 230);
			this.pipe3 = new Pipe(1600, 230);
			this.pipe4 = new Pipe(1900, 230);
			this.pipe5 = new Pipe(2500, 230);
			this.pipe6 = new Pipe(3000, 230);
			this.pipe7 = new Pipe(3800, 230);
			this.pipe8 = new Pipe(4500, 230);
			

			this.objectsArrays.add(pipe1);
			this.objectsArrays.add(pipe2);
			this.objectsArrays.add(pipe3);
			this.objectsArrays.add(pipe4);
			this.objectsArrays.add(pipe5);
			this.objectsArrays.add(pipe6);
			this.objectsArrays.add(pipe7);
			this.objectsArrays.add(pipe8);
			
			this.piece1 = new Piece(402, 145);
			this.piece2 = new Piece(1202, 140);
			this.piece3 = new Piece(1272, 95);
			this.piece4 = new Piece(1342, 40);
			this.piece5 = new Piece(1650, 145);
			this.piece6 = new Piece(2650, 145);
			this.piece7 = new Piece(3000, 135);
			this.piece8 = new Piece(3400, 125);
			this.piece9 = new Piece(4200, 145);
			this.piece10 = new Piece(4600, 40);
			
			this.piecesArrays.add(piece1);
			this.piecesArrays.add(piece2);
			this.piecesArrays.add(piece3);
			this.piecesArrays.add(piece4);
			this.piecesArrays.add(piece5);
			this.piecesArrays.add(piece6);
			this.piecesArrays.add(piece7);
			this.piecesArrays.add(piece8);
			this.piecesArrays.add(piece9);
			this.piecesArrays.add(piece10);
			
			

			
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
			
			//detection contact with things
			for(int i = 0; i < this.objectsArrays.size(); i++) {
				 if(this.mario.close(this.objectsArrays.get(i))){
					 this.mario.contact(this.objectsArrays.get(i));
				 }
	
			}
			
			//detection contact with Piece
			for(int i = 0; i < this.piecesArrays.size(); i++) {
				 if(this.mario.close(this.piecesArrays.get(i))){
					 if(this.mario.contactPiece(this.piecesArrays.get(i))) {
						 this.piecesArrays.remove(i);
					 };
				 }
	
			}
			//Background movement
			this.controller.moveBackground();
			
			if(this.controller.getXPos() >= 0 && this.controller.getXPos() <= 4430) {
				for(int i = 0; i < this.objectsArrays.size(); i++) {
					this.objectsArrays.get(i).move();
				}
				for(int i = 0; i < this.piecesArrays.size(); i++) {
					this.piecesArrays.get(i).move();
				}
			}


			graphic2.drawImage(this.loader.getImageBackground1(), this.controller.getXBack1(), 0, null); // Dessin de l'image de fond  		 	    
			graphic2.drawImage(this.loader.getImageBackground2(), this.controller.getXBack2(), 0, null);
			graphic2.drawImage(this.loader.getImageChateau(), 10 - this.controller.getXPos() , 95, null);
			graphic2.drawImage(this.loader.getImageDeparture(), 200 - this.controller.getXPos(), 234,null);
			
			//Image Objects
			for(int i = 0; i < this.objectsArrays.size(); i++) {
				graphic2.drawImage(this.objectsArrays.get(i).getImageObject(), this.objectsArrays.get(i).getX()  , this.objectsArrays.get(i).getY(), null);
	
			}			
			//Image Pieces
			for(int i = 0; i < this.piecesArrays.size(); i++) {
				graphic2.drawImage(this.piecesArrays.get(i).bouge(), this.piecesArrays.get(i).getX()  , this.piecesArrays.get(i).getY(), null);
	
			}
			

			graphic2.drawImage(this.loader.getImageDrapeau(), 4650  - this.controller.getXPos(), 115, null);

			graphic2.drawImage(this.loader.getImageChateauFin(), 5000 - this.controller.getXPos(), 145, null);
			
			if(this.mario.isJump() == true) {
				graphic2.drawImage(this.mario.jumped(), this.mario.getX(),  this.mario.getY(), null); 

			}else {
				graphic2.drawImage(this.mario.walk(25), this.mario.getX(),  this.mario.getY(), null); 

			}

			
		}
		
}

