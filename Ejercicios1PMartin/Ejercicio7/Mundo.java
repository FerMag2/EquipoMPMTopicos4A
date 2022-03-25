package Ejercicio7;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Mundo extends Canvas{
    int x, y, w, h, xc, yc, sprite;

    public Mundo(){
        sprite = 1;
        x = 20;
        y = 28;
        w = h = 100;
        xc = (int) (Math.random() * 500); //this.getWidth());
        yc = (int) (Math.random() * 400); //this.getHeight());

    }

    public void paint (Graphics g){
        
        colision();

        //Para dibujar el hola Mundo
        //Fill tiene relleno
        //Draw es solo contorno
            g.setColor(Color.RED);
            g.fillOval(xc, yc, 20, 20);
            g.setColor(Color.BLACK);
                //g.drawRect(x, y, w, h);

            switch (sprite){
                case 1:
                    g.fillOval(x, y, w, h);
                    break;
                case 2:
                    g.fillArc(x, y, w, h, 0, 270);
                    
                    break;
                case 3:
                    g.fillArc(x, y, w, h, 0, 200);
                    break;
                case 4:
                    break;
                default:
                break;
            }

            //g.fillOval(x, y, w, h);
            g.setColor(Color.WHITE);
            g.drawString("  O  _  O", x, y + h/2);
    }

    public void colision(){
        /**
         * La posicion de "x" de la principal es mayor que la posicion de la secundaria.
         * La posicion de "x" de la principal es menor que la posicion de la secundaria mas el ancho.
         * La posicion de "y" de la principal es mayor que la posicion de la secundaria.
         * La posicion de "y" de la principal es menor que la posicion de la secundaria mas su altura
         */

        if (xc > x && 
            xc < (x + w) &&
            yc > y && 
            yc < (y + h)){
                xc = (int)(Math.random() * 500);
                yc = (int)(Math.random() * 400);
            }
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

    public int getXc() {
        return xc;
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

    public void setSprite(){
        sprite++;
        if (sprite > 3) {
            sprite=1;
        }
    }
}