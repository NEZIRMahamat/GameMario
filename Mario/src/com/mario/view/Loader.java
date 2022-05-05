package com.mario.view;

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
	private ImageIcon chateauFin;
	private Image imageChateauFin;
	
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
	private ImageIcon iconTortoiseWalkRight;
	private Image imageTortoiseWalkRight;
	
	@SuppressWarnings("unused")
	private ImageIcon iconTortoiseWalkLeft;
	private Image imageTortoiseWalkLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconTortoiseStopRight;
	private Image imageTortoiseStopRight;	
	
	

	@SuppressWarnings("unused")
	private ImageIcon iconTortoiseStopLeft;
	private Image imageTortoiseStopLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconTortoiseClosed;
	private Image imageTortoiseClosed;
	
	//Champignon
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampWalkRight;
	private Image imageChampWalkRight;
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampWalkLeft;
	private Image imageChampWalkLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampStopRight;
	private Image imageChampStopRight;	
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampStopLeft;
	private Image imageChampStopLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampEcraseRight;
	private Image imageChampEcraseRight;
	
	@SuppressWarnings("unused")
	private ImageIcon iconChampEcraseLeft;
	private Image imageChampEcraseLeft;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconPipeRed;
	private Image imagePipeRed;

	//blocked
	
	@SuppressWarnings("unused")
	private ImageIcon iconBloc;
	private Image imageBloc;
	
	@SuppressWarnings("unused")
	private ImageIcon iconBoom;
	private Image imageBoom;
	
	
	@SuppressWarnings("unused")
	private ImageIcon drapeau;
	private Image imageDrapeau;
	
	
	@SuppressWarnings("unused")
	private ImageIcon iconPiece1;
	private Image imagePiece1;
	
	@SuppressWarnings("unused")
	private ImageIcon iconPiece2;
	private Image imagePiece2;
	




	//***METHOD****//
	public Loader() {
		
		
		iconBackground = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imageBackground1 = this.iconBackground.getImage();
		this.imageBackground2 = this.iconBackground.getImage();
		
		this.chateau = new ImageIcon(getClass().getResource("/images/chateau1.png"));
		this.imageChateau = this.chateau.getImage();
		
		this.chateauFin = new ImageIcon(getClass().getResource("/images/chateauFin.png"));
		this.imageChateauFin = this.chateauFin.getImage();
		
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
		
		this.iconBoom = new ImageIcon(getClass().getResource("/images/boom.png"));
		this.imageBoom = this.iconBoom.getImage();
		
		
		this.drapeau = new ImageIcon(getClass().getResource("/images/drapeau.png"));
		this.imageDrapeau = this.drapeau.getImage();

		this.iconPiece1 = new ImageIcon(getClass().getResource("/images/piece1.png"));
		this.imagePiece1 = this.iconPiece1.getImage();
	
		this.iconPiece2 = new ImageIcon(getClass().getResource("/images/piece2.png"));
		this.imagePiece2 = this.iconPiece2.getImage();
		
		
		this.iconTortoiseWalkRight = new ImageIcon(getClass().getResource("/images/tortueMarcheDroite.png"));
		this.imageTortoiseWalkRight = this.iconTortoiseWalkRight.getImage();
		
		this.iconTortoiseWalkLeft = new ImageIcon(getClass().getResource("/images/tortueMarcheGauche.png"));
		this.imageTortoiseWalkLeft = this.iconTortoiseWalkLeft.getImage();
		
		this.iconTortoiseStopRight = new ImageIcon(getClass().getResource("/images/tortueArretDroite.png"));
		this.imageTortoiseStopRight = this.iconTortoiseStopRight.getImage();
		
		this.iconTortoiseStopLeft = new ImageIcon(getClass().getResource("/images/tortueArretGauche.png"));
		this.imageTortoiseStopLeft = this.iconTortoiseStopLeft.getImage();
		
		this.iconTortoiseClosed = new ImageIcon(getClass().getResource("/images/tortueFermee.png"));
		this.imageTortoiseClosed = this.iconTortoiseClosed.getImage();
		
		//Champignon
		this.iconChampWalkRight = new ImageIcon(getClass().getResource("/images/champMarcheDroite.png"));
		this.imageChampWalkRight = this.iconChampWalkRight.getImage();
		
		this.iconChampWalkLeft = new ImageIcon(getClass().getResource("/images/champMarcheGauche.png"));
		this.imageChampWalkLeft = this.iconChampWalkLeft.getImage();
		
		this.iconChampStopRight = new ImageIcon(getClass().getResource("/images/champArretDroite.png"));
		this.imageChampStopRight = this.iconChampStopRight.getImage();
		
		this.iconChampStopLeft = new ImageIcon(getClass().getResource("/images/champArretGauche.png"));
		this.imageChampStopLeft = this.iconChampStopLeft.getImage();
		
		this.iconChampEcraseRight = new ImageIcon(getClass().getResource("/images/champEcraseDroite.png"));
		this.imageChampEcraseRight = this.iconChampEcraseRight.getImage();
		
		this.iconChampEcraseLeft = new ImageIcon(getClass().getResource("/images/champEcraseGauche.png"));
		this.imageChampEcraseLeft = this.iconChampEcraseLeft.getImage();
		
	
	}

	
	
	
	public Image getImageChateau() {
		return imageChateau;
	}
	
	public Image getImageDeparture() {
		return imageDeparture;
	}
	
	//Getters Mario
	public Image getImageMarioWalkRight() {
		return imageMarioWalkRight;
	}
	
	public Image getImageMarioWalkLeft() {
		return imageMarioWalkLeft;
	}
	
	public Image getImageBackground1() {
		return imageBackground1;
	}
	
	public Image getImageBackground2() {
		return imageBackground2;
	}

	public Image getImageMarioStopRight() {
		return imageMarioStopRight;
	}

	public Image getImageMarioStopLeft() {
		return imageMarioStopLeft;
	}

	public Image getImageMarioJumpLeft() {
		return imageMarioJumpLeft;
	}

	public Image getImageMarioJumpRight() {
		return imageMarioJumpRight;
	}
	
	//Getters Tortoise
	public Image getImageTortoiseWalkRight() {
		return imageTortoiseWalkRight;
	}

	public Image getImageTortoiseWalkLeft() {
		return imageTortoiseWalkLeft;
	}

	public Image getImageTortoiseStopRight() {
		return imageTortoiseStopRight;
	}

	public Image getImageTortoiseStopLeft() {
		return imageTortoiseStopLeft;
	}
	
	public Image getImageTortoiseClosed() {
		return imageTortoiseClosed;
	}
	
	//Getters Champignon
	
	public Image getImageChampWalkRight() {
		return imageChampWalkRight;
	}

	public Image getImageChampWalkLeft() {
		return imageChampWalkLeft;
	}

	public Image getImageChampStopRight() {
		return imageChampStopRight;
	}

	public Image getImageChampStopLeft() {
		return imageChampStopLeft;
	}

	public Image getImageChampEcraseRight() {
		return imageChampEcraseRight;
	}

	public Image getImageChampEcraseLeft() {
		return imageChampEcraseLeft;
	}

	

	public Image getImagePipeRed() {
		return imagePipeRed;
	}
	
	public Image getImageBloc() {
		return imageBloc;
	}
	
	public Image getImageBoom() {
		return imageBoom;
	}

	public Image getImageChateauFin() {
		return imageChateauFin;
	}

	public Image getImageDrapeau() {
		return imageDrapeau;
	}
	
	public Image getImagePiece1() {
		return this.imagePiece1;
	}
	
	public Image getImagePiece2() {
		return this.imagePiece2;
	}



}
