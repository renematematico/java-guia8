/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author crist
 */
public class CuentaBancaria {
    /////////ATRIBUTOS
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    
    /////CONSTRUCTOR

    public CuentaBancaria() {
    }
    public CuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    ///////GETTER
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public int getDniCliente() {
        return dniCliente;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    
    /////SETTER
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
///TO STRING

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta Nº" + numeroCuenta + ", D.N.I.= " + dniCliente + ", saldoActual= $" + saldoActual + '}';
    }
    
    
    
    
}
