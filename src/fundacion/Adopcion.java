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
    private LocalDate fechaAdopcion;
    private Interesado adoptante;
    private  Animal animalAdoptado;
    private int codigo;
    private static int codigostaticadopcion = 0;

    public Adopcion (Interesado adoptante, Animal animaAdoptado) {
        fechaAdopcion = LocalDate.now();
        this.adoptante = adoptante;
        this.animalAdoptado = animaAdoptado;
        codigostaticadopcion+=1;
        this.codigo=codigostaticadopcion;
    }

    public LocalDate getFecha() {
        return fechaAdopcion;
    }

    public void setFecha(String fecha) {
        fechaAdopcion = Fundacion.toLocalDate(fecha);;
    }

    public Interesado getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Interesado adoptante) {
        this.adoptante = adoptante;
    }

    public Animal getAnimaAdoptado() {
        return animalAdoptado;
    }

    public void setAnimaAdoptado(Animal animaAdoptado) {
        this.animalAdoptado = animaAdoptado;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
        return "Fecha de la adopcion: "+ getFecha()+"\n ***ADOPTANTE*** \n: "+adoptante.toStringSinPreferencias()+"\n ***ANIMAL*** "+animalAdoptado.toString()+
                "\n Codigo de la adopción: "+getCodigo();
}
    public String toCorreo(){
        return "Fecha de la adopcion: "+ getFecha()+"<br> <b> ***ADOPTANTE***</b> <br> "+adoptante.presentarInfo()
                +"<br> <b> ***ANIMAL***</b> <br>: "+animalAdoptado.toCorreo()+
                "<br> Codigo de la adopción: "+getCodigo();
}
    

}
