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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataDao {
        private Connection connection;

        public DataDao() throws Exception {
                connection = DBUtility.getConnection();
        }


        public ArrayList<String> getFrameWork(String frameWork) {
        ArrayList<String> list = new ArrayList<String>();
        PreparedStatement ps = null;
        String data;
        try {
        ps = connection.prepareStatement("SELECT * FROM java_framework  WHERE framework  LIKE ?");
                ps.setString(1, frameWork + "%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                        data = rs.getString("framework");
                        list.add(data);
                }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        return list;
}
}
