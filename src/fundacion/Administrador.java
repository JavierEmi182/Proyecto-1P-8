/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;


/**
 *
 * @author Javier
 */
public class Administrador extends Empleado {
    private Scanner sc;
    private String cuentaBancaria;
    
    //private Fundacion fundacion;
    
    private GastoVeterinaria gastoVeterinaria;
 
    //Constructor
/*
    public Administrador(String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena,String cuentaBancaria){
        super(nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        this.cuentaBancaria = cuentaBancaria;
        sc = new Scanner(System.in);
      //  fundacion= new Fundacion();
    }*/

    public Administrador( String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena, String cuentaBancaria) {
        super(nombre,direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        sc = new Scanner(System.in);
        this.cuentaBancaria = cuentaBancaria;
       
    }
    
    
    ///METODOS
    //1. REGISTRAR EMPLEADOS (validar que usuario no se encuentre en el arreglo)

    public void registrarEmpleado(){
        System.out.println("Ingrese nombre completo de empleado : ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese número de teléfono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese correo electrónico: ");
        String correoElectronico = sc.nextLine();
        System.out.println("Ingrese la fecha(formato dd/MM/aa) en que el empleado empieza a trabajar:");
        LocalDate fechaInicio = Fundacion.toLocalDate(sc.nextLine());
        System.out.println("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("****  Creación de la cuenta del Empleado  ****");
        String usuario = "";
        boolean opcionusuario = true;
        while(opcionusuario == true){
            System.out.println("Ingrese usuario");
            usuario = sc.nextLine();
            opcionusuario = fundacion.verificarUsuario(usuario);

        }
        System.out.println("Ingrese contraseña: ");
        String contraseña = sc.nextLine();
        
        String opcion;
        String cuentaBancaria = "";
        Empleado empleado;
        boolean x = true;
        while(x==true){
            System.out.println("¿Desea fijar al empleado como administrado?(si/no)");
            opcion = sc.nextLine();
            if(opcion.equals("si")){
            System.out.println("Ingrese cuenta bancaria del administrador: ");
            cuentaBancaria = sc.nextLine();
            empleado = new Administrador(nombre,direccion,telefono,correoElectronico,fechaInicio,sueldo,usuario,contraseña,cuentaBancaria);
            fundacion.añadirEmpleado(empleado);
            x=false;
        }else if (opcion.equals("no")) {
            empleado = new Funcionario(nombre,direccion,telefono,correoElectronico,fechaInicio,sueldo,usuario,contraseña);
            fundacion.añadirEmpleado(empleado);
            x=false;
        }else{
            System.out.println("Respuesta no válida");
        }
        }
    }
    //2 CONSULTA Y REGISTRO DE VETERINARIAS(terminada )
    public void consultaRegistroVeterinaria(){
        System.out.println("¿Qué desea realizar?:");
        System.out.println("1. Registrar nueva veterinaria");
        System.out.println("2. Visualizar información de veterinarias");
        String opcion;
        String nombre;
        String contacto;
        String correo;
        Veterinaria veterinaria;
        boolean condicion = true;
        while(condicion == true){
            System.out.println("Ingrese 1 ó 2:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    System.out.println("Ingrese nombre de la veterinaria: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese número de contacto: ");
                    contacto = sc.nextLine();
                    System.out.println("Ingrese correo electrónico: ");
                    correo = sc.nextLine();
                    veterinaria = new Veterinaria(nombre,contacto,correo);
                    fundacion.regisrarVeterinaria(veterinaria);
                    System.out.println("Registro exitoso");
                    condicion = false;
                    break;
                case "2":
                    System.out.println(fundacion.mostrarRegistroVeterinarias());
                    condicion = false;
                    break;   
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }
        }
      
    }
    
    //3 CONSULTA Y REGISTRO GASTO VETERINARIA (falta lo de enum)
    
    public void consultaRegistroGastoVeterinaria(){
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Consultar gastos de atención médica");
        System.out.println("2. Registrar Gastos Médicos");
        Animal animal;  
        
        boolean condicion = true;
        while(condicion == true){
            System.out.println("Ingrese 1 ó 2 :");
            String opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    condicion = false;
                    break;
                case "2":
                    System.out.println("Ingrese fecha de atencion dd/MM/aaaa:");
                    LocalDate fechaAtencion = Fundacion.toLocalDate(sc.nextLine());
                    System.out.println("Ingrese monto incurrido");
                    double monto = sc.nextDouble();
                    System.out.println("*** Registros de Datos del animal ***");
                    String tipo;
                    do{
                        System.out.println("Ingrese un número de acuerdo al tipo de animal:\n1. Gato \n2. Perro");
                        tipo = sc.nextLine();
                        if (tipo.equals("1") || tipo.equals("2")){
                            break;
                        }else{
                            System.out.println("Ingrese opcion válida");
                        }
                    }while (true);
                    System.out.println("Ingrese nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese raza: ");
                    String raza = sc.nextLine();
                    System.out.println("Ingrese sexo: ");
                    String sexo = sc.nextLine();
                    System.out.println("Ingrese peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese observaciones: ");
                    String observaciones = sc.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = sc.nextInt();
                    switch(tipo){
                        case "1":
                            animal = new Gato(fechaAtencion, nombre, raza, sexo,  peso,  observaciones,  edad);
                            fundacion.registroAnimal(animal);
                            System.out.println("Registro de gasto médico exitoso");
                            break;
                        case "2":
                            System.out.print("Ingrese tamaño del perro: ");
                            String tam = sc.nextLine();
                            Tamanio tamanio = Tamanio.valueOf(tam.toUpperCase());
                            animal = new Perro(fechaAtencion, nombre, raza, sexo,  peso,  observaciones,  edad,tamanio);
                            fundacion.registroAnimal(animal);
                            System.out.println("Registro de gasto médico exitoso");
                            break;
                    }
                    condicion = false;
                    break;

            }
        }
    }
    
    
   
    /*
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Administrador){
                Administrador c = (Administrador)obj;
                return c.getUsuario().equals(c.getUsuario());
            }
        }
        return false;
    }*/
    
}
