/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexion;

/**
 *
 * @author giova
 */
public class master {
    public static void main(String[] args) {
        conexionBBVA a= new conexionBBVA();
        a.consulta("Manager", "BF000002999");
        a.consulta("Restringido", "BF000002999");
        a.consulta("Validador", "BF000002999");
    }
}
