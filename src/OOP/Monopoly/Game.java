package OOP.Monopoly;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;

import OOP.Monopoly.display.Display;
import OOP.Monopoly.gfx.Assets;
import OOP.Monopoly.input.MouseManager;
import OOP.Monopoly.state.GameState;
import OOP.Monopoly.state.MenuState;
import OOP.Monopoly.state.State;


public class Game implements Runnable{
	
	private Display display;
	
	private int width, height;
	private String title;
	
	private Thread thread;
	private boolean running = false;
	
	private BufferStrategy bs;
	private Graphics g;
	
	// States
	public State gameState;
	public State menuState;
	
	// Handler
	private Handler handler;
	
	// Input
	private MouseManager mouseManager;
	
	public Game(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		mouseManager = new MouseManager();
	}
	
	public void init() {
		display = new Display(title, width, height);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		handler = new Handler(this);
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		State.setState(gameState);
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void run() {
        init();
		
		int fps = 60;
		double timePerTick = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		long ticks= 0;
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			if(delta>=1) {
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000) {
				System.out.println("Ticks and Frames: "+ ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();

	}
	
	public void tick() {
		if(State.getState() != null)
			State.getState().tick();
	}
	
	public void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs==null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		
		g.clearRect(0, 0, width, height);
		
		if(State.getState() != null)
			State.getState().render(g);
		
		bs.show();
		g.dispose();
	}
	
	// GETTERS AND SETTERS
	
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
	
	public MouseManager getMouseManager() {
		return mouseManager;
	}

	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
