/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    /**LLENAR CAFETERA
     * Inicia la cafetera con una carga indicda por el usuario
     * @return 
     */
    public Cafetera llenarCafetera() {
        System.out.println("Ingresar la cantidad de café (en ml) para llenar la Cafetera");
        int cantActual = leer.nextInt();
        int capMaxima = cantActual;
        System.out.println("La cafetera tiene "+cantActual+" ml de café listos.");
        return new Cafetera(capMaxima, cantActual);
    }

    /**SERVIR TAZA
     * Sirve taza e indica en caso de no alcanzar el café
     * @param caf
     */
    public void servirTaza(Cafetera caf) {
        System.out.println("================================");
        System.out.println("Indicar capacidad de la taza (en ml)");
        int taza = leer.nextInt();
        if (taza <= caf.getCantidadActual()) {
            caf.setCantidadActual(caf.getCantidadActual() - taza);
            System.out.println("Taza servida.");
            System.out.println("Quedan " + caf.getCantidadActual() + "ml de café en la cafetera.");
        }
        if (taza >= caf.getCantidadActual()) {
            System.out.println("Taza servida pero incompleta.");
            System.out.println("La taza contiene " + caf.getCantidadActual() + " ml de café.");
            System.out.println("Le faltan " + (taza - caf.getCantidadActual()) + " ml para llenarse");
            caf.setCantidadActual(caf.getCantidadActual() - caf.getCantidadActual());
            System.out.println("Quedan " + caf.getCantidadActual() + " ml de café en la cafetera.");
            System.out.println("CAFETERA VACÍA");
        }
        System.out.println("================================");
    }

    /**VACIAR CAFETERA
     * Pone en cero la cafetera.
     * @param caf
     */
    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
        System.out.println("La cafetera ya está vacía");
    }

    /**AGREGA CAFÉ A LA CAFETERA
     * En caso de tener un remanente de la carga anterior nos avisa.
     * @param caf 
     */
    public void agregarCafe(Cafetera caf) {
        System.out.println("La cafetera tiene "+caf.getCantidadActual()+" ml de café.");
        System.out.println("Indicar la cantidad de café a agregar");
        int cafe = leer.nextInt();
        while ((cafe + caf.getCantidadActual()) > caf.getCapacidadMaxima()) {
            System.out.println("La cantidad actual más el café a agregar");
            System.out.println("superan la capacidad máxima de la cafetera.");
            System.out.println("La cantidad MAXIMA a AGREGAR es: ");
            System.out.println(caf.getCapacidadMaxima() - caf.getCantidadActual() + "ml");
            System.out.println("=====================================");
            System.out.println("Indicar la cantidad de café a agregar");
            cafe = leer.nextInt();
            System.out.println("=====================================");
        }
        caf.setCantidadActual(caf.getCantidadActual()+cafe);
        System.out.println("Café cargado");
        
        if(caf.getCantidadActual()==caf.getCapacidadMaxima()){
            System.out.println("CAFETERA LLENA");
        }
        System.out.println("La cafetera tiene "+caf.getCantidadActual()+" ml de café.");
            

    }

}
