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
public class Conductor {
    private String nombre;
    private int clave;
    
    public Conductor(String  nombre, int clave){
        this.nombre= nombre;
        this.clave = clave;
        
    }
    public String getNombre(){
        return nombre;
    }
    public int getClave(){
        return clave;
    }
}
