/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Funcionario extends Empleado{
    private Fundacion fundacion;
    private Animal animal;
    private Scanner sc;
    private ArrayList<Animal> auxiliar;
    public Funcionario(String nombre, String direccion, String numeroTelefono, String correoElectronico, String fechaInicio, double sueldo, String usuario, String contrasena) {
        super(nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        fundacion = new Fundacion();
        sc = new Scanner(System.in);
    }
    
    public void registrarNuevoAnimal(){
        String tipo;
        do{
        System.out.println("*****Registro de animales*****"); 
        System.out.println("Es gato o perro ? ");
        tipo = sc.nextLine();
        }while(!(tipo.toUpperCase().equals("PERRO") || tipo.toUpperCase().equals("GATO")));
        Date fecha = new Date();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Raza: ");
        String raza = sc.nextLine();
        String sexo = null;
        
        /*do{
        System.out.println("Sexo: ");
        sexo = sc.nextLine();
        }while(!(sexo.toUpperCase().equals("MACHO") || sexo.toUpperCase().equals("Hembra")));
        */
        
        // Falta probarla 
        fundacion.validacionStrings( sexo, "MACHO", "HEMBRA");
        
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Observaciones: ");
        String observaciones  = sc.nextLine();

        if(tipo.toUpperCase().equals("PERRO")){
            System.out.println("Ingrese tamaño: ");
            String tamanio = sc.nextLine();
            Tamanio x = Tamanio.valueOf(tamanio.toUpperCase());
            fundacion.registroAnimal(new Perro(fecha, nombre, raza, sexo, peso, observaciones, edad, x));
        }

        fundacion.registroAnimal(new Gato(fecha, nombre, raza, sexo, peso, observaciones, edad));
    }
        
    
    public void consultarAnimales(){
        System.out.println("*****Consultar Animales*****");
        System.out.println("Ingrese tipo de Animal");
        String tipo = null;
        fundacion.validacionStrings3(tipo, "GATO", "PERRO","TODO");
        System.out.println("Ingrese sexo animal");
        String sexo = null;
        fundacion.validacionStrings3(sexo, "MACHO","HEMBRA", "TODO");
        System.out.println("Ingrese raza del Animal");
        String raza = sc.nextLine();
        
        auxiliar = fundacion.getRegistroAnimales();
        
        for (Animal c : auxiliar){
            
        }
            
    }
    
    
    
    }
    
    
    /*
    //metodos
    public void registrarNuevoAnimal(Date fechaIngreso, String nombre, String raza, String sexo, double peso, String observaciones, int edad, Tamanio tamanio){
        if (tamanio!=null){
           Perro p1= new Perro(Date fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad,Tamanio tamanio);
    }   else{
           Gato g1= new Gato(Date fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad);
        }
    }*/ 


