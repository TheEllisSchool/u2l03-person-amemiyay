import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class person {
	//attributes
	private Color eyecolor;
	private Color haircolor;
	private int height;
	private int x; //top of body (neck)
	private int y; //top of body (neck)
	private Color boardcolor;
	
	//methods
	
	//constructor
	public person (Color ec, Color hr, int h, int xin, int yin, Color bc) {
		eyecolor = ec;
		haircolor = hr;
		height = h;
		x = xin;
		y = yin;
		boardcolor = bc;
	}
	
	//set x
	public void setX (int inx) {
		if (inx > 0 && inx < 500) {
			x = inx;
		} else {
			System.out.println("X out of bounds. X set to 10.");
			x = 10;
		}	
	}
	//get x
	public int getX() {
		return x;
	}
	
	public void walk() {
		int tempX = x;
		tempX += 10;
		setX(tempX);
	}

	public void show(Graphics g) {
		//skate board
		g.setColor(boardcolor);
		g.drawLine(x - 60, y + height, x + 60, y + height);
		g.drawLine(x - 60, y + height, x - 80, y + height - 15);
		g.drawLine(x + 60, y + height, x + 80, y + height - 15);
		//wheels
		Color GREY = new Color (169, 172, 178);
		g.setColor(GREY);
		g.fillOval(x - 55, y + height, 15, 15);
		g.fillOval(x + 40, y + height, 15, 15);
		//body
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + height - 50);
		//legs
		g.drawLine(x, y + height - 50, x - 30, y + height);
		g.drawLine(x, y + height - 50, x + 30, y + height);
		//arms
		g.drawLine(x, y + ((height - 50)/2), x - 15 , y + ((height - 50)/2));
		g.drawLine(x, y + ((height - 50)/2), x + 15, y + ((height - 50)/2));
		
		//hair
		g.setColor(haircolor);
		g.fillOval(x, y - 100, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval(x, y - 80, 100, 100);
		
		//head
		g.setColor(Color.BLACK);
		g.fillOval(x - 40, y - 100, 80, 100);
		
		//eyes
		g.setColor(eyecolor);
		g.fillOval(x - 10, y - 50, 10, 10);
		g.fillOval(x + 10, y - 50, 10, 10);	
		

		
	}
	//toString Override Method
	public String toString() {
		String sentence = "Eye Color: " + eyecolor + "\nHair Color: " + haircolor + "\nHeight: " 
				+ height + "\nBoard Color: " + boardcolor + "\nLocation: (" + x + ", " + y + ")";
		return sentence;
	}
	
}
