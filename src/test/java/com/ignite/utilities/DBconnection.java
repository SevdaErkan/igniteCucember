package com.ignite.utilities;



import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBconnection {


    public static String SQLquery(String sql, String column1, String column2) {
        String URL = "192.168.1.15\\COOLSQLIGNITE";
        String LOGIN = "ignite";
        String PASSWORD = "Eh7ruY3!p@82";
        String MyDataBase = "CoolSIS_113";
        ///Create a variable for the connection string
        String connectionUrl = "jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE" + ";" + "databasename="
                + MyDataBase + ";" + "user=" + LOGIN + ";" + "password=" + PASSWORD;
        String Sql = sql;
        String sqlreturn = "";
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()
        ) {
            ResultSet rs = statement.executeQuery(Sql);
            System.out.println(rs);

            while (rs.next()) {
                sqlreturn = rs.getString(column1) + " "
                        + rs.getString(column2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(sqlreturn);
        return sqlreturn;

    }

    public static String SQLquery(String sql, String column1, String column2, String column3) {
        String URL = "192.168.1.15\\COOLSQLIGNITE";
        String LOGIN = "ignite";
        String PASSWORD = "Eh7ruY3!p@82";
        String MyDataBase = "CoolSIS_113";
        ///Create a variable for the connection string
        String connectionUrl = "jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE" + ";" + "databasename="
                + MyDataBase + ";" + "user=" + LOGIN + ";" + "password=" + PASSWORD;
        String Sql = sql;
        String sqlreturn = "";
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()
        ) {
            ResultSet rs = statement.executeQuery(Sql);
            System.out.println(rs);

            while (rs.next()) {
                sqlreturn = rs.getString(column1) + " "
                        + rs.getString(column2)+" "+rs.getString(column3);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sqlreturn;

    }

    public static String SQLquery(String sql, String column1, String column2, String column3,String sql2) {
        String URL = "192.168.1.15\\COOLSQLIGNITE";
        String LOGIN = "ignite";
        String PASSWORD = "Eh7ruY3!p@82";
        String MyDataBase = "CoolSIS_113";
        ///Create a variable for the connection string
        String connectionUrl = "jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE" + ";" + "databasename="
                + MyDataBase + ";" + "user=" + LOGIN + ";" + "password=" + PASSWORD;
        String Sql = sql;
        String sqlreturn = "";
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()
        ) {
            ResultSet rs = statement.executeQuery(Sql);
            ResultSet rs2 = statement.executeQuery(sql2);
            System.out.println(rs);

            while (rs.next()) {
                sqlreturn = rs.getString(column1) + " "
                        + rs.getString(column2)+" "+rs.getString(column3);
            }

            while (rs2.next()){
                sqlreturn = rs.getString(column1) + " "
                        + rs.getString(column2)+" "+rs.getString(column3);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sqlreturn;

    }

}








