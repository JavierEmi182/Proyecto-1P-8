/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author user
 */
public class GastoVeterinaria {
    private Veterinaria veterinaria;
    private Animal animal;
    private LocalDate fecha;
    private double monto;
//Constructores
    public GastoVeterinaria(Animal animal, LocalDate fecha, double monto,Veterinaria vet) {
        this.animal = animal;
        this.fecha = fecha;
        this.monto = monto;
        veterinaria = vet;
    }
    public GastoVeterinaria(Animal animal, double monto, Veterinaria vet){
        this.animal = animal;
        this.monto = monto;
        veterinaria = vet;
        fecha = LocalDate.now();
    }
   //Getters and Setters

    public Animal getAnimal() {
        return animal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }
    public Veterinaria getVeterinaria(){
        return veterinaria;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setVeterinaria(Veterinaria vet){
        veterinaria = vet;
    }
//Metodos
    @Override
    public String toString() {
        return "***Gastos de Veterinaria***\n" + "Animal: " + animal + ", Fecha: " + fecha + "\nMonto: " + monto +"\n"+veterinaria;
    }
    

    

  
    
    
    
            
}
