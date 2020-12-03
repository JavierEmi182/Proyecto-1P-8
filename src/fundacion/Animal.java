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
public abstract class Animal{
    private LocalDate fechaIngreso;
    private String nombre;
    private String raza;
    private String sexo;
    private double peso;
    private String observaciones;
    private int edad;
    private int codigo;
    private static int codigostatic = 0;
    
    
    //CONSTRUCTORES
    
    public Animal(){}
    
    public Animal(LocalDate fecha, String nombre, String raza, String sexo, double peso, String observaciones, int edad){
        this.fechaIngreso=fecha;
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        this.peso=peso;
        this.observaciones=observaciones;
        this.edad=edad;
        codigostatic+=1;
        this.codigo=codigostatic;
    }
    
    public Animal(String nombre, String raza, String sexo, double peso, String observaciones, int edad){
        this.fechaIngreso=LocalDate.now();
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        this.peso=peso;
        this.observaciones=observaciones;
        this.edad=edad;
        codigostatic+=1;
        this.codigo=codigostatic;
    }
    
    //Setters and getters

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fecha) {
       fechaIngreso = Fundacion.toLocalDate(fecha);
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
    public abstract double  calcularCostoMes();
            
    
    @Override
    public String toString(){ 
        return " Fecha de ingreso: "+getFechaIngreso()+" Nombre: "+getNombre()+"\n Raza: "+getRaza()
                +", Sexo: "+getSexo()+"\n Peso: "+getPeso()+", Edad: "+getEdad()+"\n Observaciones: "
                +getObservaciones()+"\n Codigo del Animal: "+getCodigo();
    }
    
    public abstract String toCorreo();
    
}
