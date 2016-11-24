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
public class ProbarGuardadoPeli {
 
    public static void main(String[] args){
        
        UsuarioPelicula u=new UsuarioPelicula(1, "Edgar", 55589875, "Alcanfores #63 villa de las flores","edgar@gmail.com");
        PersistenciaUsuarioPeli p=new PersistenciaUsuarioPeli();
      
           try {
            p.guardar(u);
            System.out.println("Usuario guardado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
}
