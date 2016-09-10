/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_hello_world;
import java.io.*;

/**
 *
 * @author Vincent
 */
public class ListReader {
    
   public void readList(File path){
       
       try {
            String line = null; 
            BufferedReader bf = new BufferedReader(new FileReader(path));
             do 
             {
                System.out.println(bf.readLine());  
             } 
             while ((line = bf.readLine()) != null);
       }
       catch ( IOException e) {
           System.out.print(e.getMessage());

       }
                      
   }
 
    
}
