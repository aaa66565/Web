/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class zhuce {
    private static Connection conn;
    public static Connection getConnection(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3030/aas","root","123456");
    }
    catch (ClassNotFoundException ex) {
            Logger.getLogger(zhuce.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(zhuce.class.getName()).log(Level.SEVERE, null, ex);
        }
    return conn; 
}
}
