package SectionB.helper;

import SectionB.data.City;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityEntryHelper {

    public static final String NAME_COLUMN = "name";
    public static final String TRAVERSED = "traversed";
    public static final String KILOMETERS_REQUIRED = "kilometers_required";

    private static final String INSERT_QUERY =
            "INSERT INTO cities(name, traversed, kilometers_required)" +
                    "VALUES (?, ?, ?)"; // parameters(1,2,3)

    private static final String READ_QUERY =
            "SELECT * FROM cities;";
    private static final String UPDATE_QUERY =
    "UPDATE cities set kilometers_required = ? where name = ?;";


    // to add a new city in the database (CREATE)
    public boolean createNewCity(Connection connection, City city) throws SQLException {
        String name = city.getName();
        boolean isTraversed = city.isTraversed();
        int kilometersRequired = city.getKilometersRequired();
        PreparedStatement preparedStatement =
                connection.prepareStatement(INSERT_QUERY);
        preparedStatement.setString(1, name);
        preparedStatement.setBoolean(2, isTraversed);
        preparedStatement.setInt(3, kilometersRequired);
        preparedStatement.executeUpdate();
        return false;
    }

    // to read all the cities in the database (READ)
    public void readAllCities(Connection connection) throws SQLException {
        PreparedStatement readStatement =
                connection.prepareStatement(READ_QUERY);
        ResultSet results = readStatement.executeQuery();
        while(results.next()){
            // name
            String name = results.getString(NAME_COLUMN);
            // isTraversed
            boolean isTraversed = results.getBoolean(TRAVERSED);
            // kilometersRequired
            int kilometersRequired = results.getInt(KILOMETERS_REQUIRED);
            City city = new City(name, isTraversed, kilometersRequired);
            System.out.println(city);
            System.out.println("--------------------------------------");
        }
    }

    // to modify the attributes of a city in the database (UPDATE)
    public void modifyCity(Connection connection,String cityName,int kmsRequired) throws SQLException {
        PreparedStatement updateStatement =
                connection.prepareStatement(UPDATE_QUERY);
        updateStatement.setInt(1,kmsRequired);
        updateStatement.setString(2,cityName);
        updateStatement.executeUpdate();
    }

    // to delete a city from the database (DELETE)
    public void deleteCity() {

    }
}
