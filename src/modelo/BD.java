/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class BD {

    protected Connection con;
    protected Statement pst = null;

    public BD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temporal", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    protected ResultSet consultar(String sql) {
        try {
            pst = con.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    protected void modificar(String tabla, String campos, String condicion){
        try {
            pst = con.createStatement();
            pst.executeUpdate("update "+tabla+ " set "+campos+ " where "+condicion);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void insertar(String tabla, String campos, String valores){
        try {
            pst = con.createStatement();
          
            pst.executeUpdate("insert into "+ tabla+ " (" + campos+ ") values(" + valores+")");
       
        } catch (SQLException ex) {
            System.out.println(ex);
         
        }
    }

}
