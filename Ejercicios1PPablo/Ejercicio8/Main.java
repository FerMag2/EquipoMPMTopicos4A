package EquipoMPMTopicos4A.Ejercicios1PPablo.Ejercicio8;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Main extends Frame implements MouseListener, MouseMotionListener, KeyListener{

    //Crear panel
    Panel p;

    //Objetos de la clase canvas
    Ejercicio8 ej4;

    public Main(){

        //Crear panel
        p = new Panel();

        //Agregar layout
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());

        //Creacion de objetos
        ej4 = new Ejercicio8();

        //Agregar al panel
        p.add(ej4);

        //Añadir key listener
        this.addKeyListener(this);
        p.addKeyListener(this);
        ej4.addKeyListener(this);
        
        //MouseListener
        this.addMouseListener(this);
        ej4.addMouseMotionListener(this);

        //Agregar el panel al frame
        this.add(p,BorderLayout.CENTER);
        this.setSize(500,400);
        this.setVisible(true);


        //Setear los valores de las x and y
        ej4.setXc(ej4.generarAleatorioX());
        ej4.setYc(ej4.generarAleatorioY());

    }

    public static void main(String[] args) {
     
        new Main().addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent e){

                System.exit(0);

            }
        });       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch (e.getKeyChar()) {

            case 'w':
            case KeyEvent.VK_W:
                ej4.setY(ej4.getY()-8);
                ej4.repaint();

            break;
        
            case 's':
            case KeyEvent.VK_S:
                ej4.setY(ej4.getY()+8);
                ej4.repaint();
            break;

            case 'a':
            case KeyEvent.VK_A:
                ej4.setX(ej4.getX()-8);
                ej4.repaint();
                ej4.setSprite();
            break;
        
            case 'd':
            case KeyEvent.VK_D:
                ej4.setX(ej4.getX()+8);
                ej4.repaint();
                ej4.setSprite();
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
                
    }

    @Override
    public void mouseReleased(MouseEvent e) {
                
    }

    @Override
    public void mouseEntered(MouseEvent e) {
          
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
    
    }
}