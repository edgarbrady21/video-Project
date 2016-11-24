/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renta.peliculas;

import java.io.Serializable;

/**
 *
 * @author edgar-tebow
 */
public class UsuarioPelicula implements Serializable{
    
    private Integer Id;
    private String nombre;
    private Integer telefono;
    private String direccion;
    private String email;

   
    
    
    
     @Override
    public String toString() {
        return "UsuarioPelicula{" + "id="+Id+ ",nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + '}';
    }
    

    public UsuarioPelicula(Integer Id) {
        this.Id = Id;
    }
    
    
 public UsuarioPelicula(Integer Id, String nombre, Integer telefono, String direccion, String email) {
        this.Id = Id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    
   
        
    }
    
    

    public UsuarioPelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
}
