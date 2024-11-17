package mysqlConnector;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectorTests {
    Connection connection;

    @BeforeMethod
    public void loadDb() {
        //load mysql jdbc driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection to DB
            connection = DriverManager.getConnection(DbData.dbUrl,DbData.username,DbData.password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void closeDb() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getTableDataTest() {
        //create statement object
        try {
            Statement statement = connection.createStatement();

            //execute SQL query. store results
            ResultSet resultSet = statement.executeQuery(DbData.query);
            //while loop to iterate through all data and print results
            while (resultSet.next()) {
                System.out.println(resultSet.getString(DbData.index) + " *** " + resultSet.getString(DbData.index1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deleteRowFromTableTest() {

    {
        //modify statement object

        try {
            PreparedStatement statement = connection.prepareStatement(DbData.query1);
            statement.executeUpdate();

            ResultSet resultSet = statement.executeQuery(DbData.guery);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(DbData.index) + " *** " + resultSet.getString(DbData.index1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
