package Practica2Martin;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Juego extends Frame implements MouseMotionListener, MouseListener{
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Boton circulo;
	Dibujo d;
	public Juego() {
		d= new Dibujo();
		d.addMouseListener(this);
		btn1= new Button("1");
		btn1.setBackground(Color.cyan);
		btn1.setBounds(700, 400, 30, 30);
		btn1.addMouseMotionListener(this);
		btn1.addMouseListener(this);
		
		btn2= new Button("2");
		btn2.setBackground(Color.magenta);
		btn2.setBounds(720, 450, 30, 30);
		btn2.addMouseMotionListener(this);
		btn2.addMouseListener(this);
		
		btn3= new Button("3");
		btn3.setBackground(Color.pink);
		btn3.setBounds(690, 350, 30, 30);
		btn3.addMouseMotionListener(this);
		btn3.addMouseListener(this);
		
		btn4= new Button("4");
		btn4.setBackground(Color.blue);
		btn4.setBounds(650, 400, 30, 30);
		btn4.addMouseMotionListener(this);
		btn4.addMouseListener(this);
		
		btn5= new Button("5");
		btn5.setBackground(Color.lightGray);
		btn5.setBounds(670, 450, 30, 30);
		btn5.addMouseMotionListener(this);
		btn5.addMouseListener(this);
		
		circulo= new Boton("Boton",Color.green,Color.red);
		circulo.setBounds(100, 50, 100, 100);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(circulo);
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
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==btn1) {
			validar(btn1);
		}if(e.getSource()==btn2) {
			validar(btn2);
		}if(e.getSource()==btn3) {
			validar(btn3);
		}if(e.getSource()==btn4) {
			validar(btn4);
		}if(e.getSource()==btn5) {
			validar(btn5);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==btn1) {
			mover(e,btn1);
		}
		if(e.getSource()==btn2) {
			mover(e,btn2);
		}
		if(e.getSource()==btn3) {
			mover(e,btn3);
		}
		if(e.getSource()==btn4) {
			mover(e,btn4);
		}
		if(e.getSource()==btn5) {
			mover(e,btn5);
		}
	}
	public void mover(MouseEvent g, Button btn) {
		btn.setLocation(
		        btn.getX() + g.getX() - btn.getWidth() / 2,
		        btn.getY() + g.getY() - btn.getHeight() / 2
		        
		    );
		System.out.println("X:"+btn.getX());
		System.out.println("Y:"+btn.getY());
	}
	
	public void validar(Button btn) {
		int x = btn.getX();
		int y = btn.getY();
		if(x>=100 & x<=370 & y>230 & y<500) {
		}else {
			regresar(btn);
		}
		
	}
	public void regresar(Button btn) {
		if(btn.equals(btn1)) {
			btn1.setBounds(700, 400, 30, 30);
		}if(btn.equals(btn2)) {
			btn2.setBounds(700, 450, 30, 30);
		}if(btn.equals(btn3)) {
			btn3.setBounds(690, 350, 30, 30);
		}if(btn.equals(btn4)) {
			btn4.setBounds(650, 400, 30, 30);
		}if(btn.equals(btn5)) {
			btn5.setBounds(670, 450, 30, 30);
		}
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}