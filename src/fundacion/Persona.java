/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

/**
 *
 * @author user
 */
public class Persona {
    private String nombre;
    private String id;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    
    public Persona(String nombre, String id, String direccion, String numerTelefono, String correoElectronico){
        this.nombre=nombre;
        this.id=id;
        this.direccion=direccion;
        this.numeroTelefono=numerTelefono;
        this.correoElectronico=correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    



}

