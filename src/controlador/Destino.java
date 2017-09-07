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
public class Destino {
    private String horario;
    private int costo;
    private String nombreDestino;

    public Destino(String horario, int costo, String nombreDestino) {
        this.horario = horario;
        this.costo = costo;
        this.nombreDestino = nombreDestino;
    }

    public String getHorario() {
        return horario;
    }

    public int getCosto() {
        return costo;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }
    
    
}
