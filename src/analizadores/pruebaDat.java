/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import almacenamiento.Errores;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Melyza
 */
public class pruebaDat {
    ArrayList<Errores> listaErrores = new ArrayList<Errores>();
    public static void main(String[] args) {
       
        try {
            //Aquí va el texto de prueba
            String texto = obtenerTexto("C:\\Users\\Melyza\\Desktop\\Compi\\OLCPractica1\\datos.dat");
            scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
            //scan.listaErrores = this.listaErrores;
            //scan.archivoActual = jTabbedPane1.getSelectedComponent().getName();
            parser parser = new parser(scan);
            //parser.archivoActual = jTabbedPane1.getSelectedComponent().getName();
            //parser.listaErrores = this.listaErrores;
            //parser.vR = this.entorno;
            parser.parse();
            if (parser.enr == 0) {//quiere decir que no tuvo errores no recuperables o sea que si puede hacer el reporte
                if (parser.er != 0) {
                    System.out.println("Se han detectado errores r");
                    
                } else {
                    System.out.println("Análisis realizado");
                }
            } else {
                System.out.println("Se han detectado errores nr");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static String obtenerTexto(String ruta) {
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
           System.out.println("No existe el archivo");
        }
        return ret;
    }
}
