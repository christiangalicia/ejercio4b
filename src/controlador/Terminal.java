/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author christian
 */
public class Terminal {
    private String nombre;
    private String ubicacion;
    private Autobus[] autobus;

    public Terminal(String nombre, String ubicacion, Autobus[] autobus) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.autobus = autobus;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Autobus[] getAutobus() {
        return autobus;
    }
    
    
}
