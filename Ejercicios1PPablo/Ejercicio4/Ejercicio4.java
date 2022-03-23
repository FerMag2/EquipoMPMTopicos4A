package Ejercicio4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio4 extends Canvas{
	int x,y;
	int w,h;
	public Ejercicio4() {
		x=20;
		y=28;
		w=h=100;
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.drawRect(x, y, w, h);
		g.fillOval(x, y, w, h);
		g.setColor(Color.white);
		g.drawString("Hola :v", x,(y+h/2));
    }
}
