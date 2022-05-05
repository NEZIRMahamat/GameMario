package com.mario.modele;

import java.awt.Image;

import com.mario.view.Loader;

public class Piece extends ObjetGame implements Runnable{
	private Loader loader;
	private int count;
	private final int PAUSE = 15; //temps d'attente entre deux boucles
	
	
	public Piece(int x, int y) {
		super(x, y, 25, 30);
		this.loader = new Loader();
		
	}


	@Override
	public Image getImageObject() {
		
		return this.loader.getImagePiece1();
	}
	
	public Image bouge() {
		
		Image image;
		this.count++;
		if(this.count /100 ==0) {
			image = this.loader.getImagePiece1();
		}else {
			image = this.loader.getImagePiece2();
		}
		if(this.count == 200) {
			this.count = 0;
		}
		return image;
		
		
	}


	@Override
	public void run() {
		try {Thread.sleep(20);
			
		}catch(InterruptedException e) {
			
		}
		while(true) {
			this.bouge();
			try {Thread.sleep(PAUSE);}
			catch(InterruptedException e) {
				
			}
		}
		
	}

}
