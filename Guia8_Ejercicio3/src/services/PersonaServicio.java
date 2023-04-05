/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Scanner leer2 = new Scanner(System.in);

    /**
     * CREACIÓN DE OBJETO PERSONA
     *
     * @return
     */
    public Persona crearPersona() {
        String sexo;
        System.out.println("Ingresar Nombre");
        String nombre = leer.next();
        do {

            System.out.println("Ingresar Sexo");
            System.out.println("(M)-Masculino");
            System.out.println("(F)-Femenino");
            System.out.println("(O)-Otro");
            sexo = leer.next().toUpperCase();
            
            if (sexo.length() > 1 || !(sexo.equals("M")|| sexo.equals("F")|| sexo.equals("O"))) {
                System.out.println("===========================================");
                System.out.println("La opción ingresada es INCORRECTA");
            }
            System.out.println("===========================================");
        } while (sexo.length() > 1 || !(sexo.equals("M")|| sexo.equals("F")|| sexo.equals("O")));
        System.out.println("--------------------");
        System.out.println("Ingresar peso");
        double peso = leer.nextDouble();
        System.out.println("--------------------");
        System.out.println("Ingresar altura");
        double altura = leer.nextDouble();
        System.out.println("--------------------");
        System.out.println("Ingresar edad");
        int edad = leer.nextInt();
        return new Persona(nombre, sexo, peso, altura,edad);
    }

    /**
     * VERIFICA MAYORÍA DE EDAD
     *
     * @param pers
     * @return
     */
    public boolean esMayorDeEdad(Persona pers) {
        boolean verifica;
        if (pers.getEdad() >= 18) {
            verifica = true;
            return verifica;
        } else {
            verifica = false;
            return verifica;
        }

    }

    /**CALCULAMOS IMC
     * 
     * @param pers
     * @return 
     */
    public int calcularIMC(Persona pers) {
        double calc = pers.getPeso() / Math.pow(pers.getAltura(), 2);
        int imc;
        if (calc < 20) {
            imc = -1;
            return imc;
        } else if (calc <= 25) {
            imc = 0;
            return imc;
        } else {
            imc = 1;
            return imc;
        }

    }
}
