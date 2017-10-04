/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author christian
 */
public class Terminal {

    private String nombre;
    private String ubicacion;
    private MAutobus mautobus;

    public Terminal(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        mautobus = new MAutobus();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Autobus[] getAutobus() {
        return null;
    }

    public void crearRuta(int capacidad, String tipo, int clave,
            String nombreConducto, int claveConducto,
            String horario, int costo, String nombreDestino) {

        Autobus a = new Autobus(capacidad, tipo, clave);
        Conductor c = new Conductor(nombreConducto, claveConducto);
        Destino d = new Destino(horario, costo, nombreDestino);
        a.setConductor(c);
        a.setDestino(d);
        mautobus.guardarRuta(a);

    }

    public ArrayList<Autobus> consultarRutas() {
        return this.mautobus.mostrarRutas();
    }

    public String reservarAsiento(int clave, int numero) {
        int num= this.mautobus.buscarAsiento(clave, numero);
        if(num==0){
            this.mautobus.reservarAsiento(clave, numero);
            return "Asiento Reservado";
        }else if(num==1){
            return "Asiento Ocupado";
        }else{
            return "El asiento no existe";
        }
    }

}
