package com.start.dao;

import com.start.config.YcConnectionProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper implements IDBHelper{

    @Autowired
    private YcConnectionProperties properties;

    @Override
    public Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(properties.getUrl(),properties.getUname(),properties.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
