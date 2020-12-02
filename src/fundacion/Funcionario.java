/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;


import interfaz.FundacionUI;
import java.io.IOException;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Javier
 */

public class Funcionario extends Empleado{
    
    //AUXILIARES 
    private Animal animal;
    private Interesado interesado;
    private Scanner sc;
    
    public Funcionario(String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena) {
        super( nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        sc = new Scanner(System.in);
    }
    
    public void registrarNuevoAnimal(){//COMPLETA
        String tipo = null;
        do{
        System.out.println("*****Registro de animales*****"); 
        System.out.println("Es gato o perro ? ");
        tipo = sc.nextLine();
        }while(!(tipo.toUpperCase().equals("PERRO") || tipo.toUpperCase().equals("GATO")));
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Raza: ");
        String raza = sc.nextLine();
        String sexo = null;
        System.out.println("Ingrese sexo (MACHO O HEMABRA)");
        sexo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings( sexo, "MACHO", "HEMBRA");
        
        //Otra manera de hacerlo
        /*do{
        System.out.println("Sexo: ");
        sexo = sc.nextLine();
        }while(!(sexo.toUpperCase().equals("MACHO") || sexo.toUpperCase().equals("Hembra")));
        */

        System.out.println("Peso: (KG)");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Observaciones: ");
        String observaciones  = sc.nextLine();
        
        //System.out.println(tipo+"     "+sexo);

        if(tipo.toUpperCase().equals("PERRO")){
            System.out.println("Ingrese tamaño: ");
            String tamanio = "";
            tamanio = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3( tamanio, "GRANDE", "MEDIANO", "PEQUEÑO");
            Tamanio x = Tamanio.valueOf(tamanio.toUpperCase());
            FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(new Perro(nombre, raza, sexo, peso, observaciones, edad, x));
        }else{
           FundacionUI.fundacionAmigosDeCuatroPatas.registroAnimal(new Gato(nombre, raza, sexo, peso, observaciones, edad));  
        }

        
    }
        
    
    public void consultarAnimales(){
        System.out.println("*****Consultar Animales*****");
        System.out.println("Ingrese tipo de Animal (GATO,PERRO O AMBOS)");
        String tipo =  null;
        tipo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3(tipo, "GATO", "PERRO","AMBOS");
        System.out.println("Ingrese sexo animal (MACHO,HEMBRA,AMBOS)");
        String sexo = null;
        sexo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3(sexo, "MACHO","HEMBRA", "AMBOS");
        
        String raza = "TODAS";
        if (!(tipo.toUpperCase().equals("AMBOS"))){
            System.out.println("Ingrese raza del Animal");
            raza = sc.nextLine();
        }

        Collections.reverse(FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales());
        
        for(Animal ani : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales()){
            if(tipo.toUpperCase().equals("PERRO") && ani instanceof Perro){
                Perro perro = (Perro)ani;
                if (sexo.toUpperCase().equals(perro.getSexo())){
                    if(raza.toUpperCase().equals(perro.getRaza())){
                        System.out.println(perro.toString());
                    }
                }else if(sexo.toUpperCase().equals("TODAS")){
                    if(raza.toUpperCase().equals(perro.getRaza())){
                        System.out.println(perro.toString());
                    }
                }
            }else if(tipo.toUpperCase().equals("GATO") && ani instanceof Gato){
                Gato gato = (Gato)ani;
                if (sexo.toUpperCase().equals(gato.getSexo())){
                    if(raza.toUpperCase().equals(gato.getRaza())){
                        System.out.println(gato.toString());
                    }
                }else if(sexo.toUpperCase().equals("TODAS")){
                    if(raza.toUpperCase().equals(gato.getRaza())){
                        System.out.println(gato.toString());
                    }
                }
            }else if(tipo.toUpperCase().equals("AMBOS") && ani instanceof Perro) {
                    Perro perro = (Perro)ani;
                    if (sexo.toUpperCase().equals(perro.getSexo())){
                        System.out.println(perro.toString());
                    }else if(sexo.toUpperCase().equals("AMBOS")){
                        System.out.println(perro.toString());
                    }
            }else if(tipo.toUpperCase().equals("AMBOS") && ani instanceof Gato) {
                    Gato gato = (Gato)ani;
                    if (sexo.toUpperCase().equals(gato.getSexo())){
                        System.out.println(gato.toString());
                    }else if(sexo.toUpperCase().equals("AMBOS")){
                        System.out.println(gato.toString());
                    }            
            }
        }
    }
    
    public void registrarInteresadoAdopcion(){//COMPLETA
        System.out.println("*****Registrar Interesados*****");
        System.out.println("Ingrese Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese ID");
        String id = sc.nextLine();
        System.out.println("Ingrese Direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese Telefono");
        String telefono = sc.nextLine();
        System.out.println("Ingrese Correo Electronico: ");
        String correo = sc.nextLine();
        System.out.println("*****Ingrese sus intereses*****");
        System.out.println("Tipo de Animal: (GATO, PERRO, AMBOS)");
        String tipo = null;
        tipo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3(tipo, "GATO", "PERRO","AMBOS");
        System.out.println("Ingrese sexo animal (MACHO, HEMBRA, AMBOS)");
        String sexo = null;
        sexo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3(sexo, "MACHO","HEMBRA","AMBOS");
        String raza = "TODAS";
        
        //System.out.println(tipo+ "    " +sexo);
        
        if (!(tipo.toUpperCase().equals("AMBOS"))){
            System.out.println("Ingrese raza del Animal");
            raza = sc.nextLine();
        }
        
        
        
        FundacionUI.fundacionAmigosDeCuatroPatas.registarInteresados(new Interesado(nombre,id,direccion,telefono,correo,tipo,raza,sexo));
    }
    
    public void registrarAdopcion() throws IOException{//COMPLETA
        System.out.println("*****Registrar Adopcion*****");
        System.out.println("Ingrese codigo del animal");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese ID de la persona");
        String id = sc.nextLine();
        animal= null;
        
        for(Animal a :FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales()){
            if (a.getCodigo()==codigo){
                System.out.println(a.toString());
                animal = a;
            }
        }
        if(animal == null){    
        System.out.println("Codigo No Existe");
        }
        interesado = null;

        for(Interesado i : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados()){
            if(i.getId().equals(id)){
                System.out.println(i.toString());
                 interesado = i;
                FundacionUI.fundacionAmigosDeCuatroPatas.registrarAdopciones(new Adopcion(interesado, animal));
                JavaMailUtil.SendMail(interesado.getCorreoElectronico(), animal.toString());
                FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales().remove(animal);
            }
        }
        if(interesado == null){    
        System.out.println("Interesado No Existe");
        }
        
        
    }
    
    public void consultarAdopciones(){
        System.out.println("*****Consultar Adopciones*****");
        Collections.reverse(FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones());
        for(Adopcion adopciones : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones()){
        
        }
        System.out.println("Desea ver una adopcion en especifico?");
        String respuesta = null;
        respuesta = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings(respuesta, "SI", "NO");
        if (respuesta.toUpperCase().equals("SI")){
            System.out.println("Ingrese codigo de adopcion: ");
            int codigo = sc.nextInt();
            for(Adopcion adopciones : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones()){
                if (adopciones.getCodigo() == codigo){
                    System.out.println(adopciones.toString());
                    System.out.println(adopciones.getAdoptante().toString());
                }
            }
        }
    }       
    public void consultarRegistrados(){
        System.out.println("Ingrese ID: ");
        String id = sc.nextLine();
        interesado = null;
        int x = 0;
        for (Interesado i :FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados()){
            if(i.getId().equals(id)){
                System.out.println(i.toString());
                x = FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados().indexOf(i);
                interesado = i;
                Adopcion adopcion = null;
                for(Adopcion adop :FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones()){
                    if(adop.getAdoptante()==i){
                        System.out.println(adop.toString());
                        adopcion = adop;
                    }
                }if(adopcion == null){
                    System.out.println("No ha adoptado ningun animal");
                }
            }
        }
        if (interesado==null){
            System.out.println("Interesado No Existe");
        }
        
        System.out.println("Desea actualizar sus datos ? ");
        String actualizacion = null;
        actualizacion = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings(actualizacion, "SI", "NO");
        if(actualizacion.toUpperCase().equals("SI")){
            System.out.println("Actualize Direccion: ");
            String direccion = sc.nextLine();
            interesado.setDireccion(direccion);
            System.out.println("Actualize Correo: ");
            String correo = sc.nextLine();
            interesado.setCorreoElectronico(correo);
            System.out.println("ACtualize Telefono: ");
            String telefono = sc.nextLine();
            interesado.setNumeroTelefono(telefono);
            FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados().set(x, interesado);
        }
       
    }
}
    
    /*
    //metodos
    public void registrarNuevoAnimal(Date fechaIngreso, String nombre, String raza, String sexo, double peso, String observaciones, int edad, Tamanio tamanio){
        if (tamanio!=null){
           Perro p1= new Perro(Date fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad,Tamanio tamanio);
    }   else{
           Gato g1= new Gato(Date fechaIngreso, String nombre,String raza, String sexo, double peso, String observaciones, int edad);
        }
    }*/ 


