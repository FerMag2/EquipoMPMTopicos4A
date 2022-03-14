package EquipoMPMTopicos4A.Ejercicios1PPablo.Ejercicio4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ejercicio4 extends Canvas {

    int x, y;
    int w, h;

    public Ejercicio4(){
        x=20;
        x=28;
        w=h=100;
    }

    public void paint(Graphics g){

        for(x=0; x<400;x++){
            g.setColor(Color.RED);
            g.drawRect(x, y, w, h);
            g.fillOval(x, y, w, h);
            g.setColor(Color.WHITE);
            g.drawString("Buenos días <3", x, y+h/2);
        
        }    
    }
}