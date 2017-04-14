package labproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rafat
 */
public class SQLITEDB {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:nameANDpass.sqlite");
            System.out.println("Connected");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }  catch(Exception e){
            JOptionPane.showMessageDialog(null, "yo;o");
            return null;
        }
    }
    
}
