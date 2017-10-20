/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author christian
 */
public class Servidor {
   private ServerSocket server;
    private Socket socket;
    private int puerto ;
    private BufferedReader entrada;
    private  PrintWriter salida;
    
    public Servidor(int puerto) throws IOException {
        this.puerto = puerto;
       server = new ServerSocket(puerto);
        socket = server.accept();
        entrada = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
        salida = new PrintWriter(new BufferedWriter( new OutputStreamWriter(
                            socket.getOutputStream())), true); 
    }
    public void enviar(String msj){
        salida.println(msj);
    }
    
    public void recibir() throws IOException{
        String mensaje = entrada.readLine();
        System.out.println(mensaje);
    }
    
}
