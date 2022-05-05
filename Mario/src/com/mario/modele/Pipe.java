package com.mario.modele;

import java.awt.Image;

import com.mario.view.Loader;

public class Pipe extends ObjetGame{

	private Loader loader;
	
	
	public Pipe(int x, int y) {
		super(x, y, 43, 65);
		this.loader = new Loader();
		
	}

	@Override
	public Image getImageObject() {
		// TODO Auto-generated method stub
		return this.loader.getImagePipeRed();
	}
}
