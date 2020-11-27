/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1p.pkg8;
import fundacion.Funcionario;
import interfaz.FundacionUI;

import fundacion.Fundacion;
/**
 *
 * @author Javier
 */
public class Proyecto1P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        // Lineas para hacer pruebas
        Fundacion fundacion001 = new Fundacion();
        FundacionUI fundacion = new FundacionUI(fundacion001);
        fundacion001.añadirEmpleado(new Funcionario("wasd", "wasd", "wasd", "wasd", null, 500, "wasd", "wasd"));
        fundacion.presentarMenuPrincipal();
        //fundacion001.validarCredenciales("wasd", "wasd");
        //System.err.println(fundacion001.validarCredenciales("wasd", "wasd"));
    }
    
}
