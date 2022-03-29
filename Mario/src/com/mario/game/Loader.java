package com.mario.game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Loader {
	
	@SuppressWarnings("unused")
	private ImageIcon iconBackground;
	private Image imageBackground1;
	private Image imageBackground2;
	
	@SuppressWarnings("unused")
	private ImageIcon chateau;
	private Image imageChateau;
	
	@SuppressWarnings("unused")
	private ImageIcon departure;
	private Image imageDeparture;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioWalkRight;
	private Image imageMarioWalkRight;
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioWalkLeft;
	private Image imageMarioWalkLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioStopRight;
	private Image imageMarioStopRight;	
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioStopLeft;
	private Image imageMarioStopLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioJumpRight;
	private Image imageMarioJumpRight;
	
	@SuppressWarnings("unused")
	private ImageIcon iconMarioJumpLeft;
	private Image imageMarioJumpLeft;
	
	@SuppressWarnings("unused")
	private ImageIcon iconPipeRed;
	private Image imagePipeRed;
	
	
	//blocked
	
	@SuppressWarnings("unused")
	private ImageIcon iconBloc;
	private Image imageBloc;
	




	//***METHOD****//
	public Loader() {
		
		
		iconBackground = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imageBackground1 = this.iconBackground.getImage();
		this.imageBackground2 = this.iconBackground.getImage();
		
		this.chateau = new ImageIcon(getClass().getResource("/images/chateau1.png"));
		this.imageChateau = this.chateau.getImage();
		
		this.departure = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imageDeparture = this.departure.getImage();
		
		this.iconMarioWalkRight = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		this.imageMarioWalkRight = this.iconMarioWalkRight.getImage();
		
		this.iconMarioWalkLeft = new ImageIcon(getClass().getResource("/images/marioMarcheGauche.png"));
		this.imageMarioWalkLeft = this.iconMarioWalkLeft.getImage();
		
		this.iconMarioStopRight = new ImageIcon(getClass().getResource("/images/marioArretDroite.png"));
		this.imageMarioStopRight = this.iconMarioStopRight.getImage();
		
		this.iconMarioStopLeft = new ImageIcon(getClass().getResource("/images/marioArretGauche.png"));
		this.imageMarioStopLeft = this.iconMarioStopLeft.getImage();
		
		this.iconMarioJumpRight = new ImageIcon(getClass().getResource("/images/marioSautDroite.png"));
		this.imageMarioJumpRight = this.iconMarioJumpRight.getImage();
		
		this.iconMarioJumpLeft = new ImageIcon(getClass().getResource("/images/marioSautGauche.png"));
		this.imageMarioJumpLeft = this.iconMarioJumpRight.getImage();
		
		this.iconPipeRed = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		this.imagePipeRed = this.iconPipeRed.getImage();
		
		this.iconBloc = new ImageIcon(getClass().getResource("/images/bloc.png"));
		this.imageBloc = this.iconBloc.getImage();

		
	}

	
	
	
	public Image getImageChateau() {
		return imageChateau;
	}
	public void setImageChateau(Image imageChateau) {
		this.imageChateau = imageChateau;
	}
	
	public Image getImageDeparture() {
		return imageDeparture;
	}
	public void setImageDeparture(Image imageDeparture) {
		this.imageDeparture = imageDeparture;
	}
	
	public Image getImageMarioWalkRight() {
		return imageMarioWalkRight;
	}
	public void setImageMarioWalkRight(Image imageMarioWalkRight) {
		this.imageMarioWalkRight = imageMarioWalkRight;
	}
	
	public Image getImageMarioWalkLeft() {
		return imageMarioWalkLeft;
	}

	public void setImageMarioWalkLeft(Image imageMarioWalkLeft) {
		this.imageMarioWalkLeft = imageMarioWalkLeft;
	}
	
	public Image getImageBackground1() {
		return imageBackground1;
	}
	public void setImageBackground1(Image imageBackground1) {
		this.imageBackground1 = imageBackground1;
	}
	public Image getImageBackground2() {
		return imageBackground2;
	}
	public void setImageBackground2(Image imageBackground2) {
		this.imageBackground2 = imageBackground2;
	}


	public Image getImageMarioStopRight() {
		return imageMarioStopRight;
	}

	public void setImageMarioStopRight(Image imageMarioStopRight) {
		this.imageMarioStopRight = imageMarioStopRight;
	}
	
	public Image getImageMarioStopLeft() {
		return imageMarioStopLeft;
	}
	
	public void setImageMarioStopLeft(Image imageMarioStopLeft) {
		this.imageMarioStopLeft = imageMarioStopLeft;
	}

	public Image getImageMarioJumpLeft() {
		return imageMarioJumpLeft;
	}

	public void setImageMarioJumpLeft(Image imageMarioJumpLeft) {
		this.imageMarioJumpLeft = imageMarioJumpLeft;
	}

	public Image getImageMarioJumpRight() {
		return imageMarioJumpRight;
	}

	public void setImageMarioJumpRight(Image imageMarioJumpRight) {
		this.imageMarioJumpRight = imageMarioJumpRight;
	}


	public Image getImagePipeRed() {
		return imagePipeRed;
	}

	public void setImagePipeRed(Image imagePipe) {
		this.imagePipeRed = imagePipe;
	}
	
	public Image getImageBloc() {
		return imageBloc;
	}

	public void setImageBloc(Image imageBloc) {
		this.imageBloc = imageBloc;
	}

}
