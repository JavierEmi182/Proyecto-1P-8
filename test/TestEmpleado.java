/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import fundacion.Administrador;
import fundacion.Fundacion;
import interfaz.FundacionUI;

public class TestEmpleado {
    public static void main(String args[]){
        Administrador a = new Administrador("Juan","Ecuador", "2255", "josse@gmail,com", "25/12/2020", 2000, "juan1", "123","225455");
        Fundacion f = new Fundacion();
        f.añadirEmpleado(a);
        FundacionUI F= new FundacionUI();
        //F.presentarMenuPrincipal();
        
        //System.out.println(fundacion.getRegistroEmpleados().size());
        //a.registrarEmpleado();
        //System.out.println(fundacion.verificarUsuario("fgsg"));
        FundacionUI  fundacionui =new FundacionUI();
        //System.out.println(fundacion.verificarUsuario("juan1"));
        //fundacionui.presentarMenuPrincipal();
        //System.out.println(f.validarCredenciales("juan1", "123"));
        a.consultaRegistroVeterinaria();

        
    }
        
}
    