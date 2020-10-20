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
public class conexionBBVA {
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "jdbc:postgresql://localhost:5432/HackBBVA";
             String user ="postgres";
             String pass = "holamundo";
              try {
                  Class.forName("org.postgresql.Driver");
                  Connection conex = DriverManager.getConnection(cadena,user,pass);
                  java.sql.Statement st = conex.createStatement();
                  String sql =
                      "select idcliente, fechanacimiento from clientes";
                  ResultSet result = st.executeQuery(sql);
                  while(result.next()) {
                      String usuario = result.getString("idcliente");
                      String clave = result.getString("fechanacimiento");
                      System.out.println("idCliente: "+usuario + " fecha nacimiento: " + clave);
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(Exception exc) {
                  System.out.println("Errorx:"+exc.getMessage());
              }
    }
}
