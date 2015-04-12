/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend;

import Gui.*;
import java.sql.*;

/**
 * This class controls the start up of the medical doctor program. It detects if this is the first time start up, in which cause
 * the program opens the newAdmin frame, or it start the program into the normal login.
 * 
 * 
 * Database Name: honorsmedicaldoctor
 * 
 * @author Eric Sullivan
 */
public class StartUpManager {

    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n"); //change password for it to work.
                    String sql = "select * from Users where Section = 'Administrator'";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    
                    if(rs.next()){
                        System.out.println("There is One");
                        new Login().setVisible(true);
                        //new Login().setVisible(true);
                    }
                    
                    else 
                        new NewAdmin().setVisible(true);
                    con.close();
                    rs.close();
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }
        });
    }
}
