package Practica2Martin;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
public class Boton extends JButton{
	private Color fondo, presion;
	public Boton(String nombre,Color cf, Color cp) {
		super(nombre);
		fondo=cf;
		presion=cp;
		setContentAreaFilled(false);
	}
	
@Override
protected void paintComponent(Graphics g) {
	if(getModel().isArmed()) {
		g.setColor(presion);
	}else {
		g.setColor(fondo);
	}
	g.fillOval(0, 0, getSize().width-1, getSize().height-1);
	super.paintComponent(g);
}
@Override
protected void paintBorder(Graphics g) {
	// TODO Auto-generated method stub
	g.setColor(Color.black);
	g.drawOval(0, 0, getSize().width-1, getSize().height-1);
	}
}