package com.mario.game;

import java.awt.Image;

public class Blocus extends ObjetGame{

	private Loader loader;
	
	
	public Blocus(int x, int y) {
		super(x, y, 30, 30);
		this.loader = new Loader();
		
	}
	
	public Image getImageBlocus() {
		
		return this.loader.getImageBloc();
		
	}

}
