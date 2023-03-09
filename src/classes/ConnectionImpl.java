package classes;

import interfaces.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionImpl implements ConnectionDB {
    private static final String DRIVER_CLASS_NAME = "org.sqlite.JDBC";
    private static final String DATABASE_URL = "jdbc:sqlite:database.db";
    @Override
    public Connection connectionImpl(){
        Connection connectionDB = null;
        try {
            Class.forName(DRIVER_CLASS_NAME);
            connectionDB = DriverManager.getConnection(DATABASE_URL);
            (connectionDB).setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connectionDB;

    }
}

