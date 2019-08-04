/*
 * Ventana principal
 */
package olcpractica1;

import analizadores.parser;
import analizadores.scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("OLC Práctica No. 1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cargarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cargarArchivo.setText("jButton1");
        btn_cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cargarArchivo)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cargarArchivo)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarArchivoActionPerformed
        try {
            //Aquí va el texto de prueba
            String texto = abrirArchivo();

            scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
            parser parser = new parser(scan);
            parser.parse();
            if (parser.enr == 0) {//quiere decir que no tuvo errores no recuperables o sea que si puede hacer el reporte
                if (parser.er != 0) {
                    JOptionPane.showMessageDialog(null, "Se han detectado errores, los mismos se han omitido.");
                }else{
                    JOptionPane.showMessageDialog(null, "Se completó el análisis");
                    for(int i = 0; i < parser.action_obj.listaClaves.size(); i++){
                        System.out.println("Clave: " + parser.action_obj.listaClaves.get(i).nombre);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Se han detectado errores, no se ha podido recuperar.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cargarArchivoActionPerformed

    public String abrirArchivo() {
        String aux = "";
        String texto = "";
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            File abre = file.getSelectedFile();
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;
    }
    
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarArchivo;
    // End of variables declaration//GEN-END:variables
}
