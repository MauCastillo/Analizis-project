/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Soporte
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Punto1 {

    private ArrayList<Zona> Terrenos = new ArrayList<>();
    private ArrayList<Zona> firstOption;
    private ArrayList<Zona> secondOption;
    /* Acomuladores de beneficios*/
    private int primero;
    private int segundo;

    public Punto1(ArrayList<Zona> zonas) {
        firstOption = new ArrayList<>();
        secondOption = new ArrayList<>();
        this.Terrenos = zonas;

        primero = 0;
        segundo = 0;

    }

    public void calculo() {
        Zona temp = new Zona();
        int sizeTerreno = Terrenos.size();
        if (Terrenos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Archivo Vacio ó \n Con fomato incompatible", "¡Error de Contenido!", 0);
        } else {
            int status = 0; /*status 0 primera supocision status 1 segunda suposicion*/
            /*Algoritmo O(n)*/

            for (int i = 0; i < sizeTerreno; i++) {
                temp = Terrenos.get(i);
                if (status == 0) {
                    firstOption.add(temp);
                    primero += temp.getBeneficio();
                }
                if (status == 1) {
                    secondOption.add(temp);
                    segundo += temp.getBeneficio();
                }
                /*Controlador de intercambio de arreglos*/
                if (status == 1) {
                    status = 0;
                } else {
                    status = 1;
                }

            }
        }
        if (primero > segundo) {

            System.out.println("Gano el primero \n Beneficio Total: " + primero);
            print(firstOption);
            printFile(firstOption);
        } else if (primero < segundo) {
            System.out.println("Gano el Segundo \n Beneficio Total: " + segundo);
            print(secondOption);
            printFile(secondOption);
        } else if (primero == segundo) {
            System.out.println("Se obtiene el mismo beneficio");
            System.out.println("-+-+ Gano el primero +-+-");
            print(firstOption);
            System.out.println("+-+- Gano el Segundo +-+-");
            print(secondOption);

        }

    }

    private void print(ArrayList<Zona> lista) {
        /*Imprime en consola*/
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numero de zona: " + lista.get(i).getNumberZone());
            System.out.println("Beneficio: " + lista.get(i).getBeneficio());
            System.out.println("-+-+-+-+-+-+-");
        }
    }

    private void printFile(ArrayList<Zona> Wlista) {
        /*Imprime en Archivo de texto*/
        EscribeFichero escribir = new EscribeFichero();
        escribir.setAddelement(Wlista.size());
        escribir.setAddelement(Wlista);
        escribir.setArchivoWrite();

    }
}
