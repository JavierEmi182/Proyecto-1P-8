/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import interfaz.FundacionUI;
import fundacion.Administrador;
import fundacion.Empleado;
import fundacion.Funcionario;

import fundacion.Fundacion;
import java.time.LocalDate;
/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*LocalDate date=Fundacion.toLocalDate("21/07/2020");
        Administrador jvadmin= new Administrador( "Javier Vergara" , "via a la costa", "0999999999", "javier@prueba.com", date , 350.00 , "Javier182" , "abc123", "123456789");
        //jvadmin.registrarEmpleado();
        System.out.println(jvadmin);
        
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(jvadmin);
        
        FundacionUI fundui = new FundacionUI();
        fundui.presentarMenuPrincipal();*/
     
        // Lineas para hacer pruebas
        
        /*Fundacion fundacion001 = new Fundacion();
        FundacionUI fundacion = new FundacionUI(fundacion001);
        fundacion001.añadirEmpleado(new Funcionario(fundacion001,"wasd", "wasd", "wasd", "wasd", null, 500, "wasd", "wasd"));
        fundacion.presentarMenuPrincipal();
        
        fundacion001.validarCredenciales("wasd", "wasd");
        System.err.println(fundacion001.validarCredenciales("wasd", "wasd"));*/
        
        
        
        LocalDate fecha = Fundacion.toLocalDate("28/11/2020");
        Funcionario funcionario = new Funcionario("wasd" , "wasd", "wasd", "wasd", fecha, 777, "wasd", "wasd");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(funcionario);
        FundacionUI fundacionUI = new FundacionUI();
        fundacionUI.presentarMenuPrincipal();
        
        }
    }
    

