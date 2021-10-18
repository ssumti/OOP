package OOP.Monopoly.player;

import java.awt.Graphics;

import OOP.Monopoly.Handler;

public abstract class Player {
	
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAUlT_CREATURE_WIDTH = 32,
			                DEFAULT_CREATURE_HEIGHT = 32;
	
	protected float speed;
	protected float xMove, yMove;
	protected float x, y;
	protected int width, height;
	protected Handler handler;
	
	public Player(Handler handler, int x, int y, int width, int height) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		xMove= 0;
		yMove = 0;
		speed = DEFAULT_SPEED;
	}
	
	public void moveX() {
		
	}
	
	public void moveY() {
		
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	// GETTERS AND SETTERS

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
