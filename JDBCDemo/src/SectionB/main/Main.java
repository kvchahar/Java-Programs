package SectionB.main;

import SectionB.connection.DatabaseConnection;
import SectionB.data.City;
import SectionB.helper.CityEntryHelper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static final int CREATE_CITY = 1;
    public static final int VIEW_ALL_CITIES = 2;
    public static final int MODIFY_CITY = 3;
    public static final int DELETE_CITY = 4;

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.conneectToDatabase();

        System.out.println("-------MENU-------");
        System.out.println("1. Press 1 to create a new city: ");
        System.out.println("2. Press 2 to view all cities: ");
        System.out.println("3. Press 3 to modify a city: ");
        System.out.println("4. Press 4 to delete a city: ");
        System.out.println("Please input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        CityEntryHelper helper = new CityEntryHelper();
        switch (choice) {
            case CREATE_CITY:
                String name = JOptionPane.showInputDialog(
                        null,
                        "Please input the name of the city: ",
                        "City Name",
                        JOptionPane.PLAIN_MESSAGE
                );
                boolean isTraversed = Boolean.parseBoolean(JOptionPane.showInputDialog(
                        null,
                        "Have you been to the city (true/false): ",
                        "Traversed",
                        JOptionPane.PLAIN_MESSAGE
                ));
                int kmsRequired = (int) ((Math.random() * 2000.0) + 100.0);
                try {
                    helper.createNewCity(
                            DatabaseConnection.getConnection(),
                            new City(
                                    name, isTraversed, kmsRequired
                            )
                    );
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
                break;
            case VIEW_ALL_CITIES:
                try {
                    helper.readAllCities(DatabaseConnection.getConnection());
                } catch (SQLException exception) {
                    JOptionPane.showMessageDialog(
                            null,
                            "The values could not be read from the database!",
                            "Error 1",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                break;
            case MODIFY_CITY:
                name = JOptionPane.showInputDialog(
                        null,
                        "Please enter the name of the city whose km value you want to change",
                        "City Name",
                        JOptionPane.PLAIN_MESSAGE
                );
                kmsRequired = Integer.parseInt(JOptionPane.showInputDialog(
                        null,"Please enter the new value of kms required",
                        "Kilometers Required",
                        JOptionPane.PLAIN_MESSAGE
                ));
                try {
                    helper.modifyCity(
                            DatabaseConnection.getConnection(),
                            name,
                            kmsRequired
                    );
                } catch (SQLException exception) {
                    JOptionPane.showMessageDialog(
                            null,"The city could not be updated",
                            "Error 2",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                break;
            case DELETE_CITY:
                break;
            default:
        }
    }
}