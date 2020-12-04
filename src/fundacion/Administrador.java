/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;
import interfaz.FundacionUI;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Javier
 */
public class Administrador extends Empleado {
    private Scanner sc;
    private String cuentaBancaria;
    
    //Constructores
    
    public Administrador( String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena, String cuentaBancaria) {
        super(nombre,direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        sc = new Scanner(System.in);
        this.cuentaBancaria = cuentaBancaria;
       
    }
    public Administrador( String nombre, String direccion, String numeroTelefono, String correoElectronico, double sueldo, String usuario, String contrasena, String cuentaBancaria) {
        super(nombre,direccion, numeroTelefono, correoElectronico, sueldo, usuario, contrasena);   
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
        System.out.println("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("****  Creación de la cuenta del Empleado  ****");
        String usuario = "";
        boolean opcionusuario = true;
        while(opcionusuario == true){
            System.out.println("Ingrese usuario: ");
            usuario = sc.nextLine();
            opcionusuario = FundacionUI.fundacionAmigosDeCuatroPatas.verificarUsuario(usuario);
            System.out.println("Usuario existente");
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
            empleado = new Administrador(nombre,direccion,telefono,correoElectronico,sueldo,usuario,contraseña,cuentaBancaria);
            FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(empleado);
            
            x=false;
        }else if (opcion.equals("no")) {
            empleado = new Funcionario(nombre,direccion,telefono,correoElectronico,sueldo,usuario,contraseña);
            FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(empleado);
            x=false;
        }else{
            System.out.println("Respuesta no válida");
        }
        }System.out.println("Empleado registrado exitosamente");
    }
    //2 CONSULTA Y REGISTRO DE VETERINARIAS(terminada )
    public void consultaRegistroVeterinaria(){
        System.out.println("¿Qué desea realizar?:");
        System.out.println("1. Registrar nueva veterinaria");
        System.out.println("2. Visualizar información de Veterinarias Registradas");
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
                    System.out.println(veterinaria);
                    FundacionUI.fundacionAmigosDeCuatroPatas.regisrarVeterinaria(veterinaria);
                    
                    System.out.println("Registro de Veterinaria exitoso");
                    condicion = false;
                    break;
                case "2":
                    System.out.println(FundacionUI.fundacionAmigosDeCuatroPatas.mostrarRegistroVeterinarias());
                    condicion = false;
                    break;   
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }
        }
      
    }
    // 3 REGISTRO Y CONSULTA DE GASTO VETERINARIA falta validar animall vacio
    public void consultaRegistroGastoVeterinaria(){
        Animal animal;
        boolean condicion = true;
        GastoVeterinaria gastoVeterinaria ;
        Veterinaria veterinaria;
        int codigoAnimal;
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Registrar Gastos de Atención Médica");
        System.out.println("2. Consultar Gastos de atención médica");
        System.out.print("Ingrese 1 ó 2: ");
        String opcion = sc.nextLine();
        
        do{
            
            switch(opcion){
                case "1":
                    System.out.println("Ingrese el código del animal atentido: ");
                    codigoAnimal = sc.nextInt();
                    sc.nextLine();
                   // FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroGastosVeterinarios().add(codigoAnimal, gastoVeterinaria);
                    animal = FundacionUI.fundacionAmigosDeCuatroPatas.buscarAnimal(codigoAnimal);
                    System.out.println("Ingrese monto incurrido en el gasto animal");
                    double monto = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese nombre de la Veterinaria que lo atendió");
                    String nombre = sc.nextLine();
                    veterinaria = FundacionUI.fundacionAmigosDeCuatroPatas.buscarVeterinaria(nombre);
                    gastoVeterinaria = new GastoVeterinaria(animal,monto,veterinaria);
                    FundacionUI.fundacionAmigosDeCuatroPatas.registrarGastoVeterinaria(gastoVeterinaria);
                    condicion = false;
                    break;
                case "2":
                    System.out.println("Ingrese el código del animal que desea consultar gasto médico");
                    codigoAnimal = sc.nextInt();
                    sc.nextLine();
                    animal = FundacionUI.fundacionAmigosDeCuatroPatas.buscarAnimal(codigoAnimal);
                    if (animal!=null){
                        System.out.println(FundacionUI.fundacionAmigosDeCuatroPatas.consultarGastoAnimal(animal));
                    }else{
                        System.out.println("Animal no econtrado");
                    }
                    condicion = false;
                    break;
                default: 
                    System.out.println("Opcion no encontrada");
                    break;
            }                    
        }while(condicion ==true);
        
        
    }
    
    //3 CONSULTA Y REGISTRO GASTO VETERINARIA (terminada)
    /*
    public void consultaRegistroGastoVeterinaria(){
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Registrar Gastos Médicos");
        System.out.println("2. Consultar gastos de atención médica");
        
        Animal animal;  
        boolean condicion = true;
        while(condicion == true){
            System.out.println("Ingrese 1 ó 2 :");
            String opcion = sc.nextLine();
            switch(opcion){
                case "2":///consultar gastos
                    do{
                        System.out.println("Ingrese código del animal que desea consultar: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();
                        Animal animalBuscado = FundacionUI.fundacionAmigosDeCuatroPatas.buscarAnimal(codigo);
                        if(animalBuscado == null){
                        System.out.println("No se ha encontrado animal con ese código");  
                        }else{
                        System.out.println(FundacionUI.fundacionAmigosDeCuatroPatas.consultarGastoAnimal(animalBuscado));
                        break;
                        
                        }
                    }while(true);
                    condicion = false;
                    break;
                case "1":
                    LocalDate fechaAtencion = LocalDate.now();
                    System.out.println("Ingrese monto incurrido");
                    double monto = sc.nextDouble();
                    sc.nextLine();
                    
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
                    sc.nextLine();
                    switch(tipo){
                        case "1":
                            animal = new Gato(fechaAtencion, nombre, raza, sexo,  peso,  observaciones,  edad);
                            FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(animal);
                            System.out.println("Registro de gasto médico exitoso");
                            break;
                        case "2":
                            String tam = "";
                            Tamanio tamanio;
                            do{
                                System.out.print("Ingrese tamaño del perro: ");
                                tam = sc.nextLine().toUpperCase();
                                if (tam.equals("GRANDE")|| tam.equals("MEDIANO") || tam.equals("PEQUEÑO")){
                                    tamanio = Tamanio.valueOf(tam);
                                    break;
                                }else{
                                    System.out.println("Tamanio no identificado");
                                }
                            }while(true);
   
                            animal = new Perro(fechaAtencion, nombre, raza, sexo,  peso,  observaciones,  edad,tamanio);
                            FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(animal);
                            System.out.println("Registro de gasto médico exitoso");
                            break;
                    }
                    condicion = false;
                    break;

            }
        }
    }*/
    //TERMINADA
    public double calcularPresupuestoMensual(){
        double gastoAdministrativos = FundacionUI.fundacionAmigosDeCuatroPatas.calcularGastosAdministrativos();
        double gastosPerro = FundacionUI.fundacionAmigosDeCuatroPatas.calcularGastosPerros();
        double gastosGato = FundacionUI.fundacionAmigosDeCuatroPatas.calcularGastosGatos();
        double gastoVeterinaria = FundacionUI.fundacionAmigosDeCuatroPatas.calcularGastosVeterinariosMes();
        double total = gastoAdministrativos+gastosPerro+gastosGato+gastoVeterinaria;
        System.out.println(" *** Presupuesto Mensual de la Fundacion ***");
        System.out.println("Total de Gastos Administrativos: "+gastoAdministrativos+"\n"+"Total Gastos en Gatos: "+gastosGato+"\n"+"Total Gastos en Perro: "+gastosPerro+"\n"+"Total Gastos de Veterinaria del mes: "+gastoVeterinaria);
        System.out.println("Estimado total: "+total);
        return total;
    }
    
    public void enviarMailInteresado() throws IOException{
        ArrayList<Animal> registroAnimal= FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales();
        ArrayList<Interesado> registroInteresado = FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados();
     
        String cuerpo;
        if(registroAnimal.size()>0){
            if(registroInteresado.size()>0){
                for(Animal animal : registroAnimal){
                    if(animal.getDisponible()==true){
                                            
                    for(Interesado interesado: registroInteresado){
                        if (animal.getRaza().toUpperCase().equals(interesado.getRaza().toUpperCase()) && animal.getSexo().toUpperCase().equals(interesado.getSexo().toUpperCase())){
                            cuerpo = "Saludos "+interesado.getNombre()+",<br>"+"Acabamos de recibir un animal acorde a sus preferencias; a continuación dejamos los datos del mismo: <br>"+animal.toCorreo();
                            JavaMailUtil.SendMail(interesado.getCorreoElectronico(),cuerpo);
                        }
                    }
                }}
            }
        }
    }
   
}
