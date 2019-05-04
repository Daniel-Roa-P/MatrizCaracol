
package matrizcaracol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatrizCaracol {
    
   public static void leerDocumento(BufferedReader doc, ArrayList<String> cadena, ArrayList<String> cadenaTemporal, char [] caracteres) throws FileNotFoundException, IOException{
       
       
       
                while(true){
                    
                    cadena.add(doc.readLine());
                    
                    if(cadena.contains(null)){
                        cadena.remove(null);
                        break;
                    }
                    
                }
                
                System.out.println(cadena);
                System.out.println(cadena.toString().replace("[", "").replace("]", "").replace(" ", "").replace(",", ""));
                System.out.println(reconstruccionString4(reconstruccionString3(reconstruccionString2(reconstruccionString(cadena.toString())))));
                
    }
   
   public static String reconstruccionString(String s){
       return s.replace("]","");
   }
   
   public static String reconstruccionString2(String s){
       return s.replace("[","");
   }
   
   public static String reconstruccionString3(String s){
       return s.replace(",","");
   }
   
   public static String reconstruccionString4(String s){
       return s.replace(" ","");
   }
     
    public static void main(String[] args) throws FileNotFoundException, IOException{        
        
                leerDocumento(new BufferedReader(new FileReader("C:\\Users\\danbr\\Documents\\NetBeansProjects\\MatrizCaracol\\src\\matrizcaracol\\archivo.txt")), new ArrayList<String>(), new ArrayList<String>(), new char[25]);
                
                }
        
    }
    
