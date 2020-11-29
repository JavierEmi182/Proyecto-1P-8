/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;


import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    protected  ArrayList<Veterinaria> registroVeterinaria;
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
    
  
    
    //metodo para buscar animal por su codigo
    public Animal buscarAnimal(int codigo){
        if (codigo >0){
            for(Animal a : registroAnimales){
                if (a.getCodigo() == codigo){
                    return a;
                }
            }
        }else{
            System.out.println("Animal no encontrado");
            
        }return null;
    }
    //consultar gastos medicos de un animal
    public String consultarGastoAnimal(Animal a ){
        if (a!= null){
            for(GastoVeterinaria g: registroGastosVeterinarios){
                if(g.getAnimal().getCodigo() == a.getCodigo()){
                    return g.toString();
                }
            }
        }return null;
    }
    


    //metodo para validar credenciales al inicio del programa 
    public Empleado validarCredenciales(String usuario1, String contrasena1){
        if ( usuario1!=null && contrasena1!=null){
            for(Empleado empleado : registroEmpleados){
               if(empleado.getUsuario().equals(usuario1) && empleado.getContrasena().equals(contrasena1) ){
                   System.out.println("Credenciales válidas");
                   return empleado;          
               }else{
                   System.out.println("Credenciales inválidas. Vuelva a ingresar.");
                   return null;
               } 
            }
        }  
        return null;
    }
    //metodo para ver si existen usuarios repetidos al momento que el administrador los crea
    public boolean verificarUsuario(String usuario){
        for(Empleado e: registroEmpleados){
            if(e.getUsuario().equals(usuario)){
                return true;  
            }
            
        }return false;
    }
    //metodo para añadir empleado 
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
    public void regisrarVeterinaria(Veterinaria vet){
        if (vet != null){
            registroVeterinaria.add(vet);
        }
    }
    public String mostrarRegistroVeterinarias(){
        if (registroVeterinaria.size()>0){
            for (Veterinaria vet: registroVeterinaria){
            return vet.toString();
            }
        }
        return null;
    }
        
    public void registrarGastoVeterinaria(GastoVeterinaria gasto){
        registroGastosVeterinarios.add(gasto);
    }
    
    public String mostrarRegistroGastoVeterinaria(){
        if (registroGastosVeterinarios.size()>0){
            for(GastoVeterinaria gasto: registroGastosVeterinarios){
                  return gasto.toString();
            } 
        }
        return null;
         
    }
    public double calcularGastosAdministrativos(){
        double monto = 0;
        if(registroEmpleados.size()>0){
            for(Empleado e: registroEmpleados){
            monto += e.getSueldo();
            }
        }
        return monto+150;
    }
    
    public double calcularGastosPerros(){
        double monto =0;
        if(registroAnimales.size()>0){
            for(Animal a : registroAnimales){
                if(a instanceof Perro){
                    monto+=a.calcularCostoMes();
                }
            }
        }
            
        return monto;
    }
    public double calcularGastosGatos(){
        double monto=0;
        if(registroAnimales.size()>0){
            for(Animal a : registroAnimales){
                if(a instanceof Gato){
                    monto+=a.calcularCostoMes();
                }
            }
        }
        return monto;
    }
    
    public double calcularGastosVeterinariosMes(){
        String mesConsulta= LocalDate.now().getMonth().toString();
        String mes = "";
        double monto=0;
        if(registroGastosVeterinarios.size()>0){
            for(GastoVeterinaria g: registroGastosVeterinarios){
                 mes=g.getFecha().getMonth().toString();
                 if(mesConsulta.equals(mes)){
                     monto+= g.getMonto();
                 }
            }
        }
        return monto;
    }
    
    
    
    
    
    public static LocalDate toLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        //String date = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate ;
    }

    
    public String validacionStrings(String x,String a,String b){
    do{
       x = sc.nextLine();
    }while(!(x.toUpperCase().equals(a) || x.toUpperCase().equals(b)));
    return x;
    }
    
     public String validacionStrings3(String x,String a,String b,String c){
    do{
       x = sc.nextLine();
    }while(!(x.toUpperCase().equals(a) || x.toUpperCase().equals(b) || x.toUpperCase().equals(c)));
    return x;
    }
}
    
    