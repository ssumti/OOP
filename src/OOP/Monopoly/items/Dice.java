package OOP.Monopoly.items;

import java.awt.Graphics;

import OOP.Monopoly.Handler;
import OOP.Monopoly.gfx.Animation;
import OOP.Monopoly.gfx.Assets;

public class Dice extends Items{
	
	private Animation animation;

	public Dice(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		animation = new Animation(50, Assets.dice);
	}

	@Override
	public void tick() {
		animation.tick();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getCurrentFrame(), (int) x, (int) y, width, height, null);
	}
	

}
