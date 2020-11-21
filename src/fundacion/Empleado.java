/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Empleado{
    private String nombre;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private Date fechaInicio;
    private double sueldo;
    private String usuario;
    private String contrasena;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, String direccion, String numeroTelefono, String correoElectronico, String fechaInicio, double sueldo, String usuario, String contrasena){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.fechaInicio = toDate(fechaInicio);
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

    public Date getFechaInicio() {
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

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = toDate(fechaInicio);
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
    //metodo para convertir strings a fecha 
    /*
    public static Date toDate(String fecha)throws Exception{
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
        Date fechaInicio = formatter1.parse(fecha);
        return fechaInicio;
    }*/
    public static Date toDate(String dateInString){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(0);
        try {

            date = formatter.parse(dateInString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /*
    public boolean equals(Object obj){
      if(obj != null){
        if (obj instanceof Empleado){
          Empleado other = (Empleado) obj;
          if(usuario.equals(other.usuario) && contrasena.equals(other.contrasena)){
            return true;
          }

        }
      }
      return false;

    }*/
    
    
    
    
    
}
