/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ecuacion;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiciosEcuaciones {

    Scanner leer = new Scanner(System.in);
    double a, b, c;

    public Ecuacion crearEcuacion() {
        System.out.println("Coeficiente CUADRÁTICO");
        a = leer.nextDouble();
        System.out.println("Coeficiente LINEAL");
        b = leer.nextDouble();
        System.out.println("Término INDEPENDIENTE");
        c = leer.nextDouble();

        return new Ecuacion(a, b, c);
    }

    public double getDiscriminante(Ecuacion ec) {
        double disc = Math.pow(ec.getB(), 2) - 4 * ec.getA() * ec.getC();
        return disc;
    }

    public boolean tieneRaices(Ecuacion ec) {
        boolean raices;
        if (getDiscriminante(ec) > 0) {
            raices = true;
            return raices;
        } else {
            raices = false;
            return raices;
        }
        
    }
    
    public boolean tieneRaiz(Ecuacion ec) {
        boolean raiz;
        if (getDiscriminante(ec) > 0) {
            raiz = true;
            return raiz;
        } else {
            raiz = false;
            return raiz;
        }
        
    }
    
    public void calcular(Ecuacion ec){
    
        if(getDiscriminante(ec)==0){
            double raiz=-ec.getB()/(2*ec.getA());
            System.out.println("La ecuación tiene una raíz única");
            System.out.println("X1 = X2 = "+Math.round(raiz));
        }else if(getDiscriminante(ec)<0){
            System.out.println("La ecuación NO TIENE RAÍCES");
        }else{
            double raiz1=-(ec.getB()+Math.sqrt(getDiscriminante(ec)))/(2*ec.getA());
            double raiz2=-(ec.getB()-Math.sqrt(getDiscriminante(ec)))/(2*ec.getA());
            System.out.println("La ecuación tiene 2 raíces diferentes");
            System.out.println("X1 = "+raiz1);
            System.out.println("X2 = "+raiz2);
        }
        
    }

}
