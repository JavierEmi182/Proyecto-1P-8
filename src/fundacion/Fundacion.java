/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;

import java.io.ObjectStreamConstants;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Fundacion {
    private  ArrayList<Animal> registroAnimales;
    private  ArrayList<Empleado> registroEmpleados;
    private  ArrayList<Interesado> registroInteresados;
    private  ArrayList<Adopcion> registroAdopciones;
    private  ArrayList<GastoVeterinaria> registroGastosVeterinarios;
    private  ArrayList<Veterinaria> registroVeterinaria;
    private Scanner sc;
    
    public Fundacion() {
        registroAnimales = new ArrayList<Animal>();
        registroEmpleados = new ArrayList<Empleado>();
        registroInteresados = new ArrayList<Interesado>();
        registroAdopciones = new ArrayList<Adopcion>();
        registroGastosVeterinarios = new ArrayList<GastoVeterinaria>();
        registroVeterinaria = new ArrayList<Veterinaria>();
        sc = new Scanner(System.in);
    }
    //GETTERS AND SETTERS

    public ArrayList<Animal> getRegistroAnimales() {
        return registroAnimales;
    }

    public ArrayList<Empleado> getRegistroEmpleados() {
        return registroEmpleados;
    }

    public ArrayList<Interesado> getRegistroInteresados() {
        return registroInteresados;
    }

    public ArrayList<Adopcion> getRegistroAdopciones() {
        return registroAdopciones;
    }

    public ArrayList<GastoVeterinaria> getRegistroGastosVeterinarios() {
        return registroGastosVeterinarios;
    }

    public ArrayList<Veterinaria> getRegistroVeterinaria() {
        return registroVeterinaria;
    }

    public void setRegistroAnimales(ArrayList<Animal> registroAnimales) {
        this.registroAnimales = registroAnimales;
    }

    public void setRegistroEmpleados(ArrayList<Empleado> registroEmpleados) {
        this.registroEmpleados = registroEmpleados;
    }

    public void setRegistroInteresados(ArrayList<Interesado> registroInteresados) {
        this.registroInteresados = registroInteresados;
    }

    public void setRegistroAdopciones(ArrayList<Adopcion> registroAdopciones) {
        this.registroAdopciones = registroAdopciones;
    }

    public void setRegistroGastosVeterinarios(ArrayList<GastoVeterinaria> registroGastosVeterinarios) {
        this.registroGastosVeterinarios = registroGastosVeterinarios;
    }

    public void setRegistroVeterinaria(ArrayList<Veterinaria> registroVeterinaria) {
        this.registroVeterinaria = registroVeterinaria;
    }
    
  
    


    //metodo para validar credenciales al inicio del programa 
    public boolean validarCredenciales(String usuario, String contraseña){
        for(Empleado e : registroEmpleados){
            if(e.getUsuario().equals(usuario)){
                if(e.getContrasena().equals(contraseña)){
                    return true;
                }
            }
        }
        return false;
    }
    //metodo para ver si existen usuarios repetidos al momento que el administrador los crea
    public boolean verificarUsuario(String usuario){
        for(Empleado e: registroEmpleados){
            if(!e.getUsuario().equals(usuario)){
                return true;  
            }
        }
        return false;
    }
    //metodo para añadir empleado al Array Empleados
    public void añadirEmpleado(Empleado p){
        registroEmpleados.add(p);
    }
    
    public void registroAnimal(Animal a){
        registroAnimales.add(a);
    }
    
    public void registarInteresados(Interesado inte){
        registroInteresados.add(inte);
    }
    
    public void registrarAdopciones(Adopcion adop){
        registroAdopciones.add(adop);
    }
    
    
    
    public void validacionStrings(String x,String a,String b){
    do{
       x = sc.nextLine();
    }while(!(x.toUpperCase().equals(a) || x.toUpperCase().equals(b)));
    
    }
    
     public void validacionStrings3(String x,String a,String b,String c){
    do{
       x = sc.nextLine();
    }while(!(x.toUpperCase().equals(a) || x.toUpperCase().equals(b) || x.toUpperCase().equals(c)));
    
    }
}
    
    