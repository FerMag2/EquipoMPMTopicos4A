package Ejercicio5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio5 extends Canvas {

    int x, y;
    int w, h;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ejercicio5(){

        x=90;
        y=90;
        w=h=100;
    }

    public void paint(Graphics g){

        g.setColor(Color.black);
		g.drawRect(x, y, w, h);
		g.fillOval(x, y, w, h);
		g.setColor(Color.white);
		g.drawString("Hola mundo", x,(y+h/2));
    }
}