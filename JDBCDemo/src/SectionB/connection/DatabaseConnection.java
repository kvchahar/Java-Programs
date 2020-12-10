package SectionB.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // URL of the database
    // localhost (our own computer)
    // 1270.0.0.1 OR localhost
    private static final String URL = "jdbc:mysql://localhost:3306/my_database";

    // Username of the admin of the database
    private static final String USERNAME = "root";

    // Password of the database
    private static final String PASSWORD = "";

    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public void conneectToDatabase() {
        try {
            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD);
        } catch (SQLException exception) {
            System.err.println("Could not connected to the database," +
                    "Please check your URL,Username and Password");
        } finally {
            printConnectionStatus();
        }
    }

    private void printConnectionStatus() {
        System.out.println(
                connection == null ? "The connection to the database is inactive..." :
                        "The connection to the database is active..."
        );
    }
}
