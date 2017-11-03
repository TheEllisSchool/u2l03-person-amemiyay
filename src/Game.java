import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "person");
	
	public static Color BROWN = new Color(142, 64, 4);
	static person mrsLombardi = new person(Color.GREEN, BROWN, 300, 100, 150);
	static person leah = new person(Color.CYAN, BROWN, 300, 400, 150);
	
	public static void main(String[] args) {
		showGameBoard(gb);

	}
	
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		leah.show(g);
	}

}
