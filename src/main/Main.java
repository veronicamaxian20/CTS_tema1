package main;

import classes.ConnectionImpl;
import classes.CreateTable;
import classes.InsertData;
import classes.ReadData;
import interfaces.ConnectionDB;
import interfaces.CreateTableDB;
import interfaces.InsertDataDB;
import interfaces.ReadDataDB;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connectionDB=new ConnectionImpl();
        Connection connection=connectionDB.connectionImpl();

        CreateTableDB createTableDB=new CreateTable();
        try {
            createTableDB.createTable(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        InsertDataDB insertDataDB=new InsertData();
        try {
            insertDataDB.insertData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ReadDataDB readDataDB=new ReadData();
        try {
            readDataDB.readData(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
