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
import fundacion.Empleado;
import interfaz.FundacionUI;
import java.time.LocalDate;
public class TestFundacion {
    public static void main(String args[]){
       LocalDate date = Fundacion.toLocalDate("25/12/2020");
        Administrador a = new Administrador("Juan","Ecuador", "2255", "josse@gmail,com", date, 2000, "juan1", "123","225455");
        FundacionUI.fundacionAmigosDeCuatroPatas.añadirEmpleado(a);
        //a.consultaRegistroGastoVeterinaria();
        /*
        System.out.println(date.getMonth());
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy+hoy.getMonth().toString());
        System.out.println(hoy.getMonth().toString().equals("NOVEMBER"));*/
        a.calcularPresupuestoMensual();
    }
    
}
