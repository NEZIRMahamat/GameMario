package com.mario.game;

import java.awt.Image;

public class Pipe extends ObjetGame{

	private Loader loader;
	
	
	public Pipe(int x, int y) {
		super(x, y, 43, 65);
		this.loader = new Loader();
		
	}
	
	public Image getImagePipe() {
		
		return this.loader.getImagePipeRed();
		
	}
}
