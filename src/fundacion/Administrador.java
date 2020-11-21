/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;  


/**
 *
 * @author Javier
 */
public class Administrador extends Empleado {
    private Scanner sc;
    private String cuentaBancaria;
    private Fundacion fundacion;
    //Constructor

    public Administrador(String nombre, String direccion, String numeroTelefono, String correoElectronico, String fechaInicio, double sueldo, String usuario, String contrasena,String cuentaBancaria){
        super(nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        this.cuentaBancaria = cuentaBancaria;
        sc = new Scanner(System.in);
        fundacion= new Fundacion();
    }
    
    ///METODOS
    //1. REGISTRAR EMPLEADOS
    public void registrarEmpleado(){
        System.out.println("Ingrese nombre completo de empleado : ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese número de teléfono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese correo electrónico: ");
        String correoElectronico = sc.nextLine();
        System.out.println("Ingrese la fecha(formato dd/mm/aa) en que el empleado empieza a trabajar:");
        String fechaInicio = sc.nextLine();
        System.out.println("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("****  Creación de la cuenta del Empleado  ****");
      
        boolean x = false;
        String usuario = "";
        while(x == false){
            System.out.println("Ingrese usuario: ");
            usuario = sc.nextLine();
            x = fundacion.verificarUsuario(usuario);
            System.out.println("Usuario existente. Ingrese otro");
        }
        System.out.println("Ingrese contraseña: ");
        String contraseña = sc.nextLine();
        System.out.println("¿Desea fijar al empleado como administrado?(si/no)");
        String opcion = sc.nextLine();
        String cuentaBancaria = "";
        Empleado empleado;
        if(opcion.equals("si")){
            System.out.println("Ingrese cuenta bancaria del administrador: ");
            cuentaBancaria = sc.nextLine();
            empleado = new Administrador(nombre,direccion,telefono,correoElectronico,fechaInicio,sueldo,usuario,contraseña,cuentaBancaria);
            
        }else{
            empleado = new Funcionario(nombre,direccion,telefono,correoElectronico,fechaInicio,sueldo,usuario,contraseña);
        
        }
        fundacion.añadirEmpleado(empleado);
        
        
    }
    //2 CONSULTA Y REGISTRO DE VETERINARIOS
    
    
}
