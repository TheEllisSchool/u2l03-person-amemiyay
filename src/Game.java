import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "person");
	
	public static Color BROWN = new Color(142, 64, 4);
	static person mrsLombardi = new person(Color.GREEN, BROWN, 300, 100, 150, Color.RED);
	static person leah = new person(Color.CYAN, BROWN, 220, 250, 150, Color.BLUE);
	static person erica = new person(BROWN, BROWN, 250, 400, 150, Color.yellow);
	
	
	public static void main(String[] args) {
		showGameBoard(gb);
		System.out.println(mrsLombardi);
		
		//System.out.println(mrsLombardi.getX());
		//mrsLombardi.setX(1000);
		//System.out.println(mrsLombardi.getX());
		
		for (int i = 0; i < 70; i++) {
			mrsLombardi.walk();
			leah.walk();
		}
		
	}
	
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		leah.show(g);
		erica.show(g);
	}

}
