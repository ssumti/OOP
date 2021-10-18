package OOP.Monopoly;

import OOP.Monopoly.display.Display;
import OOP.Monopoly.input.MouseManager;

public class Handler {
	
	private Game game;
	
	public Game getGame() {
		return game;
	}
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	public Display getDisplay() {
		return game.getDisplay();
	}
	
	

}
