/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta.peliculas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author edgar-tebow
 */
public class PersistenciaUsuarioPeli {
    
    ArrayList<UsuarioPelicula> usuarios;
    
    public PersistenciaUsuarioPeli(){
        usuarios=new  ArrayList<>();
        
        
    }
    
      
    
   public void guardar(UsuarioPelicula u)throws Exception{
     
      File f=new File("basedatos.raton");
      if(f.exists()) usuarios= buscarTodos();
  
   FileOutputStream fos=new FileOutputStream(f);
   
  
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   
   
                     usuarios.add(u);
                     oos.writeObject(usuarios);
    
}
   
  
  
   public ArrayList<UsuarioPelicula> buscarTodos()throws Exception{
       File f=new File("basedatos.raton");
      FileInputStream fis=new FileInputStream(f);
      ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=    (ArrayList<UsuarioPelicula>) ois.readObject();
    return usuarios;     
   }
}

