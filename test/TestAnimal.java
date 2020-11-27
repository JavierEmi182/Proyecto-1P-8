
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import fundacion.Animal;
import fundacion.Fundacion;
import fundacion.Gato;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TestAnimal {
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "16/08/2016";
        Fundacion fun = new Fundacion();
        
      //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        Animal a = new Gato(localDate, "misifu", "no se", "hembra", 25.2, "Gato sano", 25);
    
    
}
