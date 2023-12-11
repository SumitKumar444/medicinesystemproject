/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicalshopproject;

import java.sql.*;

/**
 *
 * @author 91952
 */
public class GetConnection {
    
    private Connection conn=null;
    
    public Connection getconnection() 
    {
        try
        {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Golu1981@");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            return conn;
        }
    }
    
    
}
