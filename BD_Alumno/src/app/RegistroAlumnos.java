
package app;
import java.sql.*;


public class RegistroAlumnos extends javax.swing.JFrame {

    public RegistroAlumnos() {
        initComponents();    
        //para centrar a interfaz cada vez que se ejecuta o programa
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enombre = new javax.swing.JLabel();
        Tnombre = new javax.swing.JTextField();
        Egrupo = new javax.swing.JLabel();
        Tgrupo = new javax.swing.JTextField();
        Binsertar = new javax.swing.JButton();
        Beditar = new javax.swing.JButton();
        Bborrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Tbuscar = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Eestado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Enombre.setText("Nombre:");

        Egrupo.setText("Grupo:");

        Binsertar.setText("Insertar");
        Binsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinsertarActionPerformed(evt);
            }
        });

        Beditar.setText("Editar");
        Beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditarActionPerformed(evt);
            }
        });

        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el código del alumno(ID): ");

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Eestado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Enombre)
                        .addComponent(Tnombre)
                        .addComponent(Egrupo)
                        .addComponent(Tgrupo)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Binsertar)
                            .addGap(18, 18, 18)
                            .addComponent(Beditar)
                            .addGap(18, 18, 18)
                            .addComponent(Bborrar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tbuscar)))
                    .addComponent(Bbuscar)
                    .addComponent(Eestado))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Egrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Binsertar)
                    .addComponent(Beditar)
                    .addComponent(Bborrar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Eestado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinsertarActionPerformed
        
        try{
            //para establecer a conexion ca base de datos de servidor local
           
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_alumnos", "root", "");
            
            //neste caso insertamos os  valores con interrogacion  porque non sabemos que vai insertar o usuario
            PreparedStatement pre = cn.prepareStatement("insert into alumnos values(?,?,?)");
            
            // o primeiro parametro da tabla o ID, desde 0 e vai incrementando
            pre.setString(1, "0");
            //para o segundo parametro da tabla, o metodo trim quita espacios do principio e do final
            pre.setString(2, Tnombre.getText().trim());
            //para o terceiro parametro da tabla, tamen co metodo trim
            pre.setString(3, Tgrupo.getText().trim());
            
           // para executar as liñas para a BD 
            pre.executeUpdate();
            
            Tnombre.setText("");
            Tgrupo.setText("");
            Eestado.setText("Registro completado");
        }catch (Exception e){
             Eestado.setText("Error");
        }
        
    }//GEN-LAST:event_BinsertarActionPerformed
                                          
    
    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_alumnos", "root", "");
            
            //facemos un select de toda a tabla alumnos donde o ID e o que estamos buscando
            PreparedStatement pre = cn.prepareStatement("select * from alumnos where ID = ?");
            
            //para mandarlle no parametro 1 que e o ID do alumno
            pre.setString(1, Tbuscar.getText().trim());
            
            //usamos a clase ResultSet para obter o resultado da BD e si se atoparon ou no
            ResultSet re = pre.executeQuery();
            
            
            if(re.next()){
                //para que che poña os valores no textfield
                Tnombre.setText(re.getString("NombreAlumno"));
                Tgrupo.setText(re.getString("Grupo"));
                Eestado.setText("Alumno encontrado");
            } else {
                
                Eestado.setText("Alumno non encontrado");
            }
            
        }catch (Exception e){
             Eestado.setText("Error");
        }
        
        
    }//GEN-LAST:event_BbuscarActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
         try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_alumnos", "root", "");
            //borrar co ID que diga o usuario na tabla
            PreparedStatement pre = cn.prepareStatement("delete from alumnos where ID = ?");
            
            pre.setString(1, Tbuscar.getText().trim());
            pre.executeUpdate();
            
            //para eliminar o que puxo o usuario e que remplace todo por un espacio en blanco e se elimine
            Tnombre.setText("");
            Tgrupo.setText("");
            Tbuscar.setText("");
            
            Eestado.setText("Alumno eliminado.");
            
        } catch (Exception e) {
             Eestado.setText("Error");
        }
    }//GEN-LAST:event_BborrarActionPerformed

    private void BeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditarActionPerformed
        try {
            //variable temporal onde gardar o ID para editalo despois
            String ID = Tbuscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_alumnos", "root", "");
            //update para editar na tabla co ID concatenado fora ao ser a variable temporal 
            PreparedStatement pre = cn.prepareStatement("update alumnos set NombreAlumno = ?, Grupo = ? where ID = " + ID);
            
            //parecido ao de registrar, solo que o recibes o que pon o usuario
            pre.setString(1, Tnombre.getText().trim());
            pre.setString(2, Tgrupo.getText().trim());
            pre.executeUpdate();
            
            Eestado.setText("Alumno editado");
            
        } catch (Exception e) {
             Eestado.setText("Error");
        }
    }//GEN-LAST:event_BeditarActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Beditar;
    private javax.swing.JButton Binsertar;
    private javax.swing.JLabel Eestado;
    private javax.swing.JLabel Egrupo;
    private javax.swing.JLabel Enombre;
    private javax.swing.JTextField Tbuscar;
    private javax.swing.JTextField Tgrupo;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
