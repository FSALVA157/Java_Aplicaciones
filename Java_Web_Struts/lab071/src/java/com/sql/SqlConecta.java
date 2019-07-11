package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConecta {

    private String db;

    public SqlConecta() {
        db = "dbweb"; 
    }

    public Connection connection() {
        Connection cn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + db, "root", "611711811");

        } catch (SQLException e) {
        } catch (Exception e) {
        }

        return cn;
    }
}
