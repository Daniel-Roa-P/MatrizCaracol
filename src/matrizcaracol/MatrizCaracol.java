
package matrizcaracol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatrizCaracol {
    
   public static void leerDocumento(BufferedReader doc, ArrayList<String> cadena) throws FileNotFoundException, IOException{
       
       
       
                while(true){
                    
                    cadena.add(doc.readLine());
                    
                    if(cadena.contains(null)){
                        cadena.remove(null);
                        break;
                    }
                    
                }

                
                
                System.out.println(cadena.get(3));
                
    }
     
    public static void main(String[] args) throws FileNotFoundException, IOException{        
        
                leerDocumento(new BufferedReader(new FileReader("C:\\Users\\danbr\\Documents\\NetBeansProjects\\MatrizCaracol\\src\\matrizcaracol\\archivo.txt")), new ArrayList<String>());
                
                
                }
        
    }
    
