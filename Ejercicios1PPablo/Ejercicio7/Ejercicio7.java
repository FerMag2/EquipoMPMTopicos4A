package Ejercicio7;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio7 extends Canvas {

    int sprite;
    int x, y, xc,yc;
    int w, h, wc, hc;
    ThreadLocalRandom tl = ThreadLocalRandom.current();

    public int getXc() {
        return xc;
    }
    
    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getWc() {
        return wc;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }

    public int getHc() {
        return hc;
    }

    public void setHc(int hc) {
        this.hc = hc;
    }

    public void setXc(int xc) {
        this.xc = xc;
    }

    public int getYc() {
        return yc;
    }

    public void setYc(int yc) {
        this.yc = yc;
    }

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

    public void setSprite(){
        sprite++;
        if(sprite > 3){ sprite=1;

        }
    }

    public Ejercicio7(){
        sprite = 1;
        x=90;
        y=90;
        w=h=100;
    }

    public void paint(Graphics g){

        colision();
        g.setColor(Color.BLUE);
        g.fillOval(xc, yc, 30, 30);
        g.setColor(Color.YELLOW);
        switch (sprite) {
            case 1:
            g.fillOval(x, y, w, h);
            break;
            case 2:
            g.fillArc(x, y, w, h, 0, 300);
            break;
            case 3:
            g.fillArc(x, y, w, h, 0, 250);
            break;
        }

        /*
        g.setColor(Color.BLACK);
        g.setColor(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawString("       Pacman :v", x, y+h/2);  
        */
    }

    private void colision() {

        if(xc > x && 
           xc < (x + w) &&
           yc > y &&
           yc < (y + h))
        {
            setXc(generarAleatorioX());
            setYc(generarAleatorioY());
            repaint();
        }    
    }

    public int generarAleatorioX(){

        int randomX = tl.nextInt(0,450);

        return randomX;
    }

    public int generarAleatorioY(){

        int randomY = tl.nextInt(0,350);

        return randomY;     
    }
}
