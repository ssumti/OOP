package OOP.Monopoly.player;

import java.awt.Graphics;

import OOP.Monopoly.Handler;
import OOP.Monopoly.gfx.Assets;

public class Player1 extends Player{

	public Player1(Handler handler, int x, int y) {
		super(handler, x, y,DEFAUlT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
	}

	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player_1, (int) x, (int) y, width, height, null);
	}

}
