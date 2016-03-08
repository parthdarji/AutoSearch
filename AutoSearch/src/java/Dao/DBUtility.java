/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author parth
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
        private static Connection connection = null;

        public static Connection getConnection() throws Exception {
                if (connection != null)
                        return connection;
                else {
                       
                        Class.forName("com.mysql.jdbc.Driver");

                        // set the url, username and password for the databse
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/search", "root", "parth");
                        return connection;
                }
        }
}