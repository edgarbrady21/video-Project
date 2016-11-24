/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta.peliculas;

import java.util.ArrayList;

/**
 *
 * @author edgar-tebow
 */
public class ProbarUsuarioPeli {
    
    public static void main(String[] args){
        
     
         PersistenciaUsuarioPeli p=new PersistenciaUsuarioPeli();
         try {
             ArrayList<UsuarioPelicula> usuarios=     p.buscarTodos();
          int tam=   usuarios.size();
             System.out.println("usuarios guardados:"+tam);
          System.out.println(usuarios.get(0).getNombre());    
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        
    }
    
}
