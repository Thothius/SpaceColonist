package game;


import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


//Space Colonist is a space survival simulation
//Copyright (C) 2016 Kristjan Saaremets
//This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License 
//as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
//This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
//of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

public class Game extends StateBasedGame {
	
	
	public static final String gameName = "Game Test";
	public static final int menu = 0;
	public static final int play = 1;
	
	public Game(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	}
	

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
	this.getState(menu).init(gc, this);
	this.getState(play).init(gc, this);
	this.enterState(menu);
	}

	public static void main(String[] args) throws SlickException {
		
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(600, 400, false);
			appgc.start();
		} catch(SlickException e){
			e.printStackTrace();
		}
		
	}






}
