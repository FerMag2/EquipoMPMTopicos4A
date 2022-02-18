package Ejercicio2;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class VentanaConLayout extends Frame implements ActionListener{
    Button btn;
    Button btn1;
    Button btn2;
    Button btns[];
    Panel p1;
    Panel p2;
    Panel p3;
    Panel p4;
    TextArea txt;

    public VentanaConLayout(){
        btn = new Button();
        btn1 = new Button();
        btn2 = new Button();
        btns = new Button[10];
        for (int i=0; i<btns.length; i++){
            btns[i] = new Button(i + "");
            btns[i].addActionListener(this);
        }
        p1 = new Panel();


        p2 = new Panel();


        p3 = new Panel();


        p4 = new Panel();
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(btn, BorderLayout.WEST);
        this.add(p4, BorderLayout.EAST);
        btn1.setBounds(5,5,20,20);
        p4.add(btn1);
        p4.add(btn2);
        p4.setSize(200,100);
        this.setSize(800,200);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            
        }

        txt = new TextArea();
        this.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout());
        p2.setLayout(new FlowLayout());
        p3.setLayout(new CardLayout());

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(btn, BorderLayout.WEST);

        this.setSize(400,200);
        this.setVisible(true);
    }

    //Metodo para cerra el Frame con la X
    public void CerrarVentana(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
        
        System.exit(0);
        }
        });
        }

    public static void main (String args []){
        VentanaConLayout VCL = new VentanaConLayout();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) System.exit (0);
            else{
                System.out.println(e.getActionCommand());
            }
        }
    }
}
