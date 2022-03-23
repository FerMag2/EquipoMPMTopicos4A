package Ejercicio3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 extends Frame implements ActionListener
{
    Button aceptar;
    TextField texto;
    Panel central;
    TextArea txt;
    Button calcular;
    
    public Ejercicio3(){

        //Instanciar los widgets
        aceptar = new Button("Aceptar");
        calcular = new Button("Calcular");
        txt = new TextArea("");

        //Agregar aceptar la accion action listener, con la clase para ver lo que dice el textfield
        aceptar.addActionListener(this);
        calcular.addActionListener(this);
        
        //Crear un nuevo textField
        texto = new TextField("Ingresa los numeros a sumar");
        
        //Crear un nuevo Panel
        central = new Panel();

        //Agregar borderLaypout al panel
        central.setLayout(new BorderLayout());
        
        //Agregar los elementos al panel con posicion
        central.add(aceptar,BorderLayout.CENTER);
        central.add(texto, BorderLayout.WEST);
        central.add(calcular, BorderLayout.EAST);

        //Al frame agregarle un borderLayout
        this.setLayout(new BorderLayout());
        
        //Agregar el panel al frame
        this.add(central, BorderLayout.NORTH);
        this.add(txt, BorderLayout.CENTER);
        
        //Ponerle dimension al frame
        this.setSize(400,400);
        
        //Hacer visible al frame
        setVisible(true);
    }
    
    public static void main(String[] args) {

        Ejercicio3 ej1 = new Ejercicio3();
        
    }

    int suma = 0;

    @Override
    public void actionPerformed(ActionEvent e){

        //Obtenemos la accion e para ver que boton estamos pulsando
        if(e.getSource() == aceptar){

            String entrada = texto.getText();
            suma = suma + Integer.parseInt(entrada);
            txt.append(entrada + "\n");

        } else if (e.getSource() == calcular){

            txt.append(String.valueOf(suma) +"\n");
        }        
    }
}
