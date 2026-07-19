package util;

import exceptions.DatabaseConfigConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String url = "jdbc:postgresql://localhost:5432/warehouse_product_management_system";
    private static final String username = "postgres";
    private static final String password = "20001397";


    public static Connection getconnection(){
        try {
            return DriverManager.getConnection(url , username , password);
        } catch (SQLException e) {
            throw new DatabaseConfigConnectionException("Connection Failed !");
        }
    }
}
