/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_hello_world;
import java.io.File;


/**
 *
 * @author Vincent
 */
public class LAB1_HELLO_WORLD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        ListReader lr = new ListReader();
        String path = "liste.txt";
        File liste = new File(path);
        lr.readList(liste);
    }
    
}
