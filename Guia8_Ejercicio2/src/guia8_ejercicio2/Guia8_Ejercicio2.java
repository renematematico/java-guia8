/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio2;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicios;

/**
 *
 * @author crist
 */
public class Guia8_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc, opc2;
        boolean menu = true;
        Scanner leer = new Scanner(System.in);
        CafeteraServicios servCaf = new CafeteraServicios();

        ///INICIAMOS LA CAFETERA 01
        Cafetera caf01 = servCaf.llenarCafetera();

        do {
            do {
                limpiarPantalla();
                System.out.println("=============================");
                System.out.println("MENU DE CAFETERIA");
                System.out.println("(1) - Servir TAZA");
                System.out.println("(2) - Vaciar Cafetera");
                System.out.println("(3) - Recargar Cafetera");
                System.out.println("(4) - SALIR");
                opc = leer.nextInt();
                System.out.println("=============================");
            } while (opc < 1 || opc > 4);
            switch (opc) {
                case 1:
                    limpiarPantalla();
                    servCaf.servirTaza(caf01);
                    break;
                case 2:
                    limpiarPantalla();
                    servCaf.vaciarCafetera(caf01);
                    break;
                case 3:
                    limpiarPantalla();
                    servCaf.agregarCafe(caf01);
                    break;
                case 4:
                    menu = false;
                    break;
            }
            do {
                //limpiarPantalla();
                System.out.println("==============================");
                System.out.println("DESEA REALIZAR OTRA OPERACIÓN");
                System.out.println("(1) - SI");
                System.out.println("(2) - NO");
                opc2 = leer.nextInt();
                System.out.println("==============================");
            } while (opc2 < 1 || opc2 > 2);
            if (opc2 == 2) {
                menu = false;
            }
        } while (menu == true);
        limpiarPantalla();
        System.out.println("==================");
        System.out.println("PROGRAMA TERMINADO");        
        System.out.println("==================");

    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }

    }
}
