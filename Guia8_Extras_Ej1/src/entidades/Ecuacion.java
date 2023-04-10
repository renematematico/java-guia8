/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author crist
 */
public class Ecuacion {
    /////ATRIBUTOS
    private double a;
    private double b;
    private double c;
    
    ////////CONSTRUCTORES
    public Ecuacion() {
    }
    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //////SETTERS
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    //////////GETTERS
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    
    
}
