package Ejercicio2;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

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
        btn = new Button("Salir del programa");
        btn1 = new Button("");
        btn2 = new Button("");
        btns = new Button[10];
        
        for (int i=0; i<btns.length; i++){
            btns[i] = new Button(i + "");
            btns[i].addActionListener(this);
        }
        btn.addActionListener(this);
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();

        p4.add(btn1);
        p4.add(btn2);
        p4.setSize(200,100);
        p4.setVisible(true);

        txt = new TextArea();

        this.setLayout(new BorderLayout());

        p1.setLayout(new GridLayout(3,2));
        for (int i=0; i<6;i++){
            p1.add(btns[i]);
        }

        p2.setLayout(new FlowLayout());
        for (int i=6; i<btns.length;i++){
            p2.add(btns[i]);
        }

        p3.setLayout(new CardLayout());
        p3.add(btns[9]);
        p4.setLayout(null);

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(p4, BorderLayout.EAST);
        this.add(btn, BorderLayout.WEST);
        
        btn1.setBounds(5, 5, 20, 20);
        btn2.setBounds(5, 5, 20, 20);

        
        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        this.setSize(800,200);
        this.setVisible(true);


        this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

        //txt = new TextArea();
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
        addWindowListener((WindowListener)new WindowAdapter(){
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
