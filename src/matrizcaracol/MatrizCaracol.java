
package matrizcaracol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatrizCaracol {
    
   public static void leerDocumento(BufferedReader doc, ArrayList<String> cadena)
           throws FileNotFoundException, IOException{
       
                while(true){
                    
                    cadena.add(doc.readLine());
                    
                    if(cadena.contains(null)){
                        cadena.remove(null);
                        break;
                    }
                    
                }
                
                System.out.println(cadena);
                impresionCaracol(cadena.toString().replace("[", "")
                        .replace("]", "").replace(" ", "").replace(",", "")
                        , cadena.size());
                
    }
   
   public static void impresionCaracol(String s, int tamaño){
       
       System.out.print(s.subSequence(0, tamaño));
       System.out.print(s.charAt(9));
       System.out.print(s.charAt(14));
       System.out.print(s.charAt(19));
       System.out.print(s.charAt(24));
       System.out.print(s.charAt(23));
       System.out.print(s.charAt(22));
       System.out.print(s.charAt(21));
       System.out.print(s.charAt(20));
       System.out.print(s.charAt(15));
       System.out.print(s.charAt(10));
       System.out.print(s.charAt(5));
       System.out.print(s.subSequence(tamaño, 9));
       System.out.print(s.charAt(13));
       System.out.print(s.charAt(18));
       System.out.print(s.charAt(17));
       System.out.print(s.charAt(16));
       System.out.print(s.charAt(11));
       System.out.println(s.charAt(12));
       
       
   }
   
    public static void main(String[] args) throws FileNotFoundException, IOException{        
        
                leerDocumento(new BufferedReader(new FileReader("C:\\Users\\"
                        + "danbr\\Documents\\NetBeansProjects\\MatrizCaracol\\"
                        + "src\\matrizcaracol\\archivo.txt")), new ArrayList<>());
                
                }
        
    }
    
