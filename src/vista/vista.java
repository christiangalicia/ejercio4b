/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class vista {
    
    public vista() {
        Terminal t = new Terminal("ADO", "Tehuacan");
        Scanner leer = new Scanner(System.in);
        while(true){
            System.out.println("1.-Comprar Boleto");
            System.out.println("2.-Cancelar Boleto");
            System.out.println("3.-Crear Rutas");
            System.out.println("4.-Ver Rutas");
            System.out.println("5.-Reportes");
            int opcion= leer.nextInt();
            if(opcion==1){
                
            }else if (opcion==2){
                
            }else if(opcion==3){
                System.out.println("Capacidad");
                int capacidad= leer.nextInt();
                System.out.println("Tipo Autobus");
                String tipo= leer.next();
                System.out.println("Clave Autobus");
                int clave= leer.nextInt();
                System.out.println("Nombre Conductor");
                String nombreConductor= leer.next();
                System.out.println("Clave conductor");
                int claveConductor= leer.nextInt();
                System.out.println("Horario");
                String horario= leer.next();
                System.out.println("Costo boleto");
                int costo= leer.nextInt();
                System.out.println("Destino");
                String nombreDestino= leer.next();
                t.crearRuta(capacidad, tipo, clave, nombreConductor, claveConductor, horario, costo, nombreDestino);
                
            }else if(opcion==4){
               
                    ArrayList<Autobus> r= t.consultarRutas();
                    for (int i = 0; i < r.size(); i++) {
                       Autobus a= r.get(i);
                        System.out.println(a.getClave());
                        System.out.println("Capacidad = "+a.getCapacidad());
                        System.out.println("Conductor="+a.getChofer().getNombre());
                    }
                
            }else if(opcion==5){
                
            }
            
        }
        
    }
    
    
}
