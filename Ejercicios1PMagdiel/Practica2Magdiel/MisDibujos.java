package Practica2Magdiel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MisDibujos extends Canvas{
	public MisDibujos() {

	}
	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(100, 200, 300, 300);
		
		g.setColor(Color.black);
		//g.drawRect(600,200, 200, 200);
		//g.translate(20, 30);
		g.drawLine(600, 400, 700, 300);
		g.drawLine(600, 400, 700, 500);
		g.drawLine(800, 400, 700, 300);
		g.drawLine(800, 400, 700, 500);	
	}
}
