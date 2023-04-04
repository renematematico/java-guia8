/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author crist
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Necesitamos conectarnos al servicio.
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1=sm.crearMascota();
        
        //Lo que devuelva la función "crearMascota();" 
        //será guardado dentro de la variable "m1"
        
        //Luego mostramos por pantalla el contenido de m1
        
        System.out.println(m1.toString());
        
        
        
    }
    
}
