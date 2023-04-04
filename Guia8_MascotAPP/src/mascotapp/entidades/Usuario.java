/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Usuario {
    ///////////////////// ATRIBUTOS EN PRIMER LUGAR ////////////////////////
///ATRIBUTOS/// - Van al principio de la clase
    private String nombre;
    private String apellido;
    private int dni;
    private Date nacimiento;
    private String pais;
    
 
///////////////////// CONSTRUCTORES EN SEGUNDO LUGAR ////////////////////////
/*Para diferenciar 2 constructores, 
  estos deben llevar diferentes argumentos.*/
    
///CONSTRUCTOR/// - Por defecto
    public Usuario() {
    }
    
    ///CONSTRUCTOR/// - Con Parámetros
    public Usuario(String nombre, String apellido, int dni, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;        
        this.pais = pais;
    } 
    
    
///////////////////////// GETTER ////////////////////////////
    
    public String getNombre(){
    return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getPais() {
        return pais;
    }
    
    
    
///////////////////////// SETTER ////////////////////////////
    
    public void setNombre(String nombre){
        if(nombre.length()>0){
    this.nombre=nombre;
        }
    }
     public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
        
////////////////// MÉTODOS FUNCIONALES O FUNCIONES /////////////////////
 
    
    
////////////////////////// TO STRING /////////////////////////////    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + '}';
    }

   

}
