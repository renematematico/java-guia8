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
public class Persona {

    //////ATRIBUTOS
    public String nombre;
    public int nrold;

    //////CONSTRUCTORES
    public Persona() {
    }
    public Persona(String nombre, int nrold) {
        this.nombre = nombre;
        this.nrold = nrold;
    }

    //////GETTERS
    public String getNombre() {
        return nombre;
    }
    public int getNrold() {
        return nrold;
    }

    ///////SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNrold(int nrold) {
        this.nrold = nrold;
    }

    /////TO STRING

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", nrold = " + nrold + "}";
    }
    
    
}
