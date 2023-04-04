/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author crist
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Debemos instanciar un "objeto del tipo Servicio"
        //para acceder a sus métodos
        PersonaService persServicio = new PersonaService();
        
        //Alojamos el retorno del método en un objeto tipo Persona
        Persona terceraPersona=persServicio.crearPersona();
        
        System.out.println(terceraPersona.getNombre());
        
        persServicio.mostrarPersona(terceraPersona);
        
    }
    
}
