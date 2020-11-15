/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import fundacion.Animal;
import fundacion.Persona;
import fundacion.Usuario;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class FundacionUI {
    private Scanner sc;
    
    public FundacionUI(){
        sc= new Scanner(System.in);
    }
    
    
    public void presentarMenuPrincipal(){
        String usuario="";
        String contraseña= "";
        
        System.out.println("Bienvenido ");
        System.out.println("Ingrese su usario:");
        usuario=sc.nextLine();       
        System.out.println("Ingrese su contraseña:");
        contraseña=sc.nextLine();
    }
}
