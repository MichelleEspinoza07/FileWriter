package prfilewite;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gohea
 */
public class Prfilewite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = null;
        String arr[]={"Juan","Ana","Lupita","Carmela","Flor","Pepe","Paz","Modo_caracter"};
        try
        {    
        fw=new FileWriter ("C:/Users/Administrator/Desktop/New Text Document.txt");
        for(String temp:arr)
        {
            fw.write(temp+",");
            
            
        }
            fw.close();
       
        
        }catch (IOException e)
            
        {
            System.out.println("Error: "+e.getMessage ());
            
        }
        
              System.out.println("Operacion sin excepciones");
        
    }
    
}