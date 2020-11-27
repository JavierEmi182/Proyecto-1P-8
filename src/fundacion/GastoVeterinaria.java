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
    public GastoVeterinaria(Animal animal, LocalDate fecha, double monto) {
        this.animal = animal;
        this.fecha = fecha;
        this.monto = monto;
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

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
//Metodos
    @Override
    public String toString() {
        return "GastoVeterinaria" + "animal: " + animal + ", fecha: " + fecha + ", monto: " + monto ;
    }
    
    public void montoTotal(ArrayList<Veterinaria> RegistroVeterinaria){
        
        for(Veterinaria v:RegistroVeterinaria){
            ArrayList<CitaVeterinaria> ArrayCitas= v.getCitas();
            for (CitaVeterinaria c:ArrayCitas){
                double Costo=c.getPrecio();
                monto+=Costo;
            }
        }
    }
    

  
    
    
    
            
}
