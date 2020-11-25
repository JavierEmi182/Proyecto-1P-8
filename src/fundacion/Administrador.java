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
    private Veterinaria veterinaria;
    private GastoVeterinaria gastoVeterinaria;
 
    //Constructor

    public Administrador(String nombre, String direccion, String numeroTelefono, String correoElectronico, String fechaInicio, double sueldo, String usuario, String contrasena,String cuentaBancaria){
        super(nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        this.cuentaBancaria = cuentaBancaria;
        sc = new Scanner(System.in);
        fundacion= new Fundacion();
    }
    
    ///METODOS
    //1. REGISTRAR EMPLEADOS (falta validar que usuario no se encuentre en el arreglo)
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
        
        
        String usuario = "";
        
        /*validar que usuario no se repita
        */
        
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
    //2 CONSULTA Y REGISTRO DE VETERINARIAS(revisar opcion2 )
    public void consultaRegistroVeterinaria(){
        System.out.println("¿Qué desea realizar?:");
        System.out.println("1. Registrar nueva veterinaria");
        System.out.println("2. Visualizar información de veterinarias");
        System.out.println("Ingrese 1/2:");
        String opcion = sc.nextLine();
        
        if(opcion.equals("1")){
            System.out.println("Ingrese nombre de la veterinaria: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese número de contacto: ");
            String contacto = sc.nextLine();
            System.out.println("Ingrese correo electrónico: ");
            String correo = sc.nextLine();
            veterinaria = new Veterinaria (nombre,contacto,correo);
            fundacion.regisrarVeterinaria(veterinaria);
            System.out.println("Registro exitoso");
        }else if (opcion.equals("2")) {
            System.out.println(fundacion.mostrarRegistroVeterinarias());
        }else{
            System.out.println("Opción no encontrada");
        }
    }
    
    //3 CONSULTA Y REGISTRO GASTO VETERINARIA (revisar animal)
    public void consultaRegistroGastoVeterinaria(){
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Consultar gastos de atención médica");
        System.out.println("2. Registrar Gastos Médicos");
        System.out.println("Ingrese 1 / 2 :");
        String opcion = sc.nextLine();
        
        if (opcion.equals("1")){
            System.out.println("Ingrese fecha de atención (DD/MM/AA): ");
            String fecha = sc.nextLine();
            System.out.println("Ingrese nombre del animal atendido: ");
            String animal = sc.nextLine();
           
       
            System.out.println("Ingrese monto incurrido: ");
            double monto = sc.nextDouble();
            sc.nextLine();
            /*
            gastoVeterinaria = new GastoVeterinaria(animal,fecha,monto);*/
        }else if(opcion.equals("2")){
            fundacion.mostrarRegistroGastoVeterinaria();
        }else{
            System.out.println("Opción no encontrada");
        }
    }
    
}
