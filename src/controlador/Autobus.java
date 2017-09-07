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
public class Autobus {
    private boolean [] capacidad;
    private  String tipo;
    private int clave;
    private Conductor conductor;
    private Destino destino;

    public Autobus(int capacidad, String tipo, int clave) {
        this.capacidad = new boolean[capacidad];
        vaciarAutobus();
        this.tipo = tipo;
        this.clave = clave;
    }
    private void vaciarAutobus(){
        for (int i = 0; i < capacidad.length; i++) {
            capacidad[i]=false;
        }
    }
    public boolean cancelarAsiento(int b){
        if( capacidad[b]==true){
            capacidad[b]=false;
            return true;
        }
        return false;
        
    }
    public boolean comprarAsiento(int c){
        if( capacidad[c]==false){
            capacidad[c]=true;
            return true;
        }
        return false;
    }
    
    public boolean[] asiento(){
        return capacidad;
    }
    
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    

    public int getCapacidad() {
        return capacidad.length;
    }

    public String getTipo() {
        return tipo;
    }

    public int getClave() {
        return clave;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Destino getDestino() {
        return destino;
    }
    
    
    
}
