/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    int numCuenta[] = new int[1];

    /**
     * CREAR CUENTA NUEVA
     *
     * @return
     */
    public CuentaBancaria crearCuenta() {
        numCuenta[0] += 1;
        int numeroCuenta = numCuenta[0];
        System.out.println("Indicar DNI");
        int dniCliente = leer.nextInt();
        System.out.println("Indicar Saldo Inicial para la cuenta");
        double saldoActual = leer.nextDouble();
//El retorno de la función llama al CONSTRUCTOR DE LA CLASE para generar el obj.
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    /**
     * INGRESAR SALDO
     *
     * @param cuenta
     */
    public void ingresarSaldo(CuentaBancaria cuenta) {
        System.out.println("=============================");
        System.out.println("Indicar el monto a depositar.");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());
        System.out.println("------------------------------");
        System.out.println("Su saldo actual es = " + cuenta.getSaldoActual());
        System.out.println("------------------------------");
    }

    /**
     * RETIRAR SALDO
     *
     * @param cuenta
     */
    public void retirarSaldo(CuentaBancaria cuenta) {
        System.out.println("=============================");
        System.out.println("Indicar el monto a RETIRAR.");
        double monto = leer.nextDouble();
        while (monto > cuenta.getSaldoActual()) {
            System.out.println("El monto ingresado es superior a su saldo");
            System.out.println("El MÁXIMO a retirar es de $" + cuenta.getSaldoActual());
            System.out.println("Indicar el monto a RETIRAR.");
            monto = leer.nextDouble();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
        System.out.println("------------------------------");
        System.out.println("Su saldo actual es = $" + cuenta.getSaldoActual());
        System.out.println("------------------------------");
    }

    /**
     * EXTRACCIÓN RÁPIDA
     *
     * @param cuenta
     */
    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("=============================");
        double monto = cuenta.getSaldoActual() * 0.2;
        int opc = 0;
        do {
            System.out.println("RETIRAR $" + monto + " ?");
            System.out.println("(1) - CONFIRMAR");
            System.out.println("(2) - CANCELAR");
            opc = leer.nextInt();
        } while (opc < 1 || opc > 2);

        if (opc == 1) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
            System.out.println("------------------------------");
            System.out.println("Su saldo actual es = $" + cuenta.getSaldoActual());
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Su saldo actual es = $" + cuenta.getSaldoActual());
            System.out.println("------------------------------");
        }
    }

    /**
     * CONSULTA DE SALDO
     *
     * @param cuenta
     */
    public void consultaSaldo(CuentaBancaria cuenta) {
        System.out.println("------------------------------");
        System.out.println("Su saldo actual es = $" + cuenta.getSaldoActual());
        System.out.println("------------------------------");
    }

    /**
     * CONSULTA DE DATOS
     *
     * @param cuenta
     */
    public void consultaDatos(CuentaBancaria cuenta) {
        System.out.println("Nº de Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Su saldo actual es = $" + cuenta.getSaldoActual());
        System.out.println("D.N.I de usuario: " + cuenta.getDniCliente());
        System.out.println("------------------------------");
    }
}
