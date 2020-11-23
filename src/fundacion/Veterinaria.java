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
public class Veterinaria {
    private String nombre;
    private String contacto;
    private String correo;
    
    //CONSTRUCTORES

    public Veterinaria(String nombre, String contacto, String correo) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Veterinaria: " + "nombre: " + nombre + ", contacto: " + contacto + ", correo: " + correo ;
    }
    
}

