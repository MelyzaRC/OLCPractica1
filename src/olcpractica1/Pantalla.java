/*
 * Ventana principal
 */
package olcpractica1;

//import analizadores.parser;
//import analizadores.scanner;
import almacenamiento.Errores;
import almacenamiento.Variable;
import analizadoresRep.parserRep;
import analizadoresRep.scannerRep;
import java.awt.Color;
import java.awt.Desktop;
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
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;

//imports para freeChart
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Pantalla extends javax.swing.JFrame {

    JTextArea txtArea;
    JScrollPane scroll;
    File archivo;
    JFileChooser fileChooser = new JFileChooser();
    FileWriter fileWriter;
    String aux, aux2;
    public ArrayList<Errores> listaErrores = new ArrayList<Errores>();
    File directorio=new File("resultados"); 
    public ArrayList<Variable> entorno = new ArrayList<Variable>();
    

    public Pantalla() {
        initComponents();
        //centrar la pantalla
        this.setLocationRelativeTo(null);
        //titulo
        this.setTitle("OLC Práctica No. 1");

        //asignando imagenes a los botones
        ponerIconos("nueva", jButton2);
        ponerIconos("abrir", jButton3);
        ponerIconos("limpiar", jButton4);
        ponerIconos("gcomo", jButton5);
        ponerIconos("analizar", btn_cargarArchivo);
        ponerIconos("guardar", jButton6);
        ponerIconos("limpiar", jButton1);
        ponerIconos("errores", jButton8);
        ponerIconos("graficas", jButton9);
        ponerIconos("salir", jButton7);

        //creando la carpeta de salidas
        directorio.mkdir(); 
        //efecto de colorcito de los botones
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
        btn_cargarArchivo.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                btn_cargarArchivo.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                btn_cargarArchivo.setBackground((customColor));
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
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton1.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton1.setBackground((customColor));
            }
        });
        jButton8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton8.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton8.setBackground((customColor));
            }
        });
        jButton9.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent arg0) {
                Color customColor = new Color(204, 204, 204);
                jButton9.setBackground((customColor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color customColor = new Color(153, 153, 153);
                jButton9.setBackground((customColor));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_cargarArchivo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setToolTipText("Limpiar consola");
        jButton1.setActionCommand("Limpiar Consola");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setToolTipText("Editor");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Batang", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 0));
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Consola de Salida");
        jScrollPane1.setViewportView(jTextArea1);

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
        jButton3.setToolTipText("Abrir archivo .REP");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setToolTipText("Limpiar pestaña");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setToolTipText("Guardar como");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_cargarArchivo.setBackground(new java.awt.Color(153, 153, 153));
        btn_cargarArchivo.setToolTipText("Analizar");
        btn_cargarArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarArchivoActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setToolTipText("Guardar");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setToolTipText("Salir");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setToolTipText("Ver reporte de errores");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setToolTipText("Ver imágenes generadas");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setText("Línea:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("0");
        jLabel3.setToolTipText("Línea");

        jLabel4.setText("Columna: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("0");
        jLabel5.setToolTipText("Columna");

        jMenu2.setText("Aplicación");

        jMenuItem4.setText("Acerca de...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(btn_cargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //analizar
    private void btn_cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarArchivoActionPerformed
        scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
        txtArea = (JTextArea) scroll.getViewport().getComponent(0);
        try {
            //Aquí va el texto de prueba
            String texto = txtArea.getText();
            scannerRep scan = new scannerRep(new BufferedReader(new StringReader(texto)));
            scan.listaErrores = this.listaErrores;
            scan.archivoActual = jTabbedPane1.getSelectedComponent().getName();
            parserRep parser = new parserRep(scan);
            parser.archivoActual = jTabbedPane1.getSelectedComponent().getName();
            parser.listaErrores = this.listaErrores;
            parser.parse();
            if (parser.enr == 0) {//quiere decir que no tuvo errores no recuperables o sea que si puede hacer el reporte
                if (parser.er != 0) {
                    mensaje("Se han detectado errores r");
                } else {
                    mensaje("Análisis realizado");
                    jTextArea1.setText(parser.cadenaImprimir);
                }
            } else {
                mensaje("Se han detectado errores nr");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cargarArchivoActionPerformed

    //llamar pantalla edicion
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //limpiar consola
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    //nueva pestaña
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearPestana();
    }//GEN-LAST:event_jButton2ActionPerformed

    //abrir archivo
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            aux = "";
            aux2 = "";
            FileNameExtensionFilter filtroRep = new FileNameExtensionFilter("Archivo de reportes OLC1", "rep");
            fileChooser.setFileFilter(filtroRep);
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
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //guardar como
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            if (jTabbedPane1.getSelectedComponent().getName() != null) {
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
            }else{
                mensaje("Ha ocurrido un error");
            }
        } catch (IOException e) {
            mensaje("No se ha podido guardar el archivo");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //limpiar pestaña
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        scroll = (JScrollPane) jTabbedPane1.getSelectedComponent();
        txtArea = (JTextArea) scroll.getViewport().getComponent(0);
        txtArea.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    //guardar
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

    //salir
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

    //errores
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(listaErrores.size() > 0){
            String cad = "";
            for(int i = 0; i < listaErrores.size(); i++){
                cad = cad + "L:" + listaErrores.get(i).linea + " C:" + listaErrores.get(i).columna + " A: " + listaErrores.get(i).archivo + " -->" + listaErrores.get(i).descripcion +"\n";
            }
            mensaje(cad);
        }else{
            mensaje("No hay errores");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    //imagenes
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        mensaje("Se abrirá la carpeta que contiene las imágenes generadas durante el análisis");
        try {
            Desktop.getDesktop().open(new File("entradas"));
        } catch (IOException ex) {
            mensaje("Error al abrir la carpeta");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    //acerca de
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String msj = "Melyza Rodríguez"
                + "\n201314821"
                + "\nPráctica No.1"
                + "\nLaboratorio de Compiladores 1"
                + "\nSección A"
                + "\nSegundo semestre, 2019";
        mensaje(msj);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void close() {
        ImageIcon imageIcon = new ImageIcon("src/resources/" + "salir" + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea salir?",
                "Salir de la aplicación", JOptionPane.YES_NO_OPTION, 0, imageIcon) == JOptionPane.YES_OPTION) {
            System.exit(0);
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
        ImageIcon imageIcon = new ImageIcon("src/resources/" + st + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        boton.setIcon(imageIcon);
    }

    public void mensaje(String cad) {
        ImageIcon imageIcon = new ImageIcon("src/resources/" + "notificacion" + ".png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JOptionPane.showMessageDialog(null, cad, "Práctica 1 OLC", JOptionPane.DEFAULT_OPTION, imageIcon);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/app.png"));
        return retValue;
    }

    public static void main(String args[]) {

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
