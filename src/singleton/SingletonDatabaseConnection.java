package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDatabaseConnection {

    private final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL ="jdbc:mysql://localhost:3306/airport";
    private final String USERNAME = "gor";
    private final String PASSWORD = "1111";
    private static SingletonDatabaseConnection singleton;

    private SingletonDatabaseConnection() {

    }
    public static SingletonDatabaseConnection getSingleton(){
        if(singleton == null){
            singleton =  new SingletonDatabaseConnection();
        }
        return singleton;
    }

    public   Connection createConnection(){
        try {
            Class.forName(DRIVER_URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        }
        try {
            return DriverManager.getConnection(DATABASE_URL,
                    USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            System.out.println("Can't get connection, " +
                    "credentials are probably wrong");
        }
        return null;
    }

}


