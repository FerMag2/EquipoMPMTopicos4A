package EquipoMPMTopicos4A.Ejercicios1PPablo.Ejercicio8;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ejercicio8 extends Canvas {

    int sprite;
    int x, y, xc,yc;
    int w, h, wc, hc;
    ThreadLocalRandom tl = ThreadLocalRandom.current();
    private BufferedImage img;
    private BufferedImage img2;
    private BufferedImage img3;

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

    public Ejercicio8(){

        sprite = 1;
        x=90;
        y=90;
        w=h=100;

        try {
            img = ImageIO.read(new File("C:/Users/Pablo Che/Documents/RepositorioTAP/EquipoMPMTopicos4A/Ejercicios1PPablo/Ejercicio8/src/m1.png"));
            img2 = ImageIO.read(new File("C:/Users/Pablo Che/Documents/RepositorioTAP/EquipoMPMTopicos4A/Ejercicios1PPablo/Ejercicio8/src/m2.png"));
            img3 = ImageIO.read(new File("C:/Users/Pablo Che/Documents/RepositorioTAP/EquipoMPMTopicos4A/Ejercicios1PPablo/Ejercicio8/src/m3.png"));
            
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void paint(Graphics g){

        colision();
        g.setColor(Color.BLUE);
        g.fillOval(xc, yc, 30, 30);
        
        switch (sprite) {
            case 1:
            if (img != null) {
                g.drawImage(img, x, y, this);
            }
            break;
            case 2:
            if (img2 != null) {
                g.drawImage(img2, x, y, this);
            }
                break;
            case 3:
            if (img3 != null) {
                g.drawImage(img3, x, y, this);
            }
           break;
        }
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
