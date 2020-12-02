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
public class Perro extends Animal{
    private Tamanio tamanio;
    
    //Constructores
    public Perro( LocalDate fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad,Tamanio tamanio){
        super(fechaIngreso, nombre,raza, sexo, peso, observaciones,edad);
        this.tamanio=tamanio;
    }
    public Perro( String nombre,String raza, String sexo, double peso, String observaciones, int edad,Tamanio tamanio){
        super(nombre,raza, sexo, peso, observaciones,edad);
        this.tamanio=tamanio;
    }
    
    //Gettes and Setters
    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    //Metodos
    @Override
    public double calcularCostoMes(){
        double costoKilo;
        double kilosMes;
        double costoPaseos=1.00;
        @SuppressWarnings("UnusedAssignment")
        double costoFinal=0;
        
        if (tamanio!=null){
            switch(tamanio){
                case GRANDE:
                    costoKilo=4;
                    kilosMes=10;
                    costoFinal= (costoKilo*kilosMes) + costoPaseos;
                    break;
                case MEDIANO:
                    costoKilo=5;
                    kilosMes=6;
                    costoFinal=(costoKilo*kilosMes)+costoPaseos;
                    break;
                case PEQUEÑO:
                    costoKilo=5;
                    kilosMes=4;
                    costoFinal=(costoKilo*kilosMes)+costoPaseos;
                    break;
                default:
                    return -1;   
            }
            return costoFinal;
        }return -1;
        
        /**if (tamanio.equals(tamanio.GRANDE)){
            costoKilo=4;
            kilosMes=10;
            double costoFinal= (costoKilo*kilosMes) + costoPaseos;
            return super.calcularCostoMes()+costoFinal;}
        else if(tamanio.equals(tamanio.MEDIANO)){
            costoKilo=5;
            kilosMes=6;
            double costoFinal=(costoKilo*kilosMes)+costoPaseos;
            return super.calcularCostoMes()+costoFinal;
                    }
        else{
            costoKilo=5;
            kilosMes=4;
            double costoFinal=(costoKilo*kilosMes)+costoPaseos;
            return super.calcularCostoMes()+costoFinal;
        }
    */
    
   
}
    @Override
    public String toString(){
        return "\n*****PERRO*****\n"+" Fecha de ingreso: "+getFechaIngreso()+", Nombre: "+getNombre()+"\n Raza: "+getRaza()
                +", Sexo: "+getSexo()+"\n Peso: "+getPeso()+", Edad: "+getEdad()+"\n Observaciones: "
                +getObservaciones()+", Tamaño: "+getTamanio()+"\n Codigo: "+getCodigo();
    }
}
