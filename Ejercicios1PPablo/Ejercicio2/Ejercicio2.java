package Ejercicio2;

//Librerias
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 extends Frame implements ActionListener{

    //Crear los widgets
    Button btn; Button btn1; Button btn2;
    Panel p1; Panel p2; Panel p3; Panel p4;
    TextArea txt;
    Button btns [];

    public Ejercicio2(){

        //Instanciar los widgets
        btn = new Button("Cerrar");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btns = new Button[10];

        for (int i=0; i<btns.length; i++){

            btns[i] = new Button(i+" ");
            btns[i].addActionListener(this);
        } 

        btn.addActionListener(this);
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        txt = new TextArea();

        //agregar a los paneles sus layouts
        this.setLayout(new BorderLayout()); //Por secciones

        p1.setLayout(new GridLayout(3,2)); //Por cuadros
        for (int i=0; i<6;i++){

            p1.add(btns[i]);
        }

        p2.setLayout(new FlowLayout()); //Siguiendo el flujo
        for (int i=6; i<btns.length;i++){

            p2.add(btns[i]);
        }

        p3.setLayout(new CardLayout()); //Uno solo con una carta
        p3.add(btns[9]);
        p4.setLayout(null);

        //Agregar los layouts al frame principal
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(btn, BorderLayout.WEST);
        this.add(p4, BorderLayout.EAST);
        btn2.setBounds(5,5, 20, 20);
        btn1.setBounds(30,40, 50, 60);

        //Agregar botones
        p4.setSize(200,100);
        p4.add(btn1);
        p4.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        p4.setVisible(true);

        //Agregar tamaño y hacer visible 
        this.setSize(400,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        Ejercicio2 e = new Ejercicio2();
        
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==btn){ 
        System.exit(0);
        }
		else {
			System.out.println("No hay mas opciones");
		}    
    }
}
