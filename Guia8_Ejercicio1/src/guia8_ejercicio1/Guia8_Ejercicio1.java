/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Guia8_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0, opc2 = 0;
        boolean menu = true;
        Scanner leer = new Scanner(System.in);
        //Creamos una variable que guarde la "Clase de Servicios"
        //Para poder acceder a los distintos métodos funcionales de la Clase
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        System.out.println("=============================");
        System.out.println("CREACIÓN DE CUENTA DE USUARIO");
        //Creamos la cuenta utilizando el método alojado dentro de los servicios.
        CuentaBancaria cuenta001 = cbs.crearCuenta();
        //CuentaBancaria cuenta002=cbs.crearCuenta();

        do {
            limpiarPantalla();
            //Mostramos el contenido del objeto cuenta ya creado
            System.out.println(cuenta001.toString());
            // System.out.println(cuenta002.toString());
            System.out.println("=============================");
            do {
                System.out.println("MENU DE USUARIO");
                System.out.println("(1) - Ingresar Saldo");
                System.out.println("(2) - Retirar Saldo");
                System.out.println("(3) - EXTRACCIÓN RÁPIDA");
                System.out.println("(4) - Consultar Saldo");
                System.out.println("(5) - Consultar Datos de Cuenta");
                System.out.println("(6) - SALIR");
                opc = leer.nextInt();
                System.out.println("=============================");
            } while (opc < 1 || opc > 6);
            switch (opc) {
                case 1:
                    limpiarPantalla();
                    cbs.ingresarSaldo(cuenta001);
                    break;
                case 2:
                    limpiarPantalla();
                    cbs.retirarSaldo(cuenta001);
                    break;
                case 3:
                    limpiarPantalla();
                    cbs.extraccionRapida(cuenta001);
                    break;
                case 4:
                    limpiarPantalla();
                    cbs.consultaSaldo(cuenta001);
                    break;
                case 5:
                    limpiarPantalla();
                    cbs.consultaDatos(cuenta001);
                    break;
                case 6:
                    menu = false;
                    break;
            }
            do {
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
        System.out.println("==================");
        System.out.println("PROGRAMA TERMINADO");
        System.out.println("RETIRE SU TARJETA");
        System.out.println("==================");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
    }

}
