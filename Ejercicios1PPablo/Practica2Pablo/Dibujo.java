import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas{
	
	public Dibujo() {

	}
	public void paint(Graphics g) {

		g.setColor(Color.YELLOW);
		g.fillRect(100, 200, 300, 300);
		g.setColor(Color.BLACK);
		g.drawLine(600, 400, 700, 300);
		g.drawLine(600, 400, 700, 500);
		g.drawLine(800, 400, 700, 300);
		g.drawLine(800, 400, 700, 500);	
		
	}
}