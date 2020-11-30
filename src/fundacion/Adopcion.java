/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Adopcion implements Comparable<Adopcion>{
    private LocalDate fechalocal;
    private int codigo;
    private Interesado adoptante;
    private  Animal animaAdoptado;

    public Adopcion (int codigo, LocalDate fecha, Interesado adoptante, Animal animaAdoptado) {
        fechalocal = fecha;
        this.codigo = codigo;
        this.adoptante = adoptante;
        this.animaAdoptado = animaAdoptado;
    }

    public LocalDate getFecha() {
        return fechalocal;
    }

    public void setFecha(String fecha) {
        fechalocal = Fundacion.toLocalDate(fecha);;
    }

    public int getCodigo() {
        return codigo;
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
        return "tipo: "+ adoptante.getTipo()+"raza: "+adoptante.getRaza()+"sexo: "+adoptante.getSexo()+"fecha : "+fechalocal
                +"Codigo: "+ getCodigo();
}
    public String correo(){
        return animaAdoptado.toString();
    }

    @Override
    public int compareTo(Adopcion t) {
        return fechalocal.compareTo(t.getFecha());
        }
}
