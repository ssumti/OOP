package OOP.Monopoly.state;

import java.awt.Graphics;

import OOP.Monopoly.Handler;

public abstract class State {
private static State currentstate = null;
	
	public static void setState(State state) {
		currentstate = state;
	}
	
	public static State getState() {
		return currentstate;
	}
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
