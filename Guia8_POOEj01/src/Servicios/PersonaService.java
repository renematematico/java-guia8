/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PersonaService {
    
    public Persona crearPersona(){
    Scanner leer = new Scanner(System.in);
    
    //Instanciamos un objeto persona con sus atributos vacíos
    Persona personaCompleta = new Persona();
    
    //Pedimos al usuario que isngrese la información
    //que se alojará en el atributo por consola
    System.out.println("Ingrese el nombre de la persona");
    
    //Utilizamos el objeto para invocar al método SET
    //Y con el Scanner recibimos la información
    personaCompleta.setNombre(leer.next());
    
    //Pedimos al usuario que isngrese la información
    //que se alojará en el atributo "nrold" por consola
    System.out.println("Ingrese el número nrold");
    //Utilizamos el objeto para invocar al método SET
    //Y con el Scanner recibimos la información
    personaCompleta.setNrold(leer.nextInt());
    
    
    //este método retorna un objeto persona con sus atributos 
    //llenos de información.
    return personaCompleta;
    }
    
   /**
    * MOSTRAR PERSONA
    * @param personaCompleta 
    */
   public void mostrarPersona(Persona personaCompleta){
       System.out.println("Nombre = "+personaCompleta.getNombre());
       System.out.println("Código = "+personaCompleta.getNrold());
   }
    
}
