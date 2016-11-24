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
public class ValidaArchivo {
      public static void validarExtencion(String extencion)throws ArchivoNotException {
        if(!extencion.equals("txt")) throw new ArchivoNotException();
    }
    
}
