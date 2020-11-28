/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.time.LocalDate;


/**
 *
 * @author usuario
 */
public class Empleado{
    private String nombre;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private LocalDate fechaInicio;
    private double sueldo;
    private String usuario;
    private String contrasena;
    protected Fundacion fundacion ;
  

    public Empleado( String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.fechaInicio = fechaInicio;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        
    }
    //GETTERS AND SETTERS

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
   
   
    /*
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Empleado){
                Empleado c = (Empleado)obj;
                return c.usuario.equals(usuario);
            }
        }
        return false;
    }*/
    
    
    
    
    
}
