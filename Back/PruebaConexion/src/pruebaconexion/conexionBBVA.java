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
    public void consulta(String tipo_usuario, String idclienteM) {
        // TODO code application logic here
        String cadena = "jdbc:postgresql://localhost:5432/HackBBVA";
             String user ="postgres";
             String pass = "holamundo";
              try {
                  Class.forName("org.postgresql.Driver");
                  Connection conex = DriverManager.getConnection(cadena,user,pass);
                  java.sql.Statement st = conex.createStatement();
                  
                  if(tipo_usuario=="Manager"){        //manager                                               
                    String sql =
                        "select * from clientes where idcliente= '"+idclienteM+"'";
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

                        if(idcliente==null){
                            idcliente="FALTA DATO";
                        }
                        if(nombre==null){
                            nombre="FALTA DATO";
                        }

                        if(apellidoPaterno==null){
                            apellidoPaterno="FALTA DATO";
                        }

                        if(apellidoMaterno==null){
                            apellidoMaterno="FALTA DATO";
                        }

                        if(fechaNacimiento==null){
                            fechaNacimiento="FALTA DATO";
                        }

                        if(sexo==null){
                            sexo="FALTA DATO";
                        }
                        if(segmento==null){
                            segmento="FALTA DATO";
                        }                  

                        if(nacionalidad==null){
                            nacionalidad="FALTA DATO";
                        }

                        if(rfc==null){
                            rfc="FALTA DATO";
                        }

                        if(tipoID==null){
                            tipoID="FALTA DATO";
                        }                   

                        if(numeroID==null){
                            numeroID="FALTA DATO";
                        }

                        if(cuenta==null){
                            cuenta="FALTA DATO";
                        }

                        if(email==null){
                            email="FALTA DATO";
                        }

                        System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" apellidoPaterno: "+apellidoPaterno +  " apellidoMaterno: "+apellidoMaterno + " fechaNacimiento: "+ fechaNacimiento+ " sexo: "+sexo+" segmento: "+segmento+ " nacionalidad "+nacionalidad+ " rfc: "+rfc+" tipoID: "+tipoID+" numeroID: "+numeroID+" cuenta: "+cuenta+ "email: "+email);
                    }
                     result.close();
                }
                if(tipo_usuario=="Restringido"){//restringido
                        String sql =
                          "select idcliente, nombre, sexo, segmento, numeroID, cuenta, email from clientes where idcliente= '"+idclienteM+"'";
                      ResultSet result = st.executeQuery(sql);
                      while(result.next()) {
                          String idcliente = result.getString("idcliente");
                          String nombre = result.getString("nombre");
                          String sexo = result.getString("sexo");
                          String segmento = result.getString("segmento");
                          String cuenta = result.getString("cuenta");

                          if(idcliente==null){
                              idcliente="FALTA DATO";
                          }
                          if(nombre==null){
                              nombre="FALTA DATO";
                          }

                          if(sexo==null){
                              sexo="FALTA DATO";
                          }
                          if(segmento==null){
                              segmento="FALTA DATO";
                          }                  

                          if(cuenta==null){
                              cuenta="FALTA DATO";
                          }

                          System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" sexo: "+sexo+" segmento: "+segmento+" cuenta: "+cuenta);
                      }
                      result.close();
                } 
                
                if(tipo_usuario=="Validador"){//validador                                 
                    String sql =
                          "select idcliente, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, segmento, nacionalidad, rfc, tipoID, numeroID, cuenta, email from clientes where idcliente= '"+idclienteM+"'";
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

                          if(idcliente==null){
                              idcliente="FALTA DATO";
                          }
                          if(nombre==null){
                              nombre="FALTA DATO";
                          }

                          String apellidoPaternotemp="";
                          if(apellidoPaterno==null){
                              apellidoPaterno="FALTA DATO";
                          }else{
                              apellidoPaternotemp=apellidoPaterno.substring(0,3);
                            for(int n=3; n<apellidoPaterno.length(); n++){
                                 apellidoPaternotemp=apellidoPaternotemp.concat("*");
                            }
                          }


                          String apellidoMaternotemp="";
                          if(apellidoMaterno==null){
                              apellidoMaternotemp="FALTA DATO";
                          }else{
                              apellidoMaternotemp=apellidoMaterno.substring(0,3);
                            for(int n=3; n<apellidoMaterno.length(); n++){
                                 apellidoMaternotemp=apellidoMaternotemp.concat("*");
                            }
                          }

                          String fechadenacimientotemp="";
                          if(fechaNacimiento==null){
                              fechaNacimiento="FALTA DATO";
                          }else{
                              fechadenacimientotemp=fechaNacimiento.substring(0,3);
                            for(int n=3; n<fechaNacimiento.length(); n++){
                                 fechadenacimientotemp=fechadenacimientotemp.concat("*");
                            }
                          }

                          if(sexo==null){
                              sexo="FALTA DATO";
                          }
                          if(segmento==null){
                              segmento="FALTA DATO";
                          }                  
                          String nacionalidadtemp="";
                          if(nacionalidad==null){
                              nacionalidad="FALTA DATO";
                          }else{
                            nacionalidadtemp=nacionalidad.substring(0,3);
                            for(int n=3; n<nacionalidad.length(); n++){
                                 nacionalidadtemp=nacionalidadtemp.concat("*");
                            }
                          }

                          String rfctemp="";
                          if(rfc==null){
                              rfctemp="FALTA DATO";
                          }else{
                             rfctemp=rfc.substring(0,3);
                            for(int n=3; n<rfc.length(); n++){
                                 rfctemp=rfctemp.concat("*");
                            } 
                          }

                          String tipoIDtemp="";
                          if(tipoID==null){
                              tipoID="FALTA DATO";
                          }else{
                             tipoIDtemp=tipoID.substring(0,3);
                            for(int n=3; n<tipoID.length(); n++){
                                 tipoIDtemp=tipoIDtemp.concat("*");
                            } 
                          }


                          String numeroIDtemp="";
                          if(numeroID==null){
                              numeroID="FALTA DATO";
                          }else{
                              numeroIDtemp=numeroID.substring(0,3);
                            for(int n=3; n<numeroID.length(); n++){
                                 numeroIDtemp=numeroIDtemp.concat("*");
                            }
                          }

                          if(cuenta==null){
                              cuenta="FALTA DATO";
                          }

                          String emailtemp="";
                          if(email==null){
                              emailtemp="FALTA DATO";
                          }else{
                            emailtemp=email.substring(0,3);
                            for(int n=3; n<email.length(); n++){
                                 emailtemp=emailtemp.concat("*");
                            }  
                          }


                          System.out.println("idcliente: "+ idcliente +" nombre: "+nombre +" apellidoPaterno: "+apellidoPaternotemp +  " apellidoMaterno: "+apellidoMaternotemp + " fechaNacimiento: "+ fechadenacimientotemp+ " sexo: "+sexo+" segmento: "+segmento+ " nacionalidad "+nacionalidadtemp+ " rfc: "+rfctemp+" tipoID: "+tipoIDtemp+" numeroID: "+numeroIDtemp+" cuenta: "+cuenta+ "email: "+emailtemp);
                      }
                } 
                  st.close();
                  conex.close();
              } catch(Exception exc) {
                  System.out.println("Errorx:"+exc.getMessage());
              }
    }
}
