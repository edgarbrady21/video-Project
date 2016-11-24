/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta.peliculas;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author edgar-tebow
 */
public class ExcepcionDos {
     public static void main(String[] args){
        
        
        File f=new File("/home/edgar-tebow/NetBeansProjects/Renta-peliculas/basedatos");
        try {
            int x=2;
            int y=0;
          
            
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
            
            while(( ch=fis.read() )!=-1){
                builder.append((char)ch);
            }
            
            System.out.println("Se leyo bien y se encotro esto:"+builder.toString());
            
       
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            
        }
    }
    
}
