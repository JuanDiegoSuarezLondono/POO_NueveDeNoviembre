/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevedenoviembre;

import java.io.*;

/**
 *
 * @author suare
 */
public class NueveDeNoviembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {        
        float x;
        float y;
        boolean error=false;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        Calculadora c=new Calculadora();
        
        do {
            try {
            x=Integer.parseInt(b.readLine());
            y=Integer.parseInt(b.readLine());
            System.out.println(c.dividir(x, y));
            error=false;
            }
            catch(ArithmeticException E){
                System.err.println("No sea idiota 0 no!!! NOOO JAMAS!");   
                error=true;
            }
        }while(error);
        // TODO code application logic here
    }
    
}
