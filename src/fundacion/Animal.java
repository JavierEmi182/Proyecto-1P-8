/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public class Animal {
    private String fechaIngreso;
    private String nombre;
    private String raza;
    private String sexo;
    private double peso;
    private String observaciones;
    private int edad;
    private int codigo = 0;
    
    //CONSTRUCTORES
    
    public Animal(){}
    
    public Animal(String fechaIngreso, String nombre, String raza, String sexo, double peso, String observaciones, int edad){
        this.fechaIngreso=fechaIngreso;
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        this.peso=peso;
        this.observaciones=observaciones;
        this.edad=edad;
        this.codigo+=1;
    }
    
    //Setters and getters

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    
    
    //Metodos
    public double calcularCostoMes(){
        double costo=0;
        LocalDate hoy= LocalDate.now();
        LocalDate enUnMes= hoy.plusDays(30);
        return costo;        
    }
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", Fecha de ingreso: "+getFechaIngreso()+"\n Raza: "+getRaza()+", Sexo: "+getSexo()+"\n Peso: "+getPeso()+", Edad: "+getEdad()+"\n Observaciones: "+getObservaciones()+"\n Codigo: "+getCodigo();
    }
    
}
