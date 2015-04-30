/*
 * Team Name: Andrew's Honor Squad 2: High Honors
 * Team Members: Justin Jiang, Samir Leal, Phi Nguyen, Eric Sullivan
 * Date: 04-30-15
 *
 * Purpose: You and your team members will simulate to develop the software called
 * "Medical Doctor".  The software will be used in hospital for managing and updating
 * not only the patient information but also prescription, and other physical test.
 * The software should be developed with well-designed Graphical User Interface (GUI)
 * so that medical doctors can easily access and manage the patient information.
 *
 * Program Contents: The "Medical Doctor" software should have following contents on GUI:
 * 1. Registration
 * 2. Doctor General Practice
 * 3. Nursing
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
