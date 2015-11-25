/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Inventario
 */
public class Zona {

    private int numberZone = 0;
    private int beneficio = 0;
    private String name = "";

    public int getNumberZone() {
        return numberZone;
    }

    public void setNumberZone(int num) {
        this.numberZone = num;
    }

    public String getName() {
        return name;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public void setName(String name) {
        this.name = name;
        getBeneficio();
    }

    public int getBeneficio() {
        String temporal = "";
        temporal = this.name.substring(4);
        try {
            beneficio = Integer.parseInt(temporal);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "El archivo no cuenta con una estructura \n compatible para el analisis ", "Error en la estructura de archivo", 0);
        }
        return beneficio;
    }
}
