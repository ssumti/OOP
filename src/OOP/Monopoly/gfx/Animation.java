package OOP.Monopoly.gfx;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Animation {
	
	private int speed, index;
	private long lastTime, timer = 0;
	private BufferedImage[] frames;
	private Random rand;
	private int check;
	
	public Animation(int speed, BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames;
		rand = new Random();
		index = rand.nextInt(6);
		check = index;
		lastTime = System.currentTimeMillis();
	}
	
	public void tick() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed) {
			index = rand.nextInt(6); 
			timer = 0;
		}
	}
	
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}

}
