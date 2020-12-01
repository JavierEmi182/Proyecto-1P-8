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
public class Adopcion {
    private LocalDate fechalocal;
    private Interesado adoptante;
    private  Animal animaAdoptado;
    private int codigo;
    private static int codigostaticadopcion = 0;

    public Adopcion (Interesado adoptante, Animal animaAdoptado) {
        fechalocal = LocalDate.now();
        this.adoptante = adoptante;
        this.animaAdoptado = animaAdoptado;
        codigostaticadopcion+=1;
        this.codigo=codigostaticadopcion;
    }

    public LocalDate getFecha() {
        return fechalocal;
    }

    public void setFecha(String fecha) {
        fechalocal = Fundacion.toLocalDate(fecha);;
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

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
        return "tipo: "+ adoptante.getTipo()+"raza: "+adoptante.getRaza()+"sexo: "+adoptante.getSexo()+"fecha : "+fechalocal
                +"Codigo: "+getCodigo();
}
    public String correo(){
        return animaAdoptado.toString();
    }

}
