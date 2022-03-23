import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.*;

public class Practica2 extends Frame implements MouseMotionListener, MouseListener, KeyListener{
	
	Label p1, p2, p3, p4;
	JButton botonRedondo;
	Dibujo d;

	public Practica2() {
		
		d= new Dibujo();
		d.addMouseListener(this);
		
		p1 = new Label();
		p1.setText("Buenos dias");
		p1.setBackground(Color.CYAN);
		p1.addMouseMotionListener(this);
		p1.addMouseListener(this);
		p1.setBounds(700, 400, 70 , 30);

		p2 = new Label();
		p2.setText("mi nombre");
		p2.setBackground(Color.GREEN);
		p2.setBounds(690, 450, 63, 30);
		p2.addMouseMotionListener(this);
		p2.addMouseListener(this);

		p3 = new Label();
		p3.setText("es");
		p3.setBackground(Color.ORANGE);
		p3.setBounds(650, 400, 30, 30);
		p3.addMouseMotionListener(this);
		p3.addMouseListener(this);

		p4 = new Label();
		p4.setText("Juan");
		p4.setBackground(Color.PINK);
		p4.setBounds(690, 350, 30, 30);
		p4.addMouseMotionListener(this);
		p4.addMouseListener(this);

		botonRedondo = new Boton("Reiniciar",Color.green,Color.CYAN);
		botonRedondo.addMouseListener(this);
		botonRedondo.addMouseMotionListener(this);
		botonRedondo.addKeyListener(this);
		this.addKeyListener(this);
		botonRedondo.setBounds(400, 50, 100, 100);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(botonRedondo);
		this.add(d);
		this.setBounds(250, 100, 900, 600);
		this.setVisible(true);
		cerrar();
	}
	
	public void cerrar() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {

		Practica2 miventana = new Practica2();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		if(e.getSource()==p1) {
			validar(p1);
		}if(e.getSource()==p2) {
			validar(p2);
		}if(e.getSource()==p3) {
			validar(p3);
		}if(e.getSource()==p4) {
			validar(p4);
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==p1) {
			mover(e,p1);
		}
		if(e.getSource()==p2) {
			mover(e,p2);
		}
		if(e.getSource()==p3) {
			mover(e,p3);
		}
		if(e.getSource()==p4) {
			mover(e,p4);
		}
	}

	public void mover(MouseEvent g, Label n) {
		n.setLocation(
		    n.getX() + g.getX() - n.getWidth() / 2,
		    n.getY() + g.getY() - n.getHeight() / 2
		);
	}
	
	public void validar(Label n) {
		int x = n.getX();
		int y = n.getY();
		if(x>=100 & x<=370 & y>230 & y<500) {

		}
		else {
			regresar(n);
		}
	}

	public void regresar(Label n) {
		if(n.equals(p1)) {
			p1.setBounds(700, 400, 70 , 30);
		}if(n.equals(p2)) {
			p2.setBounds(690, 450, 63, 30);
		}if(n.equals(p3)) {
			p3.setBounds(650, 400, 30, 30);
		}if(n.equals(p4)) {
			p4.setBounds(690, 350, 30, 30);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {	
	}
	@Override
	public void mouseEntered(MouseEvent e) {	
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {

		if(e.getSource() == botonRedondo){

			reiniciarBoton();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case 'r':
			case KeyEvent.VK_R:
			

			reiniciarBoton();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void reiniciarBoton(){

		p1.setBounds(700, 400, 70 , 30);
		p2.setBounds(690, 450, 63, 30);
		p3.setBounds(650, 400, 30, 30);
		p4.setBounds(690, 350, 30, 30);

	}
}