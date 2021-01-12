/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Master
 */
public class PRJ_FILEWRITER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileWriter fw = null;
        String arr[]={"Juan","Ana","Lupita","Carmela","Flor","Pepe","Paz","Modo_caracter"};
        try{
            fw=new FileWriter ("C:/Users/Master/Desktop/MICHELLE/PROG. NETBEANS/PRJ_FILEWRITER/nombres.txt");
            for(String temp:arr){
                fw.write(temp+",");
            }
            fw.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage ()); 
        }
        System.out.println("Operacion sin excepciones");
    }   
}
