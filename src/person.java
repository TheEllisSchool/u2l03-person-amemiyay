import java.awt.Color;
import java.awt.Graphics;

public class person {
	//attributes
	private Color eyecolor;
	private Color haircolor;
	private int height;
	private int x; //top of body (neck)
	private int y; //top of body (neck)
	
	//methods
	
	//constructor
	public person (Color ec, Color hr, int h, int xin, int yin) {
		eyecolor = ec;
		haircolor = hr;
		height = h;
		x = xin;
		y = yin;
	}

	public void show(Graphics g) {
		//body
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + height - 50);
		//legs
		g.drawLine(x, y + height - 50, x - 30, y + height);
		g.drawLine(x, y + height - 50, x + 30, y + height);
		//arms
		g.drawLine(x, y + ((height - 50)/2), x - 15, y + ((height - 50)/2));
		g.drawLine(x, y + ((height - 50)/2), x + 15, y + ((height - 50)/2));
		//head
		g.fillOval(x - 30, y - 100, 60, 100);
		
	}
}
