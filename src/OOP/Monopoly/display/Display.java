package OOP.Monopoly.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display implements ActionListener{
		private JFrame frame;
		private Canvas canvas;

		private String title;
		private int width, height;
		
		public Display(String title, int width, int height) {
			this.title = title;
			this.width = width;
			this.height = height;
			
			createDisplay();
		}
		
		public void createDisplay() {
			frame = new JFrame(title);
			frame.setSize(width, height);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			canvas = new Canvas();
			canvas.setPreferredSize(new Dimension(width, height));
			canvas.setMaximumSize(new Dimension(width, height));
			canvas.setMinimumSize(new Dimension(width, height));
			canvas.setFocusable(false);
			
			frame.add(canvas);
			frame.pack();
		}
		
		public Canvas getCanvas() {
			return canvas;
		}
		
		public JFrame getFrame() {
			return frame;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}

