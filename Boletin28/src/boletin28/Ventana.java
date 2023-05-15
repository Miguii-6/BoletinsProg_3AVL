
package boletin28;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana {
    
    JFrame marco;
    JPanel panel;
    JLabel eNome, ePassword;
    JTextField ltNome, ltPassword;
    JTextArea aTexto;
    JButton bPremer, bLimpar; 
    
    public void iniciarVentana(){
        
        marco = new JFrame ();
        panel = new JPanel();
        eNome = new JLabel("NOME");
        ePassword = new JLabel("PASSWORD");
        ltNome = new JTextField ();
        ltPassword = new JTextField ();
        aTexto = new JTextArea("Area de Texto .");
        bPremer = new JButton ("PREMER");
        bLimpar = new JButton("LIMPIAR");
        
        marco.setBounds(0, 0, 500, 500);
        panel.setBounds(5, 5, 450, 450);
        
        eNome.setBounds(25, 25, 100, 50);
        ePassword.setBounds(25, 75, 100, 50);
        ltNome.setBounds(200, 15, 200, 50);
        ltPassword.setBounds(200, 85, 200, 50);
        aTexto.setBounds(50, 150, 350, 100);
        bPremer.setBounds(75, 300, 150, 50);
        bLimpar.setBounds(250, 300, 150, 50);
        
        
        panel.setLayout(null);
        
        panel.add(eNome);
        panel.add(ePassword);
        panel.add(ltNome);
        panel.add(ltPassword);
        panel.add(aTexto);
        panel.add(bPremer);
        panel.add(bLimpar);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
}
