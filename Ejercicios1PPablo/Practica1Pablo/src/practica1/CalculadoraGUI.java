package practica1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Che
 */
public class CalculadoraGUI extends javax.swing.JFrame {
   
    public int primerNumero;
    public int segundoNumero;
    public String operador;
    double base;
   double elevado;
    
    public CalculadoraGUI() {
        initComponents();
        setLayout(new BorderLayout());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEntrada = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_suma = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_resta = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        boton_multiplicacion = new javax.swing.JButton();
        boton_cero = new javax.swing.JButton();
        boton_potencia = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Simple");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        panelEntrada.setBackground(new java.awt.Color(255, 255, 255));
        panelEntrada.setPreferredSize(new java.awt.Dimension(500, 70));
        panelEntrada.setLayout(new java.awt.CardLayout());

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        display.setForeground(new java.awt.Color(204, 204, 204));
        display.setText("1234567890");
        display.setToolTipText("");
        display.setCaretColor(new java.awt.Color(255, 255, 255));
        display.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        panelEntrada.add(display, "card2");

        getContentPane().add(panelEntrada, java.awt.BorderLayout.NORTH);

        panelBotones.setAlignmentX(100.0F);
        panelBotones.setAlignmentY(100.0F);
        panelBotones.setAutoscrolls(true);
        panelBotones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBotones.setEnabled(false);
        panelBotones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelBotones.setMaximumSize(new java.awt.Dimension(200, 300));
        panelBotones.setMinimumSize(new java.awt.Dimension(200, 300));
        panelBotones.setPreferredSize(new java.awt.Dimension(100, 300));
        panelBotones.setLayout(new java.awt.GridLayout(5, 4));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("C1");
        panelBotones.add(label1);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("C2");
        panelBotones.add(label2);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("C3");
        panelBotones.add(label3);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setText("Op");
        panelBotones.add(label4);

        boton_1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_1.setText("1");
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_1);

        boton_2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_2.setText("2");
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_2);

        boton_3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_3.setText("3");
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_3);

        boton_suma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_suma.setText("+");
        boton_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sumaActionPerformed(evt);
            }
        });
        panelBotones.add(boton_suma);

        boton_4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_4.setText("4");
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_4);

        boton_5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_5.setText("5");
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_5);

        boton_6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_6.setText("6");
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_6);

        boton_resta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_resta.setText("-");
        boton_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_restaActionPerformed(evt);
            }
        });
        panelBotones.add(boton_resta);

        boton_7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_7.setText("7");
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_7);

        boton_8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_8.setText("8");
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_8);

        boton_9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_9.setText("9");
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        panelBotones.add(boton_9);

        boton_division.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_division.setText("/");
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });
        panelBotones.add(boton_division);

        boton_multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_multiplicacion.setText("*");
        boton_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_multiplicacionActionPerformed(evt);
            }
        });
        panelBotones.add(boton_multiplicacion);

        boton_cero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_cero.setText("0");
        boton_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ceroActionPerformed(evt);
            }
        });
        panelBotones.add(boton_cero);

        boton_potencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_potencia.setText("^");
        boton_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_potenciaActionPerformed(evt);
            }
        });
        panelBotones.add(boton_potencia);

        boton_igual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_igual.setText("=");
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });
        panelBotones.add(boton_igual);

        getContentPane().add(panelBotones, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        
    }//GEN-LAST:event_displayActionPerformed
    

    private void boton_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ceroActionPerformed
        
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"0");
            }
        }          
    }//GEN-LAST:event_boton_ceroActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
           if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
               display.setForeground(Color.BLACK);
                display.setText(display.getText()+"1");
            }
        }  
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"2");
            }
        }  
    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"3");
            }
        }  
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"4");
            }
        }  
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"5");
            }
        }  
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"6");
            }
        }  
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"7");
            }
        }  
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"8");
            }
        }  
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        if(display.getText().equals("1234567890")){
            display.setText("");
        }
        else{
            if(display.getText().length() >= 20 ){
                
                JOptionPane.showMessageDialog(null, "Desbordamiento de memoria");
                display.setText("");
                
            }
            else{
                display.setForeground(Color.BLACK);
                display.setText(display.getText()+"8");
            };
        }  
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sumaActionPerformed
        this.primerNumero = Integer.parseInt(this.display.getText());
        this.operador = "+";
        this.display.setText("");
    }//GEN-LAST:event_boton_sumaActionPerformed

    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        
        this.segundoNumero = Integer.parseInt(this.display.getText());
        
        switch(operador){
            
            case "+":

                this.display.setText(Integer.toString(primerNumero+segundoNumero));
                    
            break;
            
            case "-":
                
               this.display.setText(Integer.toString(primerNumero-segundoNumero));
            break;
            
             case "/":
               
                 if(segundoNumero==0){
                     display.setText("No se puede dividir entre 0");
                 }
                 else{
                     this.display.setText(Integer.toString(primerNumero/segundoNumero));
                 }    
            break;
            case "*":
                
               this.display.setText(Integer.toString(primerNumero*segundoNumero));
            break;
            case "^":
                base = primerNumero;
                elevado = segundoNumero;
               this.display.setText(Double.toString(Math.pow(base,elevado)));
            break;
            
        }
        
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_restaActionPerformed
        this.primerNumero = Integer.parseInt(this.display.getText());
        this.operador = "-";
        this.display.setText("");
    }//GEN-LAST:event_boton_restaActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
        this.primerNumero = Integer.parseInt(this.display.getText());
        this.operador = "/";
        this.display.setText("");
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void boton_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multiplicacionActionPerformed
        this.primerNumero = Integer.parseInt(this.display.getText());
        this.operador = "*";
        this.display.setText("");
    }//GEN-LAST:event_boton_multiplicacionActionPerformed

    private void boton_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_potenciaActionPerformed
        this.primerNumero = Integer.parseInt(this.display.getText());
        this.operador = "^";
        this.display.setText("");
    }//GEN-LAST:event_boton_potenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CalculadoraGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_cero;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_multiplicacion;
    private javax.swing.JButton boton_potencia;
    private javax.swing.JButton boton_resta;
    private javax.swing.JButton boton_suma;
    private javax.swing.JTextField display;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelEntrada;
    // End of variables declaration//GEN-END:variables
}
