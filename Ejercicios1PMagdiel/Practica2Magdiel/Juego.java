package Practica2Magdiel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Juego extends Frame implements MouseMotionListener, MouseListener{
	Button boton1;
	Button boton2;
	Button boton3;
	Button boton4;
	Button boton5;
	Botoncito circulo;
	MisDibujos d;
	public Juego() {
		d= new MisDibujos();
		d.addMouseListener(this);
		boton1= new Button("Red");
		boton1.setBackground(Color.red);
		boton1.setBounds(700, 400, 30, 30);
		boton1.addMouseMotionListener(this);
		boton1.addMouseListener(this);
		
		boton2= new Button("Green");
		boton2.setBackground(Color.green);
		boton2.setBounds(720, 450, 30, 30);
		boton2.addMouseMotionListener(this);
		boton2.addMouseListener(this);
		
		boton3= new Button("Blue");
		boton3.setBackground(Color.blue);
		boton3.setBounds(690, 350, 30, 30);
		boton3.addMouseMotionListener(this);
		boton3.addMouseListener(this);
		
		boton4= new Button("yellow");
		boton4.setBackground(Color.yellow);
		boton4.setBounds(650, 400, 30, 30);
		boton4.addMouseMotionListener(this);
		boton4.addMouseListener(this);
		
		boton5= new Button("orange");
		boton5.setBackground(Color.orange);
		boton5.setBounds(670, 450, 30, 30);
		boton5.addMouseMotionListener(this);
		boton5.addMouseListener(this);
		
		circulo= new Botoncito("Botoncito",Color.green,Color.orange);
		circulo.setBounds(400, 50, 100, 100);
		this.add(boton1);
		this.add(boton2);
		this.add(boton3);
		this.add(boton4);
		this.add(boton5);
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
	public static void main(String args[]) {
	    Juego miventana = new Juego();
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
		if(e.getSource()==boton1) {
			validar(boton1);
		}if(e.getSource()==boton2) {
			validar(boton2);
		}if(e.getSource()==boton3) {
			validar(boton3);
		}if(e.getSource()==boton4) {
			validar(boton4);
		}if(e.getSource()==boton5) {
			validar(boton5);
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
		if(e.getSource()==boton1) {
			mover(e,boton1);
		}
		if(e.getSource()==boton2) {
			mover(e,boton2);
		}
		if(e.getSource()==boton3) {
			mover(e,boton3);
		}
		if(e.getSource()==boton4) {
			mover(e,boton4);
		}
		if(e.getSource()==boton5) {
			mover(e,boton5);
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
		if(btn.equals(boton1)) {
			boton1.setBounds(700, 400, 30, 30);
		}if(btn.equals(boton2)) {
			boton2.setBounds(700, 450, 30, 30);
		}if(btn.equals(boton3)) {
			boton3.setBounds(690, 350, 30, 30);
		}if(btn.equals(boton4)) {
			boton4.setBounds(650, 400, 30, 30);
		}if(btn.equals(boton5)) {
			boton5.setBounds(670, 450, 30, 30);
		}
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
