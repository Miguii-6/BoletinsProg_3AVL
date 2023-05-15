
package boletin31;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
    
    private JPanel panel;
    private JTextField textField;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual, botonPunto, botonBorrar;
    private double num1 = 0, num2 = 0, resultado = 0;
    private int operacion = 0;
    
    public Calculadora() {
        
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        
        boton1 = new JButton("1");
        boton1.addActionListener(this);
        
        boton2 = new JButton("2");
        boton2.addActionListener(this);
        
        boton3 = new JButton("3");
        boton3.addActionListener(this);
        
        boton4 = new JButton("4");
        boton4.addActionListener(this);
        
        boton5 = new JButton("5");
        boton5.addActionListener(this);
        
        boton6 = new JButton("6");
        boton6.addActionListener(this);
        
        boton7 = new JButton("7");
        boton7.addActionListener(this);
        
        boton8 = new JButton("8");
        boton8.addActionListener(this);
        
        boton9 = new JButton("9");
        boton9.addActionListener(this);
        
        boton0 = new JButton("0");
        boton0.addActionListener(this);
        
        botonSuma = new JButton("+");
        botonSuma.addActionListener(this);
        
        botonResta = new JButton("-");
        botonResta.addActionListener(this);
        
        botonMultiplicacion = new JButton("*");
        botonMultiplicacion.addActionListener(this);
        
        botonDivision = new JButton("/");
        botonDivision.addActionListener(this);
        
        botonIgual = new JButton("=");
        botonIgual.addActionListener(this);
        
        botonPunto = new JButton(".");
        botonPunto.addActionListener(this);
        
        botonBorrar = new JButton("C");
        botonBorrar.addActionListener(this);
        
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        panel.add(botonDivision);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(botonMultiplicacion);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(botonResta);
        panel.add(boton0);
        panel.add(botonPunto);
        panel.add(botonIgual);
        panel.add(botonSuma);
        panel.add(botonBorrar);
        
        this.add(textField, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == boton1) {
            textField.setText(textField.getText() + "1");
        }
        
        if(e.getSource() == boton2) {
            textField.setText(textField.getText() + "2");
        }
        
        if(e.getSource() == boton3) {
            textField.setText(textField.getText() + "3");
        }
        if(e.getSource() == boton4) {
      textField.setText(textField.getText() + "4");
  }
        
         if(e.getSource() == boton5) {
      textField.setText(textField.getText() + "5");
  }
  
  if(e.getSource() == boton6) {
      textField.setText(textField.getText() + "6");
  }
  
  if(e.getSource() == boton7) {
      textField.setText(textField.getText() + "7");
  }
  
  if(e.getSource() == boton8) {
      textField.setText(textField.getText() + "8");
  }
  
  if(e.getSource() == boton9) {
      textField.setText(textField.getText() + "9");
  }
  
  if(e.getSource() == boton0) {
      textField.setText(textField.getText() + "0");
  }
  
  if(e.getSource() == botonPunto) {
      textField.setText(textField.getText() + ".");
  }
  
  if(e.getSource() == botonSuma) {
      num1 = Double.parseDouble(textField.getText());
      operacion = 1;
      textField.setText("");
  }
  
  if(e.getSource() == botonResta) {
      num1 = Double.parseDouble(textField.getText());
      operacion = 2;
      textField.setText("");
  }
  
  if(e.getSource() == botonMultiplicacion) {
      num1 = Double.parseDouble(textField.getText());
      operacion = 3;
      textField.setText("");
  }
  
  if(e.getSource() == botonDivision) {
      num1 = Double.parseDouble(textField.getText());
      operacion = 4;
      textField.setText("");
  }
  
  if(e.getSource() == botonIgual) {
      num2 = Double.parseDouble(textField.getText());
      
      switch(operacion) {
          case 1:
              resultado = num1 + num2;
              break;
          case 2:
              resultado = num1 - num2;
              break;
          case 3:
              resultado = num1 * num2;
              break;
          case 4:
              resultado = num1 / num2;
              break;
      }
      
      textField.setText("" + resultado);
  }
  
  if(e.getSource() == botonBorrar) {
      textField.setText("");
  }
}
}

