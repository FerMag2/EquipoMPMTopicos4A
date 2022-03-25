package Ejercicio3;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Ventana3 extends Frame implements ActionListener{
    Button aceptar; //btn_aceptar
    TextField text; //txt_text
    Panel central; //pnl_central
    TextArea txt; // txt_resultado
    Button igual; //btn_=

    public Ventana3 (){
        CerrarVentana();
        aceptar = new Button ("Aceptar");
        igual = new Button ("=");
        aceptar.addActionListener(this);
        igual.addActionListener(this);
        text = new TextField();
        central = new Panel();
        central.setLayout(new BorderLayout());
        central.add(aceptar, BorderLayout.EAST);
        central.add(text, BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(central, BorderLayout.CENTER);
        this.setSize(800, 600);
        this.setVisible(true);

        txt = new TextArea ("Resultado" + '\n');
        central.add(txt, BorderLayout.SOUTH);
        central.add(igual, BorderLayout.NORTH);
    }

    //Metodo para la sumatoria
    int sumt=0;
    public void Sumatoria(int num){
       sumt+=num;
    }
    public int devolver(){
        return sumt;
    }

    //Metodo para cerra el Frame con la X
    public void CerrarVentana(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
        
        System.exit(0);
        }
        });
        }

    
    //Main
    public static void main (String args []){
        Ventana3 V = new Ventana3();
    }

    //Detecta todos los eventos
    public void actionPerformed(ActionEvent e){

        //Para diferenciar que boton se presiona
        if(e.getSource()==aceptar){

            //La siguiente linea es para llamar la variable
            String c = text.getText();
            text.setText("");
            int numEntero = Integer.parseInt(c);
            Sumatoria(numEntero);
            txt.append(c +'\n');

        }else if(e.getSource()==igual){
            txt.append("La suma es " + devolver());
        }
    }
}