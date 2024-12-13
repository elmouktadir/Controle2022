package ma.ensa.javaproject.controlejava.DAO;

import java.sql.Connection; // Import de la bonne classe Connection
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8888;
    private static final String DATABASE = "ctrl2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DATABASE), USERNAME, PASSWORD);
            //System.out.println("Connexion reussite !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(){
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
