package Practica1Martin;

import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame implements ActionListener{
    int c,n;
    String s1,s2,s3,s4,s5;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsub, btnmul, btndiv, btneq, btnclr;
    Panel p;
    TextField t1;

    Font fuente = new Font("Arial", 3, 19);

    public Calculadora(){
    	
    	this.setTitle("Calculadora Simple");
        this.setLayout(new BorderLayout());
        p = new Panel();
        btn0 = new Button("0");
        btn0.setFont(fuente);
        btn0.addActionListener(this);

        btn1 = new Button("1");
        btn1.setFont(fuente);
        btn1.setBackground(Color.white);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setFont(fuente);
        btn2.setBackground(Color.white);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setFont(fuente);
        btn3.setBackground(Color.white);
        btn3.addActionListener(this);

        btn4 = new Button("4");
        btn4.setFont(fuente);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setFont(fuente);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setFont(fuente);
        btn6.addActionListener(this);

        btn7 = new Button("7");
        btn7.setFont(fuente);
        btn7.setBackground(Color.white);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setFont(fuente);
        btn8.setBackground(Color.white);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setFont(fuente);
        btn9.setBackground(Color.white);
        btn9.addActionListener(this);

        btnadd = new Button("+");
        btnadd.setFont(fuente);
        btnadd.setBackground(Color.white);
        btnadd.addActionListener(this);

        btnsub = new Button("-");
        btnsub.setFont(fuente);
        btnsub.addActionListener(this);

        btnmul = new Button("*");
        btnmul.setFont(fuente);
        btnmul.addActionListener(this);

        btndiv = new Button("/");
        btndiv.setFont(fuente);
        btndiv.setBackground(Color.white);
        btndiv.addActionListener(this);

        btneq = new Button("=");
        btneq.setFont(fuente);
        btneq.addActionListener(this);

        btnclr = new Button("BORRAR");
        btnclr.setFont(fuente);
        btnclr.addActionListener(this);

        t1 = new TextField(20);
        this.add(t1,BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,4));

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btnadd);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btnsub);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btndiv);
        p.add(btnmul);
        p.add(btn0);
        p.add(btnclr);
        p.add(btneq);

        this.add(p,BorderLayout.CENTER);
        this.setBounds(400, 300, 450, 500);

        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.addWindowListener(new WindowAdapter() {
        
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
        });
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn0){
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        
        if(e.getSource()==btn1){
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn2){
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn3){
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn4){
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn5){
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==btn6){
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn7){
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn8){
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btn9){
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if(e.getSource()==btnadd){
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }

        if(e.getSource()==btnsub){
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }

        if(e.getSource()==btnmul){
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }

        if(e.getSource()==btndiv){
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }

        if(e.getSource()==btneq){
            s2 = t1.getText();
            if(c==1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==3){
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==4){
            	if(Integer.parseInt(s2)==0) {
            		t1.setText("ERROR. No se puede dividir entre 0.");
            	}else {
            		n = Integer.parseInt(s1) / Integer.parseInt(s2);
                    t1.setText(String.valueOf(n));
            	}
                
            }

        }
        if(e.getSource()==btnclr){
            t1.setText("");
        }

    }

}