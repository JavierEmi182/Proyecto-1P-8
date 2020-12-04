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
         listaAdoptados= new ArrayList<Animal>();
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
    public ArrayList<Animal> getlistaAdoptados(){
        return listaAdoptados;
    }
    
    //Metodos
    
    public void agregarAdopcion(Animal a){
        if (a!=null){
            listaAdoptados.add(a);
        }       
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico()
                +"\nPreferencias\n"+"Tipo: "+ tipo+", Raza: "+raza+", Sexo: "+sexo;
    }
    
    public String imprimirLista(){
        String lista="";
        for (Animal a:listaAdoptados){
            lista+=a.toString();
            
        }
        return lista;
    }
    public String toStringSinPreferencias(){
        if (!listaAdoptados.isEmpty()){
            return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico()+
                    imprimirLista();
        } else {
            return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                    +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico();
        }        
    }
    public String infoAdoptante(){
        return "Nombre: "+getNombre()+", ID: "+getId()+"\n Direccion: "+getDireccion()
                    +", Telefono: "+getNumeroTelefono()+"\n Correo: "+getCorreoElectronico();
    }
    
    public String presentarInfo(){
        return "Nombre: "+getNombre()+", ID: "+getId()+"<br> Direccion: "+getDireccion()
                +", Telefono: "+getNumeroTelefono()+"<br> Correo: "+getCorreoElectronico();
    }
    public boolean equals(Object o){
        if (o !=null){
            if(o instanceof Interesado){
                Interesado other = (Interesado)o;
                if(getId().equals(other.getId())){
                    return true;
                }
            }
        }return false;
    }
}
