/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio3;

import entidades.Persona;
import java.util.Scanner;
import services.PersonaServicio;

/**
 *
 * @author crist
 */
public class Guia8_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int imc[]=new int[4];
        int pesoB=0,pesoI=0,pesoA=0;        
        boolean mayEdad[]=new boolean[4];
        int contMay=0,contMen=0;
        
        PersonaServicio ps = new PersonaServicio();
        System.out.println("------------------------");
        Persona p01=ps.crearPersona();        
        limpiarPantalla();
        System.out.println("------------------------");
        Persona p02 = ps.crearPersona();
        limpiarPantalla();
        System.out.println("------------------------");
        Persona p03 = ps.crearPersona();
        limpiarPantalla();
        System.out.println("------------------------");
        Persona p04 = ps.crearPersona();
        limpiarPantalla();
        System.out.println("------------------------");
        System.out.println(p01.getNombre().toUpperCase());
        System.out.println("Edad= "+p01.getEdad());
        if(ps.esMayorDeEdad(p01)){
            System.out.println("Es MAYOR de edad");
        }else{System.out.println("Es MENOR de edad");}                
        System.out.print("Peso = ");
        if(ps.calcularIMC(p01)==0){System.out.println("IDEAL");}
        else if(ps.calcularIMC(p01)<0){
            System.out.print(" POR DEBAJO DE LO NORMAL");
        }else{
            System.out.println("CON SOBREPESO");
        }
        imc[0]=ps.calcularIMC(p01);
        mayEdad[0]=ps.esMayorDeEdad(p01);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println(p02.getNombre().toUpperCase());
        System.out.println("Edad= "+p02.getEdad());
        if(ps.esMayorDeEdad(p02)){
            System.out.println("Es MAYOR de edad");
        }else{System.out.println("Es MENOR de edad");}                
        System.out.print("Peso = ");
        if(ps.calcularIMC(p02)==0){System.out.println("IDEAL");}
        else if(ps.calcularIMC(p02)<0){
            System.out.print(" POR DEBAJO DE LO NORMAL");
        }else{
            System.out.println("CON SOBREPESO");
        }
        imc[1]=ps.calcularIMC(p02);
        mayEdad[1]=ps.esMayorDeEdad(p02);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println(p03.getNombre().toUpperCase());
        System.out.println("Edad= "+p03.getEdad());
        if(ps.esMayorDeEdad(p03)){
            System.out.println("Es MAYOR de edad");
        }else{System.out.println("Es MENOR de edad");}                
        System.out.print("Peso = ");
        if(ps.calcularIMC(p03)==0){System.out.println("IDEAL");}
        else if(ps.calcularIMC(p03)<0){
            System.out.print(" POR DEBAJO DE LO NORMAL");
        }else{
            System.out.println("CON SOBREPESO");
        }
        imc[2]=ps.calcularIMC(p03);
        mayEdad[2]=ps.esMayorDeEdad(p03);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println(p04.getNombre().toUpperCase());
        System.out.println("Edad= "+p04.getEdad());
        if(ps.esMayorDeEdad(p04)){
            System.out.println("Es MAYOR de edad");
        }else{System.out.println("Es MENOR de edad");}                
        System.out.print("Peso = ");
        if(ps.calcularIMC(p04)==0){System.out.println("IDEAL");}
        else if(ps.calcularIMC(p04)<0){
            System.out.println(" POR DEBAJO DE LO NORMAL");
        }else{
            System.out.println("CON SOBREPESO");
        }
        imc[3]=ps.calcularIMC(p04);
        mayEdad[3]=ps.esMayorDeEdad(p04);
        System.out.println("------------------------");
        
        for (int i = 0; i < imc.length; i++) {            
            if (imc[i]==0){
            pesoI+=1;
            }else if(imc[i]<0){
            pesoB+=1;
            }else{pesoA+=1;}
        }
        
        for (int i = 0; i < mayEdad.length; i++) {            
            if (mayEdad[i]){
            contMay+=1;
            }else{
            contMen+=1;
            }
        }
        System.out.println("------------------------");
        System.out.println("Por debajo del peso = "+(pesoB*100/imc.length)+"%");
        System.out.println("Con peso ideal = "+(pesoI*100/imc.length)+"%");
        System.out.println("Con sobrepeso = "+(pesoA*100/imc.length)+"%");
        System.out.println("------------------------");
        System.out.println("Mayores de edad = "+contMay*100/mayEdad.length+"%");
        System.out.println("Mayores de edad = "+contMen*100/mayEdad.length+"%");
        System.out.println("------------------------");
        
        
    }
    //////////SUBPROGRAMAS
    public static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }

    }
    
}


