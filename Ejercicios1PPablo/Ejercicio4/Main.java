package EquipoMPMTopicos4A.Ejercicios1PPablo.Ejercicio4;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Main extends Frame implements MouseMotionListener, MouseListener {

    Panel p;
    Ejercicio4 ejercicio4;

    public Main(){

        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(new Ejercicio4(), BorderLayout.CENTER);
        ejercicio4 = new Ejercicio4();
        p.add(ejercicio4);
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
        System.out.println("Drageed");
        
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
        System.out.println("Presed");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       System.out.println("Relesead");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
        
    }
}
