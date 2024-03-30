package lesson24.homework;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

    private Statement stmt;

    public StudentDAO(Connection connection) throws SQLException {
        Statement stmt = connection.createStatement();
    }

    public void add(Student student) throws SQLException {
        stmt.executeUpdate("INSERT INTO students (name, group_name) VALUES ('" +
                student.getName() + "', '" + student.getGroupName() + "')");
    }
    public void readAll() throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + ", " +
                            rs.getString("name") + ", " + rs.getString("group_name"));

        }
    }
}
