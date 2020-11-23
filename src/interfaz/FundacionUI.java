/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import fundacion.Animal;
import fundacion.Persona;
import fundacion.Fundacion;
import java.util.Scanner;


/**
 *
 * @author Javier
 */
public class FundacionUI {
    private Scanner sc;
    private Fundacion fundacion;
    public FundacionUI(){
        sc= new Scanner(System.in);
        fundacion = new Fundacion(); 
    }
    
    ///aun a prueba, no se valida correctamente
    
    public void presentarMenuPrincipal(){
        String usuario="";
        String contraseña= "";
        System.out.println("*****Bienvenido***** ");
        do{
            System.out.println("Ingrese su usuario:");
            usuario=sc.nextLine();       
            System.out.println("Ingrese su contraseña:");
            contraseña=sc.nextLine();
            if (fundacion.validarCredenciales(usuario, contraseña) == true){
                break;
            }
        }while(true);
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
    public void iniciarAdministrador(){
        String entrada="";
        do{
            presentarMenuAdministrador();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    //1. Registrar Empleados.
                    
                    break;
                case "2":
                    //2. Consultar y registrar Veterinarias.
                    break;
                case "3":
                    //3. Consultar y registrar Gastos Veterinaria.
                    
                    break;
                case "4":
                    //4. Calcular presupuesto Mensual.
                    
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
    
    public void iniciarFuncionario(){
        String entrada="";
        do{
            presentarMenuFuncionario();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    //1. Registrar nuevo animal.
                    
                    break;
                case "2":
                    //2. Consultar animales en la fundación
                    break;
                case "3":
                    //3. Registrar interesado adopción.
                    
                    break;
                case "4":
                    //4. Registrar adopción.
                    
                    break;
                case "5":
                    //5. Consultar adopciones.
                    
                    break;
                case "6":
                    //6. Consultar adoptantes.
                    
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
