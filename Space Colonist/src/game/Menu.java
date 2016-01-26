package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		
		Image moon = new Image("res/space.png");
		g.drawImage(moon, 0, 0);
		g.drawString("New Game", 265, 175);
		g.drawString("Options", 268, 200);
		g.drawString("Options", 268, 200);
		g.drawString("Exit", 284, 225);
		//g.drawRect(5, 5, 100, 30);
		
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	}
	
	public int getID(){
		return 0;
	}
	
}
