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
public class Persona {
    /////ATRIBUTOS
    private String nombre;
    private String sexo;
    private double peso;
    private double altura;
    private int edad;
    
    //////////CONSTRUCTORES
    public Persona() {
    }
    public Persona(String nombre, String sexo, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
    
    
    ///////GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    
    
    ////SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
