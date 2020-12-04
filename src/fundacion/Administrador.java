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
        String contraseña = "";
        boolean opcionusuario = true;
  
        while(true ){
            System.out.println("Ingrese usuario: ");
            usuario = sc.nextLine();
            opcionusuario = FundacionUI.fundacionAmigosDeCuatroPatas.verificarUsuario(usuario);
            if (usuario.equals("")){    
                System.out.println("Usuario no válido");
            }  else if (opcionusuario == true){
                System.out.println("Usuario existente");
            }else{
                break;
            }
        }
        
        while(true){
            System.out.println("Ingrese contraseña: ");
            contraseña = sc.nextLine();
            if (contraseña.equals("")){
                System.out.println("Ingrese una contraseña válida");
            }else{
                break;
            }
        } 
        
        
        String opcion = "";
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
             
                    FundacionUI.fundacionAmigosDeCuatroPatas.regisrarVeterinaria(veterinaria);
                    
                    System.out.println("Registro de Veterinaria exitoso");
                    condicion = false;
                    break;
                case "2":
                    if(FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroVeterinaria().size()>0){
                        for (Veterinaria veterinarias : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroVeterinaria()){
                        System.out.println(veterinarias.toString());
                        }
                    }
                    condicion = false;
                    break;   
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }
        }
      
    }
    // 3 REGISTRO Y CONSULTA DE GASTO VETERINARIA 
    public void consultaRegistroGastoVeterinaria(){
        Animal animal;
        boolean condicion = true;
        GastoVeterinaria gastoVeterinaria ;
        Veterinaria veterinaria;
        int codigoAnimal;
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Registrar Gastos de Atención Médica");
        System.out.println("2. Consultar Gastos de Atención médica");
        System.out.print("Ingrese 1 ó 2: ");
        String opcion = sc.nextLine();
        
        do{
            
            switch(opcion){
                case "1":
                    codigoAnimal = 0;
                    while(true){
                        System.out.println("Ingrese el código del animal atentido: ");
                        codigoAnimal  = sc.nextInt();
                        sc.nextLine();
                        animal = FundacionUI.fundacionAmigosDeCuatroPatas.buscarAnimal(codigoAnimal);
                        if (animal != null){
                            break;
                        }else if(animal == null) {
                            System.out.println("Animal no encontrado");
                        }else if (animal.getDisponible()== false){
                            System.out.println("Este animal ya ha sido adoptado");
                        }
                    }                   
                    System.out.println("Ingrese monto incurrido en el gasto animal");
                    double monto = sc.nextDouble();
                    sc.nextLine();
                    
                    String nombre = "";
                    while(true){
                        System.out.println("Ingrese nombre de la Veterinaria que lo atendió");
                        nombre = sc.nextLine();
                        veterinaria = FundacionUI.fundacionAmigosDeCuatroPatas.buscarVeterinaria(nombre);
                        if (veterinaria ==null){
                            System.out.println("Veterinaria no registrada");
                        }else{
                            break;
                        }
                    }
                    
                    gastoVeterinaria = new GastoVeterinaria(animal,monto,veterinaria);
                    FundacionUI.fundacionAmigosDeCuatroPatas.registrarGastoVeterinaria(gastoVeterinaria);
                    condicion = false;
                    break;
                case "2":
                 
                    while(true){
                        System.out.println("Ingrese el código del animal atentido: ");
                        codigoAnimal  = sc.nextInt();
                        sc.nextLine();
                        animal = FundacionUI.fundacionAmigosDeCuatroPatas.buscarAnimal(codigoAnimal);
                        if (animal != null){
                            break;
                        }else{
                            System.out.println("Animal no encontrado");
                        }
                    } 
                    
                    String consulta = FundacionUI.fundacionAmigosDeCuatroPatas.consultarGastoAnimal(animal);
                    if (consulta!=null){
                        System.out.println(consulta);
                    }else{
                        System.out.println(animal.getNombre()+" no tiene gastos de atención médica registrada");
                    }
                   
                    condicion = false;
                    break;
                default: 
                    System.out.println("Opcion no encontrada");
                    break;
            }                    
        }while(condicion ==true);
        
        
    }
    
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
