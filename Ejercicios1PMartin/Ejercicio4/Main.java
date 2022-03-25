package Ejercicio4;

import Ejercicio4.Mundo;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Random;

public class Main extends Frame implements MouseListener, MouseMotionListener, KeyListener{
    Panel p;
    Mundo mundo;

    Random r = new Random();

    public Main(){
        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        mundo = new Mundo();
        p.add(mundo);
        this.addKeyListener(this);
        p.addKeyListener(this);
        mundo.addMouseListener(this);
        mundo.addMouseMotionListener(this);
        mundo.addKeyListener(this);
        this.add(p, BorderLayout.CENTER);
        this.setSize(500,400);
        this.setVisible(true);

    }

    public static void main(String args []){
        new Main().addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Dragged");
        mundo.setX(e.getX());
        mundo.setY(e.getY());
        mundo.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Moved");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Clicked");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
                System.out.println("Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Exit");

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Typed");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Key Pressed");

        switch (e.getKeyChar()){
            case 'w':
            case KeyEvent.VK_W:
            mundo.setY(mundo.getY()-3);
                break;

            case 's':
            case KeyEvent.VK_S:
            mundo.setY(mundo.getY()+3);
                break;
            
            case 'a':
            case KeyEvent.VK_A:
            mundo.setX(mundo.getX()-3);
                break;
            
            case 'd':
            case KeyEvent.VK_D:
            mundo.setX(mundo.getX()+3);
                break;
        }
        mundo.setSprite();
        mundo.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Key Released");

    }
}