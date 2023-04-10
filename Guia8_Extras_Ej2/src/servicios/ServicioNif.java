/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioNif {
    
    public NIF crearNif(){
        int temp1;
        String vector[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el Número de DNI");
        int dni=leer.nextInt();
        temp1=dni%23;
        //System.out.println(temp1);        
        String letra=vector[temp1];
        //System.out.println(letra);        
    
        return new NIF(dni, letra);
    }
    
    public int getDni(NIF d){    
        int dni = d.getDni();
        return dni;
    }
    public String getLetra(NIF d){    
        String let = d.getLetra();
        return let;
    }
    
    public void mostrar(NIF d){
       
        
        System.out.println("El NIF del usuario es: "+d.getDni()+"-"+d.getLetra());
        
        /////////////////////////////////////////////////////
        
        //////CREAMOS UN VECTOR CON TODOS LOS ELEMENTOS EN CERO
         String vector[]=new String[8];
        for (int i = 0; i < vector.length; i++) {
            vector[i]="0";
        }
        //////CONVERTIMOS EL NÚMERO A UNA CADENA
        String dnis=Integer.toString(d.getDni());
        
        //////CREAMOS UNA VARIABLE AUXILIAR Y LUEGO LLENAMOS EL VECTOR
        //CON LOS ELEMENTOS QUE NECESITAMOS
        int j=0;
        for (int i = 8-dnis.length(); i < 8; i++) {            
        vector[i]=dnis.substring(j,j+1);
        j+=1;
        }        
        
        /////MOSTRAMOS EL VECTOR Y EL CÓDIGO QUE NOS PEDÍAN.
        System.out.print("El NIF del usuario es: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(vector[i]);
        }
        System.out.print("-"+d.getLetra());
        System.out.println("");
        System.out.println("");
        
    }
    
    public static void limpiarPantalla(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    
    }
    
}
