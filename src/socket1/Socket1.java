/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ange7us
 */

public class Socket1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Servidor servidor = new Servidor(9002);
        Scanner leer = new Scanner(System.in);
        while(true){
            servidor.recibir();
            System.err.println("Escribe tu mensaje");
            String msj = leer.nextLine();
            servidor.enviar(msj);
        }
       
    }
}
