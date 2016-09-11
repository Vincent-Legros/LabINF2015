/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_2_exercice5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vincent
 */
public class Lab1_2_Exercice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            String text = Utf8File.loadFileIntoString("src/lab1_2_Exercice5/liste.txt");
            System.out.println(text);
        } catch (IOException ex) {
            Logger.getLogger(Lab1_2_Exercice5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
