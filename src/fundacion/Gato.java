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
public class Gato extends Animal{
    //Constructores
    public Gato(LocalDate fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad){
        super(fechaIngreso, nombre,raza, sexo, peso, observaciones,edad);
    }
    
    //Metodos
    @Override
    public double calcularCostoMes(){
        double costoKilo;
        double kilosMes=2.5;
        int edad= getEdad();
        double costoFinal=0;
        if (edad<8){
            costoKilo=3;
            costoFinal=costoKilo*kilosMes;
            return costoFinal;
        }
        else{
            costoKilo=5;
            costoFinal=costoKilo*kilosMes;
            return costoFinal;
        }
    }
}
