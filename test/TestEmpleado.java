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
import fundacion.Gato;
import interfaz.FundacionUI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import fundacion.Animal;
import fundacion.GastoVeterinaria;

public class TestEmpleado {
    public static void main(String args[]){
        LocalDate date = Fundacion.toLocalDate("25/12/2020");
        Administrador a = new Administrador("Juan","Ecuador", "2255", "josse@gmail,com", date, 2000, "juan1", "123","225455");
        
        Fundacion f = new Fundacion();
        //f.añadirEmpleado(a);
        FundacionUI F= new FundacionUI();
        //F.presentarMenuPrincipal();
        
        //System.out.println(fundacion.getRegistroEmpleados().size());
        //a.registrarEmpleado();
        //System.out.println(fundacion.verificarUsuario("fgsg"));
       
        //System.out.println(fundacion.verificarUsuario("juan1"));
        //fundacionui.presentarMenuPrincipal();
        //System.out.println(f.validarCredenciales("juan1", "123"));
        //a.consultaRegistroVeterinaria();
        //a.consultaRegistroGastoVeterinaria();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date1 = "16/08/2016";
        LocalDate localDate = LocalDate.parse(date1, formatter);
        Animal ab= new Gato(localDate, "misifu", "no se", "hembra", 25.2, "Gato sano", 25);
        //f.registroAnimal(ab);
        //System.out.println(f.buscarAnimal(ab.getCodigo()));
       // System.out.println(f.buscarAnimal(2));
       //GastoVeterinaria v = new GastoVeterinaria(ab, localDate, 857);
       //f.registrarGastoVeterinaria(v);
       //System.out.println(f.consultarGastoAnimal(ab));
       ab.calcularCostoMes();
    }
        
}
    