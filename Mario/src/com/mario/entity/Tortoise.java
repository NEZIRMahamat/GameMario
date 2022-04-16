package com.mario.entity;

import java.awt.Image;

import com.mario.view.Loader;

public class Tortoise extends Entity{
	private Loader loader;

	public Tortoise(int x, int y) {
		super(x, y, 43, 50);
		this.loader=new Loader();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Image walk(int frequency) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
