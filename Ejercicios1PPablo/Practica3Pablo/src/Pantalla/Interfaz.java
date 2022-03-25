package Pantalla;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Ip.IpDireccion;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import Tiempo.Tiempo;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextArea;
import Documento.Principal;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import Directorio.Directorios;
import java.util.Arrays;

/**
 *
 * @author Pablo Che
 */

public class Interfaz extends JFrame{
    
    //Url de la pagina
    String url1 = "itescam.edu.mx";
    String url = "https://www.itescam.edu.mx";
    
    private JTextArea display = null;
      
    //Paquetes
    IpDireccion dirIp;
    Tiempo tim;
    Principal prin;
    Directorios dir;

    //Botones
    JButton btnDirectorios;
    JButton btnDocPrincipal;
    JButton btnTiempo;
    JButton btnIP;
   
    
    public Interfaz(){
        
        try {
            initComponets();
        } catch (Exception e) {
        }
        
    }
    public void initComponets() {
    
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnIP = new JButton("IP");
        btnIP.setFocusable(false);
        btnIP.addActionListener(e -> btnIPActionPerformed(e));

        
        btnDocPrincipal = new JButton("Documento Principal");
        btnDocPrincipal.setFocusable(false);
        btnDocPrincipal.addActionListener(e -> btnDocPrincipalActionPerformed(e));

        btnDirectorios = new JButton("Directorios");
        btnDirectorios.setFocusable(false);
        btnDirectorios.addActionListener(e -> btnDirectoriosActionPerformed(e));
        
        
        btnTiempo = new JButton("Tiempo de carga de la pagina");
        btnTiempo.setFocusable(false);
        btnTiempo.addActionListener(e -> btnTiempoActionPerformed(e));

        
        display = new JTextArea();
        display.setMargin(new Insets(30, 30, 30, 30));
        display.setBackground(Color.BLACK);
        display.setForeground(Color.white);
        
        display.setFocusable(false);
        display.setRequestFocusEnabled(false);
        JScrollPane scroll = new JScrollPane(display);

        
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1,4));
        botones.add(btnIP);
        botones.add(btnDocPrincipal);
        botones.add(btnDirectorios);
        botones.add(btnTiempo);

        this.add(scroll,BorderLayout.CENTER);
        this.add(botones, BorderLayout.SOUTH);

        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void btnIPActionPerformed(ActionEvent e) {
        
        display.setText("");
        dirIp = new IpDireccion();
        display.setFont(new Font("Consolas", 0, 30));
        display.setText("Direccion IP: " + dirIp.direccion(url1));
    }

    private void btnDocPrincipalActionPerformed(ActionEvent e) {
    
        
        display.setText("");
        prin = new Principal();
        display.setFont(new Font("Consolas", 0, 12));
        display.setText("Documento principal: \n"
                + prin.ObtenerDocument(url));
    }

    private void btnTiempoActionPerformed(ActionEvent e) {

        display.setText("");
        tim = new Tiempo();
        display.setFont(new Font("Consolas", 0, 30));
        display.setText("Tiempo de carga de la página: "+tim.carga(url) + " segundos");
      
    }

    private void btnDirectoriosActionPerformed(ActionEvent e) {

        display.setText("");
        dir = new Directorios();
        display.setFont(new Font("Consolas", 0, 12));
        display.setText("Directorios: \n"
                + Arrays.toString(dir.directoriosPagina(url)));
    }
}
