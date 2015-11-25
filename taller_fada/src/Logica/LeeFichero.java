/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author natha
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LeeFichero {

    private ArrayList<Zona> Terreno = new ArrayList<>();

    public ArrayList<Zona> getTerreno() {
        return Terreno;
    }

    ArrayList leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//Meto rediseñado

    public void setAddresFile(File addres) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Zona zona = new Zona();

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = addres;
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea = "";
            int contador = 0;

            while ((linea = br.readLine()) != null) {

                if (contador > 0) {
                    zona = new Zona();
                    zona.setName(linea);
                    zona.setNumberZone(contador);
                    Terreno.add(zona);
                }
                contador += 1;
            }
            br.close();

        } catch (Exception e) {
            JOptionPane.showInputDialog(e + "Error de lectura de archivo");

        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                JOptionPane.showConfirmDialog(null, e2 + "Error de lectura de archivo");
                return;
            }
        }

    }
}
