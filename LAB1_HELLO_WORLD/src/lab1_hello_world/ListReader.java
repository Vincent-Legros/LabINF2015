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
            String line = ""; 
            BufferedReader bf = new BufferedReader(new FileReader(path));
            while ((line != null))
             {
               
                line = bf.readLine();
                if (line != null)    
                    System.out.println(line);  
             } 
           
       }
       catch ( IOException e) {
           System.out.print(e.getMessage());

       }
                      
   }
    
}
