package Ejercicio8;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;

import javax.imageio.ImageIO;
public class Fantasma extends Canvas{
	int x,y;
	int w,h;
	int sprite;
	 private BufferedImage img;
	 private BufferedImage img2;
	 private BufferedImage img3;
	public Fantasma() {
		x=20;
		y=28;
		w=h=100;
		 try {
	            img = ImageIO.read(new File("C:/Users/Magdiel/Documents/Sprites/fly.png"));
	            img2 = ImageIO.read(new File("C:/Users/Magdiel/Documents/Sprites/idle.png"));
	            img3 = ImageIO.read(new File("C:/Users/Magdiel/Documents/Sprites/move.png"));
	            
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	}
	
	 public Dimension getPreferredSize() {
         return img == null ? new Dimension(w, h) : new Dimension(img.getWidth(), img.getHeight());
     }

	public void paint(Graphics g) {
			//g.setColor(Color.black);
			//g.drawRect(x, y, w, h);
			//g.fillOval(x, y, w, h);
			//g.setColor(Color.white);
			//g.drawString("Hola mundo", x,(y+h/2));
		
		switch(sprite) {
		case 1:
			if (img != null) {
	            //int x = (getWidth() - img.getWidth()) / 2;
	            //int y = (getHeight() - img.getHeight()) / 2;
	            g.drawImage(img, x, y, this);
	        }
			break;
		case 2:
			if (img2 != null) {
	            //int x = (getWidth() - img.getWidth()) / 2;
	            //int y = (getHeight() - img.getHeight()) / 2;
	            g.drawImage(img2, x, y, this);
	        }
			break;
		case 3:
			if (img3 != null) {
	            //int x = (getWidth() - img.getWidth()) / 2;
	            //int y = (getHeight() - img.getHeight()) / 2;
	            g.drawImage(img3, x, y, this);
	        }
			break;
		default:
			
			break;
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
	public void setSprite(int po) {
		sprite = po;
	}
	
}

