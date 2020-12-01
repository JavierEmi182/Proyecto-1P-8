/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import fundacion.Animal;
import fundacion.Empleado;
import fundacion.Funcionario;
import fundacion.Persona;
import fundacion.Fundacion;
import fundacion.Adopcion;

import fundacion.Interesado;
import fundacion.Tamanio;
import fundacion.Veterinaria;
import fundacion.Administrador;
import fundacion.JavaMailUtil;
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
         Empleado administrador = new Administrador ("Juan Leon","Av. de las Américas", "0961212788", "juanleon@gmail.com", LocalDate.now(), 1000, "juanleon123", "J000","123789654"); 
         fundacionAmigosDeCuatroPatas.añadirEmpleado(administrador);
         Empleado funcionario = new Funcionario ("Maria Alonso","Urdesa","0963547802","mariap@gmail.com",LocalDate.now(),600,"maria123","M000");
         fundacionAmigosDeCuatroPatas.añadirEmpleado(funcionario);
    }
    
    
    
    ///aun a prueba, no se valida correctamente
    // Hay que poner en los contructores this.fundacion = fundacion . NO inicializarlo (fundacion = New Fundacion)
    public void presentarMenuPrincipal(){
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
        System.out.println("6. Cerrar Sesión.");
    }
    public void iniciarAdministrador(Administrador administrador){
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
                    
                    break;
                case "6":
                    System.out.println("Adios");
                    
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("6"));
    }
    public void presentarMenuFuncionario(){
        System.out.println("Bienvenido");
        System.out.println("1. Registrar nuevo animal.");
        System.out.println("2. Consultar animales en la fundación");
        System.out.println("3. Registrar interesado adopción.");
        System.out.println("4. Registrar adopción.");
        System.out.println("5. Consultar adopciones.");
        System.out.println("6. Consultar adoptantes.");
        System.out.println("7. Cerrar Sesión.");
    }
    
    public void iniciarFuncionario(Funcionario funcionario){
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
                    
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("7"));
    }
}
