/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_extras_ej2;

import entidades.NIF;
import servicios.ServicioNif;

/**
 *
 * @author crist
 */
public class Guia8_Extras_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Vinculamos el main con la clase de Servicios mediante 
        // el elemento "ns"
        ServicioNif ns = new ServicioNif();

        //Creamos el objeto us01 usando un constructor que está dentro de
        //la clase de servicios.
        NIF us01 = ns.crearNif();
        
        limpiarPantalla(5);
        //Ya podemos llamar a los métodos que viven dentro de la
        //clase de servicios.
        /*System.out.println("El DNI es:");
        System.out.println(ns.getDni(us01));
        System.out.println("La letra asignada es:");
        System.out.println(ns.getLetra(us01));*/
        ns.mostrar(us01);
    }

    public static void limpiarPantalla(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    
    }
    
}
