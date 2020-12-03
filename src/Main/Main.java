/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import interfaz.FundacionUI;
import fundacion.Administrador;
import fundacion.Adopcion;
import fundacion.Animal;
import fundacion.Empleado;
import fundacion.Funcionario;

import fundacion.Fundacion;
import fundacion.Gato;
import fundacion.Interesado;
import fundacion.Perro;
import fundacion.Tamanio;
import java.io.IOException;
import java.time.LocalDate;
/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*LocalDate date=Fundacion.toLocalDate("21/07/2020");
        Administrador jvadmin= new Administrador( "Javier Vergara" , "via a la costa", "0999999999", "javier@prueba.com", date , 350.00 , "Javier182" , "abc123", "123456789");
        //jvadmin.registrarEmpleado();
        System.out.println(jvadmin);
        
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(jvadmin);
        
        FundacionUI fundui = new FundacionUI();
        fundui.presentarMenuPrincipal();*/
     
        // Lineas para hacer pruebas
        
        /*Fundacion fundacion001 = new Fundacion();
        FundacionUI fundacion = new FundacionUI(fundacion001);
        fundacion001.añadirEmpleado(new Funcionario(fundacion001,"wasd", "wasd", "wasd", "wasd", null, 500, "wasd", "wasd"));
        fundacion.presentarMenuPrincipal();
        
        fundacion001.validarCredenciales("wasd", "wasd");
        System.err.println(fundacion001.validarCredenciales("wasd", "wasd"));*/
        
        //Constructor Funcionario
        //String nombre, String direccion, String numeroTelefono, String correoElectronico, 
        //LocalDate fechaInicio, double sueldo, String usuario, String contrasena
        
        //Constructor Administrador
        //String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, 
        //double sueldo, String usuario, String contrasena, String cuentaBancaria
        LocalDate fecha = Fundacion.toLocalDate("28/11/2020");
        Administrador admin1 = new Administrador("Stove Jeebs","Cupertino, California, US","(408)606-5775","stovejeebs@hotmail.com",fecha,300,"StoveJ","Apple", "1234567890");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(admin1);
        //Usuario StoveJ   Contraseña Apple
        Funcionario func1 = new Funcionario("Bill Puertas","Lake Washington","(206)709-3400","billpuertas@hotmail.com",fecha, 700,"Bpuertas","Money");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(func1);
        System.out.println(func1);
        //Usuario BPuertas   Constraseña Money
        
        //Constructor Perro
        //LocalDate fechaIngreso, String nombre,String raza, String sexo, 
        //double peso, String observaciones, int edad,Tamanio tamanio
        //Perro perro1 = new Perro(fecha, "Kira", "Mestizo", "Hembra", 27,"Tiene cuatro patas, dos ojos",1, Tamanio.MEDIANO);
        //Perro perro2 = new Perro(fecha, "Dustin", "Pastor Aleman", "Macho", 36,"Pastor de pelo largo y bastante docil",7, Tamanio.GRANDE);
        //Perro perro3 = new Perro(fecha, "Jack", "Fox Terrier", "Macho", 7,"Cariñoso pero temperamentar con otros perros",2, Tamanio.PEQUEÑO);
        //Perro perro4 = new Perro(fecha, "Tom", "Golden Retriever", "Macho", 27,"Muy cariñoso y jugueton, educado",3, Tamanio.GRANDE);
        
        
        //Constructor Gato
        //LocalDate fechaIngreso, String nombre,String raza, String sexo,
        //double peso, String observaciones, int edad
        
        //Gato gato1 = new Gato(fecha, "Nilo","Mestizo","Macho",5.5,"Es gris con blanco",6);
        //Gato gato2 = new Gato(fecha, "Lia","Mestizo","Hembra",7,"Es cafe con amarillo",5);
        //Gato gato3 = new Gato(fecha, "Arya","Angora","Hembra",6,"Es blanco con negro",4);
        //Gato gato4 = new Gato(fecha, "Macarena","Mestizo","Hembra",3.5,"Parece hitler",3);
        
        //Añadir a su registro registroAnimales
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro1);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro2);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro3);
        
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato1);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato2);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato3);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato4);
        
        //Constructor Interesado
        //String nombre, String id, String direccion, String numerTelefono, 
        //String correoElectronico, String tipo,String raza,String sexo
        //Interesado interesado1 = new Interesado("Ricardo Espinoza","0925543210","Via a la Costa","0917459821","j.e.v.e.ldu@gmail.com","Perro","Golden Retriever","Hembra");
        
        //FundacionUI.fundacionAmigosDeCuatroPatas.registarInteresados(interesado1);
        //interesado1.agregarAdopcion(perro4);
        
        //Constructor Adopciones
        //Interesado adoptante, Animal animaAdoptado
        //Adopcion adop1 = new Adopcion(interesado1,perro4);
        //FundacionUI.fundacionAmigosDeCuatroPatas.registrarAdopciones(adop1);
        
        //Funcionario funcionario = new Funcionario("wasd" , "wasd", "wasd", "wasd", fecha, 777, "wasd", "wasd");
        //FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(funcionario);
        FundacionUI fundacionUI = new FundacionUI();
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(new Perro("wasd", "wasd", "MACHO", 5, "", 5, Tamanio.GRANDE));
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(new Perro("XYZ", "wasd", "MACHO", 5, "", 5, Tamanio.GRANDE));
        //FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(new Gato("XYZ", "wasd", "MACHO", 5, "", 5));
        fundacionUI.presentarMenuPrincipal();
        
        }
    }
    

