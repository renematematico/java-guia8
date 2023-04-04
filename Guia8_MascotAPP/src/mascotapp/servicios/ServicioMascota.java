/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author crist
 */
public class ServicioMascota {
    private Scanner leer = new Scanner(System.in);

    public Mascota crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        ///RETORNAMOS el nacimiento de una mascota con los atributos 
        //asignados por el teclado
        return new Mascota(nombre, apodo, tipo);

        
    }
}
