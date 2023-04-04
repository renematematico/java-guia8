/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author crist
 */
public class Mascota {
    ///////////////////// ATRIBUTOS EN PRIMER LUGAR ////////////////////////

///ATRIBUTOS/// - Van al principio de la clase
    public String nombre;
    public String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    public int energia;

///////////////////// CONSTRUCTORES EN SEGUNDO LUGAR ////////////////////////
    
///CONSTRUCTOR/// - Por defecto
    public Mascota() {
        energia=1000;
    }

    ///CONSTRUCTOR/// - Con parámetros
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia=1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia=1000;
    }
    
    ///////////////////////// GETER Y SETER ////////////////////////////
    
    ////////////////// MÉTODOS FUNCIONALES O FUNCIONES /////////////////////
    /**
     * Función destinada a pasear
     * @param energiaRestar
     * @return 
     */
    public int pasear(int energiaRestar){
    //    this.energia=energia-energiaRestar;
        energia-=energiaRestar;
        return energia;
    }
    
    /**
     * Función destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
    
        for (int i = 0; i < vueltas; i++) {
            energia-=energiaRestar;
        }
        
        return energia;
    }
    
    ////////////////////////// TO STRING /////////////////////////////

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

   

    
    
    
}
