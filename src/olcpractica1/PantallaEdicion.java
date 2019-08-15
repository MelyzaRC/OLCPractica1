/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olcpractica1;

import almacenamiento.Errores;
import almacenamiento.Variable;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Melyza
 */
public class PantallaEdicion extends javax.swing.JFrame {

    JTextArea txtArea;
    JScrollPane scroll;
    File archivo;
    JFileChooser fileChooser = new JFileChooser();
    FileWriter fileWriter;
    String aux, aux2;
    BufferedImage imagenIc = null;

    /**
     * Creates new form PantallaEdicion
     */
    public PantallaEdicion() {
        initComponents();
        try {
            imagenIc = ImageIO.read(new File("resources/iconoapp.png"));
        } catch (IOException ex) {

        }
        setIconImage(imagenIc);
        //centrar la pantalla

        this.setLocationRelativeTo(null);
        //titulo

        this.setTitle("Edición de Archivos (Cualquier Formato)");

        ponerIconos("nueva", jButton2);
        ponerIconos("abrir", jButton3);
        ponerIconos("limpiar", jButton4);
        ponerIconos("gcomo", jButton5);
        ponerIconos("guardar", jButton6);
        ponerIconos("salir", jButton7);

        jButton2.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton2.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton2.setBackground((customColor));
            }
        });
        jButton3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton3.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton3.setBackground((customColor));
            }
        });
        jButton4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton4.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton4.setBackground((customColor));
            }
        });
        jButton5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton5.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton5.setBackground((customColor));
            }
        });
        jButton6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton6.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton6.setBackground((customColor));
            }
        });
        jButton7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton7.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton7.setBackground((customColor));
            }
        });

        //crear una pestaña por defecto
        crearPestana();

        //evitar que la pantalla se cierre en la x 
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setToolTipText("Nueva Pestaña");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setToolTipText("Abrir");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setToolTipText("Limpiar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setToolTipText("Guardar como");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setToolTipText("Guardar");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("0");
        jLabel5.setToolTipText("Columna");

        jLabel4.setText("Columna: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("0");
        jLabel3.setToolTipText("Línea");

        jLabel2.setText("Línea:");

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setToolTipText("Salir");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 470, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearPestana();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            aux = "";
            aux2 = "";
            //FileNameExtensionFilter filtroRep = new FileNameExtensionFilter("Archivo de reportes OLC1", "rep");
            //fileChooser.setFileFilter(filtroRep);
            fileChooser.showOpenDialog(this);
            archivo = fileChooser.getSelectedFile();
            if (archivo != null) {
                FileReader reader = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(reader);
                aux = buffer.readLine();
                while (aux != null) {
                    aux2 += aux + "\n";
                    aux = buffer.readLine();
                }
                scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
                txtArea = (JTextArea) scroll.getViewport().getComponent(0);
                txtArea.setText(aux2);

                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), archivo.getName());//Solo jalo el nombre del archivo
                jTabbedPane1.getSelectedComponent().setName(archivo.getPath());//Guardo toda la ruta donde está el archivo
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Existió un error al cargar el archivo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
        txtArea = (JTextArea) scroll.getViewport().getComponent(0);
        txtArea.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            fileChooser.showOpenDialog(this);
            archivo = fileChooser.getSelectedFile();
            if (archivo != null) {
                fileWriter = new FileWriter(archivo + ".rep");
                scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
                txtArea = (JTextArea) scroll.getViewport().getComponent(0);
                fileWriter.write(txtArea.getText());
                fileWriter.close();
                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), archivo.getName());//Solo jalo el nombre del archivo
                jTabbedPane1.getSelectedComponent().setName(archivo.getPath());
                mensaje("Archivo guardado exitosamente");
            }

        } catch (IOException e) {
            mensaje("No se ha podido guardar el archivo");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            if (jTabbedPane1.getSelectedComponent().getName() == null) {
                mensaje("Utilice el botón \"GUARDAR COMO\"");
            } else {
                archivo = new File(jTabbedPane1.getSelectedComponent().getName());
                if (archivo != null) {
                    fileWriter = new FileWriter(archivo);
                    scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
                    txtArea = (JTextArea) scroll.getViewport().getComponent(0);
                    fileWriter.write(txtArea.getText());
                    fileWriter.close();
                    jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), archivo.getName());//Solo jalo el nombre del archivo
                    jTabbedPane1.getSelectedComponent().setName(archivo.getPath());
                    mensaje("Archivo guardado exitosamente");
                }
            }
        } catch (IOException e) {
            mensaje("No se ha podido guardar el archivo");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        close();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void close() {
        ImageIcon imageIcon = new ImageIcon("resources/" + "salir" + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea salir?",
                "Salir de la aplicación", JOptionPane.YES_NO_OPTION, 0, imageIcon) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    public void crearPestana() {
        txtArea = new JTextArea();
        txtArea.setColumns(20);
        txtArea.setFont(new Font("Ubuntu", 0, 12));
        txtArea.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                JTextArea editArea = (JTextArea) e.getSource();
                int linea = 1;
                int columna = 1;

                try {
                    int caretpos = editArea.getCaretPosition();
                    linea = editArea.getLineOfOffset(caretpos);
                    columna = caretpos - editArea.getLineStartOffset(linea);
                    linea += 1;//Ya que la línea las cuenta desde 0
                } catch (Exception ex) {
                }
                jLabel3.setText(String.valueOf(linea));
                jLabel5.setText(String.valueOf(columna));
            }
        });
        scroll = new JScrollPane(txtArea);
        jTabbedPane1.addTab("Pestaña " + (jTabbedPane1.getComponentCount() + 1), scroll);
    }

    public String obtenerTexto(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String ret = "";
        File f = new File(ruta);

        if (f.exists()) {

            try {
                archivo = new File(ruta);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    ret = ret + linea + "\n";
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            mensaje("No existe el archivo");
        }
        return ret;
    }

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

    public void ponerIconos(String st, JButton boton) {
        ImageIcon imageIcon = new ImageIcon("resources/" + st + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        boton.setIcon(imageIcon);
    }

    public void mensaje(String cad) {
        ImageIcon imageIcon = new ImageIcon("resources/" + "notificacion" + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JOptionPane.showMessageDialog(null, cad, "Práctica 1 OLC", JOptionPane.DEFAULT_OPTION, imageIcon);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage("resources/app.png");
        return retValue;
    }

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
            java.util.logging.Logger.getLogger(PantallaEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaEdicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
