/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author christian
 */
public class MAutobus  extends BD{
   
    public int obtenerUltimoID(String tabla, String columna){
        try {
            ResultSet r= this.consultar("select max("+columna+") from "+tabla);
            while (r.next()) {
                return r.getInt(1);
                
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(MAutobus.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    public void guardarRuta(Autobus a){
       Conductor c= a.getChofer();
        this.insertar("conductor", "nombre,clave", "'"+c.getNombre()+"','"+c.getClave()+"'");
        Destino d=  a.getDestino();
        this.insertar("rutas", "destino,horario,costo", "'"+d.getNombreDestino()+"','"+d.getHorario()+"','"+d.getCosto()+"'");
        int idRuta= this.obtenerUltimoID("rutas", "idRuta");
        int idConducto= this.obtenerUltimoID("conductor", "idConductor");
        this.insertar("autobus", "clave,tipo,idRuta,idConductor", "'"+a.getClave()+"','"+a.getTipo()+"','"+idRuta+"','"+idConducto+"'");
        int idAutobus= this.obtenerUltimoID("autobus", "idAutobus");
        for (int i = 1; i <= a.getCapacidad(); i++) {
            this.insertar("capacidad", "asiento,estado,idAutobus", "'"+i+"','0','"+idAutobus+"'");
        }
    }
    
    
    
    
}
