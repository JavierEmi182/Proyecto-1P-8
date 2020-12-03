/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Interesado extends Persona{
    private String tipo;
    private String raza;
    private String sexo;
    private ArrayList<Animal> listaAdoptados;
    
    //Constructores
    public Interesado(String nombre, String id, String direccion, String numerTelefono, String correoElectronico, String tipo,String raza,String sexo){
         super(nombre, id, direccion, numerTelefono, correoElectronico);
         this.tipo=tipo;
         this.raza=raza;
         this.sexo=sexo;
    }
    
    //Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Metodos
    public void agregarAdopcion(Animal a){
        if (a.equals(null)){
            listaAdoptados.add(a);
        }       
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico()
                +"\nPreferencias\n"+"Tipo: "+ tipo+", Raza: "+raza+", Sexo: "+sexo;
    }
    
    public String presentarInfo(){
        return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico();
    }
}
