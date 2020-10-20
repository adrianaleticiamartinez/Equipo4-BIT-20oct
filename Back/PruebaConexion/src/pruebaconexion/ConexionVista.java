/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author giova
 */
public class ConexionVista {
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "jdbc:postgresql://localhost:5432/Prueba1";
             String user ="postgres";
             String pass = "holamundo";
              try {
                  Class.forName("org.postgresql.Driver");
                  Connection conex = DriverManager.getConnection(cadena,user,pass);
                  java.sql.Statement st = conex.createStatement();
                  String sql =
                      "select * from vistap2 ";
                  ResultSet result = st.executeQuery(sql);
                  
                  while(result.next()) {   
                      String usuario = result.getString("claves");
                      String clave = result.getString("prevenidas");
                      System.out.println("Claves: "+usuario + " prevenidas: " + clave);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(Exception exc) {
                  System.out.println("Errorx:"+exc.getMessage());
              }
    }
}
