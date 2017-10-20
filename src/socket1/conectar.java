/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket1;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ange7us
 */
public class conectar {
    ServerSocket server;
    Socket socket;
    int puerto = 9001;
    BufferedReader entrada;
    public void iniciar() {
        try {
            server = new ServerSocket(puerto);
            socket = new Socket();
            while (true) {
                socket = server.accept();
                entrada = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
                String mensaje = entrada.readLine();
                System.out.println(mensaje);
            }
            
            // salida= new DataOutputStream(socket.getOutputStream());
        } catch (Exception E) {
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(E);
        }finally{
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
