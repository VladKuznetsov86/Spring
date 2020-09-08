package ru.kuznetsov.springtest;

/*
 * Kill the first problem – strong dependence.  
 * Class MusicPlayer can work with any objects that implement interface Music.
 */

public class MusicPlayer {
	private Music music;

	// Here is inversion of control. 
	// Class doesn't create dependencies but take parameters. 
	// As a parameter here is an object of class that implements interface Music.
	public MusicPlayer (Music music) {
	this.music = music;
	}

	public void playMusic () {
	System.out.println("Playing: " + music.getSong());
	}
}

