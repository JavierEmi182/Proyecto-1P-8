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
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier
 */

public class Funcionario extends Empleado{
    
    //AUXILIARES 
    private Scanner sc;
    
    //Constructores
    public Funcionario(String nombre, String direccion, String numeroTelefono, String correoElectronico, LocalDate fechaInicio, double sueldo, String usuario, String contrasena) {
        super( nombre, direccion, numeroTelefono, correoElectronico, fechaInicio, sueldo, usuario, contrasena);
        sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
    }
    
    public Funcionario(String nombre, String direccion, String numeroTelefono, String correoElectronico, double sueldo, String usuario, String contrasena) {
        super( nombre, direccion, numeroTelefono, correoElectronico, sueldo, usuario, contrasena);
        sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
    }
    
    //Metodos
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
        System.out.println("Ingrese sexo (MACHO O HEMBRA)");
        sexo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings( sexo, "MACHO", "HEMBRA");
        
        double peso;
        do{System.out.println("Peso (KG) separacion decimal por punto: ");
        while(!sc.hasNextDouble()){
        System.out.println("Ingrese un formato valido");
        sc.next();}
        peso=sc.nextDouble();}while(peso<=0);
        sc.nextLine();        
        
        int edad;
        do{System.out.println("Edad: ");
        while(!sc.hasNextInt()){
        System.out.println("Ingrese un formato valido");
        sc.next();}
        edad=sc.nextInt();}while(edad<=0);
        sc.nextLine();        
        
        System.out.println("Observaciones: ");
        String observaciones  = sc.nextLine();

        if(tipo.toUpperCase().equals("PERRO")){
            System.out.println("Ingrese tamaño: ");
            String tamanio = "";
            tamanio = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings3( tamanio, "GRANDE", "MEDIANO", "PEQUENIO");
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
            System.out.println("Ingrese raza del Animal (Si desea mostrar todas: TODAS)");
            raza = sc.nextLine();
        }

        Collections.reverse(FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales());
        
