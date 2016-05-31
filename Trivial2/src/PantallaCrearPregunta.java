
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class PantallaCrearPregunta extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCrearPregunta
     */
    
    static Vector v = BaseDatos.CrearTablaTipo();   
    String preguntaCreadaUsuario, respuestaCreadaUsuario;
    String preguntaPantalla=null;
    String txt_pregunta,respuesta_correcta,respuestaCorrecta,respuestaUsuario;
    int tipoPregunta,tipoPregunta2,numPreguntas;
    static int numContador=0;
    Vector a=new Vector();
    static int n=0;
    
    public PantallaCrearPregunta() {
        initComponents();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        comboTipo = new javax.swing.JComboBox();
        txtEnunciado = new javax.swing.JTextField();
        lblEnunciado = new javax.swing.JLabel();
        lblRespuestaCrear = new javax.swing.JLabel();
        txtRespuestaCrear = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnJson = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboTipo2 = new javax.swing.JComboBox();
        lblRespuestaJugar = new javax.swing.JLabel();
        txtRespuestaUsuario = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPreguntaJugar = new javax.swing.JTextArea();
        btnJugar = new javax.swing.JButton();
        lblPuntuacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEnunciado.setText("Enunciado:");

        lblRespuestaCrear.setText("Respuesta:");

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnJson.setText("A�ADIR JSON");
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnCrear)
                        .addGap(65, 65, 65)
                        .addComponent(btnJson))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnunciado)
                            .addComponent(lblRespuestaCrear))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEnunciado)
                                .addComponent(txtRespuestaCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnunciado))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuestaCrear)
                    .addComponent(txtRespuestaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnJson))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Crear Pregunta", jPanel1);

        lblRespuestaJugar.setText("Respuesta:");

        txtRespuestaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaUsuarioActionPerformed(evt);
            }
        });

        btnComprobar.setText("COMPROBAR");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        txtPreguntaJugar.setColumns(10);
        txtPreguntaJugar.setLineWrap(true);
        txtPreguntaJugar.setRows(5);
        jScrollPane1.setViewportView(txtPreguntaJugar);

        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblRespuestaJugar)
                        .addGap(33, 33, 33)
                        .addComponent(txtRespuestaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnComprobar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(comboTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnJugar)
                        .addGap(59, 59, 59)
                        .addComponent(lblPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugar)
                    .addComponent(lblPuntuacion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuestaJugar)
                    .addComponent(txtRespuestaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnComprobar)
                .addGap(21, 21, 21))
        );

        jTabbedPane4.addTab("Responder Preguntas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespuestaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaUsuarioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
       cargarDatosPreguntaUsuario();
        BaseDatos.crearPregunta(preguntaCreadaUsuario, respuestaCreadaUsuario, tipoPregunta);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        // TODO add your handling code here:
        comprobarRespuesta();
        n++;
        mostrarPregunta();
        cargarMarcador();
    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        tipoPregunta2=comboTipo2.getSelectedIndex()+1;
         a = BaseDatos.obtenerPreguntasPorTipo(tipoPregunta2);
        mostrarPregunta();
        cargarMarcador();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJsonActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaCrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCrearPregunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnJson;
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JComboBox comboTipo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JLabel lblRespuestaCrear;
    private javax.swing.JLabel lblRespuestaJugar;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextArea txtPreguntaJugar;
    private javax.swing.JTextField txtRespuestaCrear;
    private javax.swing.JTextField txtRespuestaUsuario;
    // End of variables declaration//GEN-END:variables
public void cargarCombo(){
    
    for(int i =0; i<v.size(); i++){
        comboTipo.addItem(v.elementAt(i));
        comboTipo2.addItem(v.elementAt(i));
    }
}
public void cargarDatosPreguntaUsuario(){
    preguntaCreadaUsuario=txtEnunciado.getText();
    respuestaCreadaUsuario=txtRespuestaCrear.getText();
    tipoPregunta=comboTipo.getSelectedIndex()+1;
}
public void mostrarPregunta(){
    
    //Pregunta p=(Pregunta)a.elementAt(n);
    preguntaPantalla=((Pregunta)a.elementAt(n)).getTexto_pregunta();
    respuestaCorrecta=((Pregunta)a.elementAt(n)).getTexto_respuesta();
    txtPreguntaJugar.setText(preguntaPantalla);
}
public void comprobarRespuesta(){
    respuestaUsuario = txtRespuestaUsuario.getText().toUpperCase();
    if(respuestaUsuario.equals(respuestaCorrecta)){
        numContador++;
        JOptionPane.showMessageDialog(null, "", "CORRECTO", JOptionPane.PLAIN_MESSAGE);
    }
    else{
        JOptionPane.showMessageDialog(null, "", "ERROR", JOptionPane.PLAIN_MESSAGE);
    }
    
    txtRespuestaUsuario.setText("");
    if(n==a.size()-1){
        JOptionPane.showMessageDialog(null, numContador+"/"+numPreguntas, "TU PUNTUACION", JOptionPane.PLAIN_MESSAGE);
        System.exit(1);
    }
}
public void cargarMarcador(){
    numPreguntas = a.size();
    lblPuntuacion.setText(numContador+"/"+numPreguntas);
}
}
