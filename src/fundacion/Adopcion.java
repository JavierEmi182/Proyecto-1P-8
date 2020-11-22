/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Adopcion {
    private String fecha;
    private int codigo=0;
    private Interesado adoptante;
    private  Animal animaAdoptado;

    public Adopcion(String fecha, Interesado adoptante, Animal animaAdoptado) {
        this.fecha = fecha;
        this.codigo +=1;
        this.adoptante = adoptante;
        this.animaAdoptado = animaAdoptado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Interesado getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Interesado adoptante) {
        this.adoptante = adoptante;
    }

    public Animal getAnimaAdoptado() {
        return animaAdoptado;
    }

    public void setAnimaAdoptado(Animal animaAdoptado) {
        this.animaAdoptado = animaAdoptado;
    }
    @Override
    public String toString(){
        return "tipo: "+ adoptante.getTipo()+"raza: "+adoptante.getRaza()+"sexo: "+adoptante.getSexo()+"fecha : "+fecha;
}
    public String correo(){
        return animaAdoptado.toString();
    }
}
