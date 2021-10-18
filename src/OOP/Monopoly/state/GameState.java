package OOP.Monopoly.state;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import OOP.Monopoly.Handler;
import OOP.Monopoly.gfx.Assets;
import OOP.Monopoly.items.Dice;
import OOP.Monopoly.player.Player;
import OOP.Monopoly.player.Player1;
import OOP.Monopoly.ui.ClickListener;
import OOP.Monopoly.ui.UIImageButton;
import OOP.Monopoly.ui.UIManager;

public class GameState extends State{
	
	private Player1 player_1;
	private final int BOARD_WIDTH = 1000, BOARD_HEIGHT = 1000;
	private final int xBoard = 250, yBoard = 0;
	private JButton button;
	private UIManager uiManager;
	private Dice dice_1, dice_2;
	private Graphics g;
	private long stop = 0, lastTime, timer = 5000;

	public GameState(Handler handler) {		
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		dice_1 = new Dice(handler,xBoard + BOARD_WIDTH - 310, yBoard + 230, 50, 50);
		dice_2 = new Dice(handler, xBoard + BOARD_WIDTH - 240, yBoard + 230, 50, 50);
		lastTime = System.currentTimeMillis();
		
		uiManager.addObjects(new UIImageButton(xBoard + BOARD_WIDTH - 300, yBoard + 300, 100, 50, Assets.roll_btn, new ClickListener() {

			@Override
			public void onClick() {
				while(stop<timer) {
					stop += System.currentTimeMillis() - lastTime;
					lastTime = System.currentTimeMillis();
					dice_1.tick();
					dice_2.tick();
				}
			}}));
		
		player_1 = new Player1(handler, xBoard + BOARD_WIDTH - 100, yBoard + BOARD_HEIGHT - 100);
	}
	
	public void tick() {
		uiManager.tick();
		player_1.tick();
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.board, xBoard, yBoard, BOARD_WIDTH, BOARD_HEIGHT, null);
		uiManager.render(g);
		player_1.render(g);	
		dice_1.render(g);
		dice_2.render(g);
	}

}
