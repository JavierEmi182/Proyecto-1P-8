/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import interfaz.FundacionUI;
import java.io.IOException;


/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FundacionUI fundacionUI = new FundacionUI();
        fundacionUI.inicializarSistema();
        fundacionUI.presentarMenuPrincipal();
  
               
        }
    }
    

