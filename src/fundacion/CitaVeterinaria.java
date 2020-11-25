/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public class CitaVeterinaria {
    private Animal paciente;
    private LocalDate fechaCita;
    private String descripcionCita;
    private double precio=10.00;

    //Constructores
    public CitaVeterinaria(Animal paciente, LocalDate fechaCita, String descripcionCita,double precio){
        this.paciente=paciente;
        this.fechaCita=fechaCita;
        this.descripcionCita=descripcionCita;
        this.precio=precio;
    }
    
    //Getters and Setters

    public Animal getPaciente() {
        return paciente;
    }

    public void setPaciente(Animal paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}