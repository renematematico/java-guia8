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
public class NIF {

    //////ATRIBUTOS
    private int dni;
    private String letra;

    ////CONSTRUCTORES
    public NIF() {
    }

    public NIF(int dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    /////GETTERS
    public int getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    /////SETTERS
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
