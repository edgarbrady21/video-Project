/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta.peliculas;

/**
 *
 * @author edgar-tebow
 */
public class ExcepcionUno {
     public static void main(String[] args) {
        
        
        float x=4;
        int y=0;
        System.out.println(x/y);
        
        
         String falsoNumero="5";
         int numeroReal=5;
         System.out.println("Este es antes de la excepcion");
         int suma=Integer.parseInt(falsoNumero)+numeroReal;
         System.out.println("Todo esta bien hasta aqui");
         if(true){
             System.out.println("siempre aparecere");
         }
         System.out.println("La ejecucion siempre pasa aqui se ejecute o"
                 + "no el if");
    }
    
}
