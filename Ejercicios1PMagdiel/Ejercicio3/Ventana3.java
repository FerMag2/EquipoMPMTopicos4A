package Ejercicio3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana3 extends Frame implements ActionListener{
	Button aceptar;
	TextField text;
	Panel central;
	TextArea txt;
	Button igual;
	public Ventana3() {
		aceptar= new Button("Aceptar");
		aceptar.addActionListener(this);
		aceptar.setBackground(new Color(125,125,125));
		text = new TextField();
		igual = new Button("=");
		igual.addActionListener(this);
		central = new Panel();
		txt = new TextArea("Resultado "+'\n');
		central.setLayout(new BorderLayout());
		central.add(aceptar,BorderLayout.EAST);
		central.add(text,BorderLayout.CENTER);
		central.add(txt,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(central,BorderLayout.CENTER);
		this.add(igual,BorderLayout.EAST);
		this.setSize(300,300);
		this.setVisible(true);
		cerrar();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==aceptar) {
			String texto= text.getText();
			int text2 = Integer.parseInt(texto);
			suma(text2);
			txt.append(texto+'\n');
			text.setText("");
		} else if(e.getSource()==igual) {
			txt.append("La suma de los elementos son " +sumade());	
		}	
	}
	int sumatotal=0;
	public void suma(int num) {
		sumatotal+=num;
	}
	public int sumade() {
		return sumatotal;	
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
		Ventana3 miventana = new Ventana3();
	}
}
