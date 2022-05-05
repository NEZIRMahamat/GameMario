package com.mario.modele;

import java.awt.Image;

import com.mario.view.Loader;

public class Blocus extends ObjetGame{

	private Loader loader;
	
	
	public Blocus(int x, int y) {
		super(x, y, 30, 30);
		this.loader = new Loader();
		
	}
	
	@Override
	public Image getImageObject() {
		// TODO Auto-generated method stub
		return this.loader.getImageBloc();
	}

}
