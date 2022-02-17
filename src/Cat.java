import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 25;
	private static final int EYE_WIDTH = 15;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2 - 3;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3 + 10;
	
	private static final int NOSE_X = MOUTH_X;
	private static final int NOSE_Y = MOUTH_Y  - 20;
	private static final int NOSE_SIZE = 15;
	
	private static final int EAR_SIZE = HEAD_DIMENSION/ 4;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX + MOUTH_X;
		int y=catY + MOUTH_Y;
		g2.setColor(Color.red);
		g2.fillOval(x - 30, y - 70, EAR_SIZE, EAR_SIZE);
		g2.fillOval(x + 30, y - 70, EAR_SIZE, EAR_SIZE);
		g2.setColor(Color.black);
		x = catX;
		y = catY;
		// Draw the head
		g2.setColor(Color.black);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.blue);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.fillOval(x + 5, y - 22, NOSE_SIZE, NOSE_SIZE);
		g2.setColor(Color.black);
		// Draw whiskers
		g2.drawLine(x+75, y, x-50, y);
		g2.drawLine(x+75, y+10, x-50, y+10);
		// Draw ears
		
		
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow, I'm a cat", catX, catY+HEAD_DIMENSION+10);	
	}
}
