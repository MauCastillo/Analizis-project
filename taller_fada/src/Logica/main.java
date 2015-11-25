/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.util.ArrayList;
import Gui.PrincipalView;

/**
 *
 * @author natha
 */


public class main {
    
    int cantidadTerrenos = 0;
    int beneficioTotal = 0;
    ArrayList beneficios = new ArrayList ();
    int ubicacion = 0;
    ArrayList resultado = new ArrayList ();
    
    public ArrayList leer (){
        LeeFichero objFichero = new LeeFichero();
        beneficios = objFichero.leer();
        return beneficios;
    }
    
    public ArrayList calcula (){
        return resultado;
    }
    
    public void escribe (){
        EscribeFichero objEscribe = new EscribeFichero ();
        //objEscribe.metodo(resultado);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrincipalView vista = new PrincipalView();
        vista.setVisible(true);
    }
    
}



//jasljfsnvosfslfsjlfsn