        for(Animal ani : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAnimales()){
          if (ani.getDisponible()==true){
                           
            if(tipo.toUpperCase().equals("PERRO") && ani instanceof Perro){
                Perro perro = (Perro)ani;
                if (sexo.toUpperCase().equals(perro.getSexo().toUpperCase())){
                    if(raza.toUpperCase().equals(perro.getRaza().toUpperCase())){
                        System.out.println(perro.toString());
                    }else if(raza.toUpperCase().equals("TODAS")){
                        System.out.println(perro.toString());
                    }
                }else if(sexo.toUpperCase().equals("AMBOS")){
                    if(raza.toUpperCase().equals(perro.getRaza().toUpperCase())){
                        System.out.println(perro.toString());
                    }else if(raza.toUpperCase().equals("TODAS")){
                        System.out.println(perro.toString());
                        
                    }
                }
            }else if(tipo.toUpperCase().equals("GATO") && ani instanceof Gato){
                Gato gato = (Gato)ani;
                if (sexo.toUpperCase().equals(gato.getSexo().toUpperCase())){
                    if(raza.toUpperCase().equals(gato.getRaza().toUpperCase())){
                        System.out.println(gato.toString());
                    }else if(raza.toUpperCase().equals("TODAS")){
                        System.out.println(gato.toString());
                    }
                }else if(sexo.toUpperCase().equals("AMBOS")){
                    if(raza.toUpperCase().equals(gato.getRaza().toUpperCase())){
                        System.out.println(gato.toString());
                    }else if(raza.toUpperCase().equals("TODAS")){
                        System.out.println(gato.toString());

                    }
                }
            }else if(tipo.toUpperCase().equals("AMBOS") && ani instanceof Perro) {
                    Perro perro = (Perro)ani;
                    if (sexo.toUpperCase().equals(perro.getSexo().toUpperCase())){
                        System.out.println(perro.toString());
                    }else if(sexo.toUpperCase().equals("AMBOS")){
                        System.out.println(perro.toString());
                    }
            }else if(tipo.toUpperCase().equals("AMBOS") && ani instanceof Gato) {
                    Gato gato = (Gato)ani;
                    if (sexo.toUpperCase().equals(gato.getSexo().toUpperCase())){
                        System.out.println(gato.toString());
                    }else if(sexo.toUpperCase().equals("AMBOS")){
                        System.out.println(gato.toString());
                    }
            }
        }}
    }
    
    public void registrarInteresadoAdopcion(){//COMPLETA
        System.out.println("*****Registrar Interesados*****");
        System.out.println("Ingrese Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese ID: ");
        String id = sc.nextLine();
        System.out.println("Ingrese Direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese Telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese Correo Electronico: ");
        String correo = sc.nextLine();
        System.out.println("*****Ingrese sus intereses*****");
        System.out.println("Tipo de Animal: (GATO, PERRO)");
        String tipo = null;
        tipo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings(tipo, "GATO", "PERRO");
        System.out.println("Ingrese sexo animal: (MACHO, HEMBRA)");
        String sexo = null;
        sexo = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings(sexo, "MACHO","HEMBRA");

            System.out.println("Ingrese raza del Animal: ");
            String raza = sc.nextLine();
                
        Interesado interesado= new Interesado(nombre, id, direccion, telefono,correo,tipo,raza,sexo);
        FundacionUI.fundacionAmigosDeCuatroPatas.registarInteresados(interesado);
    }
    
    public void registrarAdopcion() throws IOException{//COMPLETA
        Animal animal;
        Interesado interesado;
        System.out.println("*****Registrar Adopcion*****");
        
        int codigo;
        do{System.out.println("Ingrese codigo del animal: ");
        while(!sc.hasNextInt()){
        System.out.println("Ingrese un formato valido");
        sc.next();}
        codigo=sc.nextInt();}while(codigo<=0);
        sc.nextLine();
        
        System.out.println("Ingrese ID de la persona: ");
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
                Adopcion adop = new Adopcion(interesado, animal);
                FundacionUI.fundacionAmigosDeCuatroPatas.registrarAdopciones(adop);
                animal.adoptado();
                interesado.agregarAdopcion(animal);
                if (animal instanceof Perro){
                    JavaMailUtil.SendMail(interesado.getCorreoElectronico(), adop.toCorreo());
                }
                else if (animal instanceof Gato){
                    JavaMailUtil.SendMail(interesado.getCorreoElectronico(), adop.toCorreo());
                }
 

            }
        }
        if(interesado == null){    
        System.out.println("Interesado No Existe, Porfavor registrelo ");
        }
        
        
    }

    public void consultarAdopciones(){
        System.out.println("*****Consultar Adopciones*****");
        Collections.reverse(FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones());   
        System.out.println("Desea ver una adopcion en especifico?(si/no)");
        String respuesta = null;
        respuesta = FundacionUI.fundacionAmigosDeCuatroPatas.validacionStrings(respuesta, "SI", "NO");
        if (respuesta.toUpperCase().equals("SI")){
            
            int codigo;
            do{System.out.println("Ingrese codigo de adopcion: ");
            while(!sc.hasNextInt()){
            System.out.println("Ingrese un formato valido");
            sc.next();}
            codigo=sc.nextInt();}while(codigo<=0);
            sc.nextLine();
            

            
              for(Adopcion adopciones : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones()){
                if (adopciones.getCodigo() == codigo){
                    System.out.println(adopciones.toString());

                }
            }
        }else{
            for(Adopcion adopciones : FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroAdopciones()){
                  System.out.println(adopciones.toString());
        }
        }
        
        
    }
    public void consultarRegistrados(){
        for (Interesado i:FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados()){
            System.out.println(i.infoAdoptante());
            System.out.println("\n La persona ha adoptado: "+i.getlistaAdoptados().size()+" animales.");
        }

        Interesado interesado;
        System.out.println("Si desea ver mas información, ingrese el ID: ");
        String id = sc.nextLine();
        interesado = null;
        int x = 0;
        for (Interesado i :FundacionUI.fundacionAmigosDeCuatroPatas.getRegistroInteresados()){
            if(i.getId().equals(id)){
                if (i.getlistaAdoptados().size()>0){
                    System.out.println(i.toStringSinPreferencias());
                    System.out.println("Desea editar los datos? (si/no)");
                    String resp = sc.nextLine();
                    if(resp.toUpperCase().equals("SI")){
                        
                        System.out.println("Nueva direccion: ");
                        String direccion = sc.nextLine();
                        i.setDireccion(direccion);
                        System.out.println("Nuevo telefono:");
                        String telefono = sc.nextLine();
                        i.setNumeroTelefono(telefono);
                        System.out.println("Nuevo correo electronico:");
                        String correo = sc.nextLine();
                        i.setCorreoElectronico(correo);
                        System.out.println("Nueva preferencia de animal que busca: (gato/perro)");
                        String tipo = sc.nextLine();
                        i.setTipo(tipo);
                        System.out.println("Nueva preferencia de la raza del animal que busca:");
                        String raza = sc.nextLine();
                        i.setRaza(raza);
                        System.out.println("Nueva preferencia del sexo del animal que busca: (macho/hembra)");
                        String sexo = sc.nextLine();
                        i.setSexo(sexo);
                        System.out.println("Datos actualizados");
                        
                    }
                    
                }else{
                    
                    
                    System.out.println(i.toStringSinPreferencias());
                    System.out.println("\nNo ha adoptado ningun animal");
                    System.out.println("Desea editar los datos? (si/no)");
                    String resp = sc.nextLine();
                    if(resp.toUpperCase().equals("SI")){
                        
                        System.out.println("Nueva direccion: ");
                        String direccion = sc.nextLine();
                        i.setDireccion(direccion);
                        System.out.println("Nuevo telefono:");
                        String telefono = sc.nextLine();
                        i.setNumeroTelefono(telefono);
                        System.out.println("Nuevo correo electronico:");
                        String correo = sc.nextLine();
                        i.setCorreoElectronico(correo);
                        System.out.println("Nueva preferencia de animal que busca: (gato/perro)");
                        String tipo = sc.nextLine();
                        i.setTipo(tipo);
                        System.out.println("Nueva preferencia de la raza del animal que busca:");
                        String raza = sc.nextLine();
                        i.setRaza(raza);
                        System.out.println("Nueva preferencia del sexo del animal que busca: (macho/hembra)");
                        String sexo = sc.nextLine();
                        i.setSexo(sexo);
                        System.out.println("Datos actualizados");
                        
                    }
                }
            }
       
    }System.out.println("Interesado no existe");
    }}
    



