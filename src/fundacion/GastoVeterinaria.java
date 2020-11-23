/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author user
 */
public class GastoVeterinaria {
    private Animal animal;
    private Date fecha;
    private double monto;

    public GastoVeterinaria(Animal animal, Date fecha, double monto) {
        this.animal = animal;
        this.fecha = fecha;
        this.monto = monto;
    }
   

    public Animal getAnimal() {
        return animal;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "GastoVeterinaria" + "animal: " + animal + ", fecha: " + fecha + ", monto: " + monto ;
    }
    

  
    
    
    
            
}
