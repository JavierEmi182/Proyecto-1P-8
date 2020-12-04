/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import fundacion.Empleado;
import fundacion.Funcionario;
import fundacion.Fundacion;
import fundacion.Adopcion;
import fundacion.Interesado;
import fundacion.Tamanio;
import fundacion.Veterinaria;
import fundacion.Administrador;
import fundacion.GastoVeterinaria;
import fundacion.Gato;
import fundacion.Perro;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Javier
 */
public class FundacionUI {
    private Scanner sc;
    public static Fundacion fundacionAmigosDeCuatroPatas = new Fundacion();
    //private Funcionario funcionario;
    public FundacionUI(){
        sc= new Scanner(System.in); 
    }
    // para inicializar
    public void inicializarSistema(){
        LocalDate fecha = Fundacion.toLocalDate("28/11/2020");
        LocalDate fecha2 = Fundacion.toLocalDate("02/12/2020");
        
        //Admins
        Empleado administrador = new Administrador ("Juan Leon","Av. de las Américas", "0961212788", "juanleon@gmail.com", LocalDate.now(), 1000, "juanleon123", "J000","123789654"); 
        fundacionAmigosDeCuatroPatas.añadirEmpleado(administrador);
        Administrador admin1 = new Administrador("Stove Jeebs","Cupertino, California, US","(408)606-5775","stovejeebs@hotmail.com",fecha,300,"StoveJ","Apple", "1234567890");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(admin1);
        //Usuario: juanleon123  contraseña: J000
        //Usuario: StoveJ  contraseña: Apple
        
        
        //Funcionario
        Empleado funcionario = new Funcionario ("Maria Alonso","Urdesa","0963547802","mariap@gmail.com",LocalDate.now(),600,"maria123","M000");
        fundacionAmigosDeCuatroPatas.añadirEmpleado(funcionario);
        Funcionario func1 = new Funcionario("Bill Puertas","Lake Washington","(206)709-3400","billpuertas@hotmail.com",fecha, 700,"Bpuertas","Money");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(func1);
        //Usuario: maria123  contraseña: M000
        //Usuario: Bpuertas  contraseña: Money 
         
         //Perros y Gatos
        Perro perro1 = new Perro(fecha, "Kira", "Mestizo", "Hembra", 27,"Tiene cuatro patas, dos ojos",1, Tamanio.MEDIANO);
        Perro perro2 = new Perro(fecha, "Dustin", "Pastor Aleman", "Macho", 36,"Pastor de pelo largo y bastante docil",7, Tamanio.GRANDE);
        Perro perro3 = new Perro(fecha, "Jack", "Fox Terrier", "Macho", 7,"Cariñoso pero temperamentar con otros perros",2, Tamanio.PEQUENIO);
        Perro perro4 = new Perro(fecha, "Tom", "Golden Retriever", "Macho", 27,"Muy cariñoso y jugueton, educado",3, Tamanio.GRANDE);
        
        Gato gato1 = new Gato(fecha, "Nilo","Mestizo","Macho",5.5,"Es gris con blanco",6);
        Gato gato2 = new Gato(fecha, "Lia","Mestizo","Hembra",7,"Es cafe con amarillo",5);
        Gato gato3 = new Gato(fecha, "Arya","Angora","Hembra",6,"Es blanco con negro",4);
        Gato gato4 = new Gato(fecha, "Macarena","Mestizo","Hembra",3.5,"Parece hitler",3);
        
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro1);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro2);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro3);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(perro4);
        
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato1);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato2);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato3);
        FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(gato4);
        //
        //Interesados
        Interesado interesado1 = new Interesado("Ricardo Espinoza","0987654321","Via a la Costa","0917459821","j.e.v.e.ldu@gmail.com","Perro","Golden Retriever","Hembra");
        FundacionUI.fundacionAmigosDeCuatroPatas.registarInteresados(interesado1);
        //interesado1.agregarAdopcion(perro4);
        
        //Adopciones
        Adopcion adop1 = new Adopcion(interesado1,perro4);
        FundacionUI.fundacionAmigosDeCuatroPatas.registrarAdopciones(adop1);
        interesado1.agregarAdopcion(perro4);
        perro4.adoptado();
        
        
        //Veterinaria
        Veterinaria vet1 = new Veterinaria("Pet Health","0987654321","pethealth@hotmail.com");
        FundacionUI.fundacionAmigosDeCuatroPatas.regisrarVeterinaria(vet1);
        
        //GatoVeterinaria
        GastoVeterinaria gastVet1 = new GastoVeterinaria(perro1,fecha, 200,vet1);
        FundacionUI.fundacionAmigosDeCuatroPatas.registrarGastoVeterinaria(gastVet1);
        GastoVeterinaria gastVet2 = new GastoVeterinaria(gato4, fecha2,50,vet1);
        FundacionUI.fundacionAmigosDeCuatroPatas.registrarGastoVeterinaria(gastVet2);
    }
    
    
    
    ///aun a prueba, no se valida correctamente
    // Hay que poner en los contructores this.fundacion = fundacion . NO inicializarlo (fundacion = New Fundacion)
    public void presentarMenuPrincipal() throws IOException{
        String usuario="";
        String contraseña= "";
        System.out.println("***** Bienvenido ***** ");
        Empleado empleado = null;
        do{
            System.out.println("Ingrese su usuario:");
            usuario=sc.nextLine();       
            System.out.println("Ingrese su contraseña:");
            contraseña=sc.nextLine();
            empleado = fundacionAmigosDeCuatroPatas.validarCredenciales(usuario, contraseña);
        }while(empleado == null);
        if (empleado instanceof Administrador){
            Administrador administrador = (Administrador)empleado;
            iniciarAdministrador(administrador);
        }else{
            Funcionario funcionario = (Funcionario)empleado;
            iniciarFuncionario(funcionario);
            
        }
    }
    
        
    public void presentarMenuAdministrador(){
        System.out.println("Bienvenido");
        System.out.println("1. Registrar Empleados.");
        System.out.println("2. Consultar y registrar Veterinarias.");
        System.out.println("3. Consultar y registrar Gastos Veterinaria.");
        System.out.println("4. Calcular presupuesto Mensual.");
        System.out.println("5. Enviar correos a interesados.");
        System.out.println("6. Cerrar sesión.");
        System.out.println("7. Cerrar aplicación.");
    }
    public void iniciarAdministrador(Administrador administrador)throws IOException{
        String entrada="";
        do{
            presentarMenuAdministrador();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    //1. Registrar Empleados.
                    administrador.registrarEmpleado();
                    break;
                case "2":
                    //2. Consultar y registrar Veterinarias.
                    administrador.consultaRegistroVeterinaria();
                    break;
                case "3":
                    //3. Consultar y registrar Gastos Veterinaria.
                    administrador.consultaRegistroGastoVeterinaria();
                    break;
                case "4":
                    //4. Calcular presupuesto Mensual.
                    administrador.calcularPresupuestoMensual();
                    break;
                case "5":
                    //5. Enviar correos a interesados.
                    administrador.enviarMailInteresado();
                    break;
                case "6":
                    System.out.println("Adios");
                    entrada="7";
                    presentarMenuPrincipal();
                  
                    break;
                case "7":
                    System.out.println("Se cerro la aplicacion");
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("7"));
    }
    public void presentarMenuFuncionario(){
        System.out.println("Bienvenido");
        System.out.println("1. Registrar nuevo animal.");
        System.out.println("2. Consultar animales en la fundación");
        System.out.println("3. Registrar interesado adopción.");
        System.out.println("4. Registrar adopción.");
        System.out.println("5. Consultar adopciones.");
        System.out.println("6. Consultar adoptantes.");
        System.out.println("7. Cerrar sesión.");
        System.out.println("8. Cerrar aplicación.");
    }
    
    public void iniciarFuncionario(Funcionario funcionario) throws IOException{
        String entrada="";
        do{
            presentarMenuFuncionario();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    //1. Registrar nuevo animal.
                    funcionario.registrarNuevoAnimal();
                    break;
                case "2":
                    //2. Consultar animales en la fundación
                    funcionario.consultarAnimales();
                    break;
                case "3":
                    //3. Registrar interesado adopción.
                    funcionario.registrarInteresadoAdopcion();
                    break;
                case "4":
                    //4. Registrar adopción.
                    funcionario.registrarAdopcion();
                    break;
                case "5":
                    //5. Consultar adopciones.
                    funcionario.consultarAdopciones();
                    break;
                case "6":
                    //6. Consultar adoptantes.
                    funcionario.consultarRegistrados();
                    break;
                case "7":
                    System.out.println("Adios");
                    entrada="8";
                    presentarMenuPrincipal();
                    break;
                case "8":
                    System.out.println("Se cerro la aplicación");
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("8"));
    }
}
