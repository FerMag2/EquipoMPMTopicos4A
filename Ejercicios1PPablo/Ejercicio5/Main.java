package Ejercicio5;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Main extends Frame implements MouseListener, MouseMotionListener, KeyListener{

    //Crear panel
    Panel p;

    //Objetos de la clase canvas
    Ejercicio5 ej4;

    public Main(){

        //Crear panel
        p = new Panel();

        //Agregar layout
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());

        //Creacion de objetos
        ej4 = new Ejercicio5();

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

    }

    public static void main(String[] args) {
     
        new Main().addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent e){

                System.exit(0);

            }
        });       
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        System.out.println("Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        System.out.println("Moved");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    
       System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
          System.out.println("Pressed");      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
               System.out.println("Released"); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
          System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
            System.out.println("Exited");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch (e.getKeyChar()) {

            case 'w':
            case KeyEvent.VK_W:
                ej4.setY(ej4.getY()-8);
                //ej4.repaint();
            break;
        
            case 's':
            case KeyEvent.VK_S:
                ej4.setY(ej4.getY()+8);
                //ej4.repaint();
            break;

            case 'a':
            case KeyEvent.VK_A:
                ej4.setX(ej4.getX()-8);
                //ej4.repaint();
            break;
        
            case 'd':
            case KeyEvent.VK_D:
                ej4.setX(ej4.getX()+8);
                //ej4.repaint();
            break;
        }
        ej4.setSprite();
        ej4.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}
