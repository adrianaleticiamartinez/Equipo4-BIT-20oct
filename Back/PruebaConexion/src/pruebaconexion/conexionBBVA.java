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
                  //manager
                 /* String sql =
                      "select idcliente, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, segmento, nacionalidad, rfc, tipoID, numeroID, cuenta, email from clientes";
                  ResultSet result = st.executeQuery(sql);
                  while(result.next()) {
                      String idcliente = result.getString("idcliente");
                      String nombre = result.getString("nombre");
                      String apellidoPaterno = result.getString("apellidoPaterno");
                      String apellidoMaterno = result.getString("apellidoMaterno");
                      String fechaNacimiento = result.getString("fechaNacimiento");
                      String sexo = result.getString("sexo");
                      String segmento = result.getString("segmento");
                      String nacionalidad = result.getString("nacionalidad");
                      String rfc = result.getString("rfc");
                      String tipoID = result.getString("tipoID");
                      String numeroID = result.getString("numeroID");
                      String cuenta = result.getString("cuenta");
                      String email = result.getString("email");
                      
                      System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" apellidoPaterno: "+apellidoPaterno +  " apellidoMaterno: "+apellidoMaterno + " fechaNacimiento: "+ fechaNacimiento+ " sexo: "+sexo+" segmento: "+segmento+ " nacionalidad "+nacionalidad+ " rfc: "+rfc+" tipoID: "+tipoID+" numeroID: "+numeroID+" cuenta: "+cuenta+ "email: "+email);
                  }*/
                 
                 //restringido
                 /* String sql =
                      "select idcliente, nombre, sexo, segmento, numeroID, cuenta, email from clientes";
                  ResultSet result = st.executeQuery(sql);
                  while(result.next()) {
                      String idcliente = result.getString("idcliente");
                      String nombre = result.getString("nombre");
                      String sexo = result.getString("sexo");
                      String segmento = result.getString("segmento");
                      String cuenta = result.getString("cuenta");
                      
                      System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" sexo: "+sexo+" segmento: "+segmento+" cuenta: "+cuenta);
                  }*/
                 //validador
                  String sql =
                      "select idcliente, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, segmento, nacionalidad, rfc, tipoID, numeroID, cuenta, email from clientes";
                  ResultSet result = st.executeQuery(sql);
                  while(result.next()) {
                      String idcliente = result.getString("idcliente");
                      String nombre = result.getString("nombre");
                      String apellidoPaterno = result.getString("apellidoPaterno");
                      String apellidoMaterno = result.getString("apellidoMaterno");
                      String fechaNacimiento = result.getString("fechaNacimiento");
                      String sexo = result.getString("sexo");
                      String segmento = result.getString("segmento");
                      String nacionalidad = result.getString("nacionalidad");
                      String rfc = result.getString("rfc");
                      String tipoID = result.getString("tipoID");
                      String numeroID = result.getString("numeroID");
                      String cuenta = result.getString("cuenta");
                      String email = result.getString("email");
                      
                      System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" apellidoPaterno: "+apellidoPaterno.substring(0,3) +  " apellidoMaterno: "+apellidoMaterno.substring(0,3) + " fechaNacimiento: "+ fechaNacimiento.substring(0,3)+ " sexo: "+sexo+" segmento: "+segmento+ " nacionalidad "+nacionalidad.substring(0,3)+ " rfc: "+rfc.substring(0,3)+" tipoID: "+tipoID.substring(0,3)+" numeroID: "+numeroID.substring(0,3)+" cuenta: "+cuenta+ "email: "+email.substring(0,3));
                  }
                  result.close();
                  st.close();
                  conex.close();
              } catch(Exception exc) {
                  System.out.println("Errorx:"+exc.getMessage());
              }
    }
}
