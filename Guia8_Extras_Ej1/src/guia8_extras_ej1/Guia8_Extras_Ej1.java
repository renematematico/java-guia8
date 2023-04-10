/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extras_ej1;

import entidades.Ecuacion;
import servicios.ServiciosEcuaciones;

/**
 *
 * @author crist
 */
public class Guia8_Extras_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosEcuaciones se= new ServiciosEcuaciones();
                
        System.out.println("Ingresar los valores de la ecuación cuadrática");
        Ecuacion ec1=se.crearEcuacion();
        
        
        se.calcular(ec1);
        
    }
    
}
