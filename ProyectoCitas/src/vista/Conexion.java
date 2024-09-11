/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection; 
import java.sql.DriverManager; 
public class Conexion { 
    private static Connection conn; 
     
    public static Connection getConexion(){ 
        try { 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas","root",""); 
        } catch (Exception e) { 
            System.out.println(e.toString()); 
            conn= null; 
        } 
        return conn; 
    } 
} 
