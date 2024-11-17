package mysqlConnector;

public class DbData {
    //connection URL syntax: "jdbc:mysql://ipaddress:portNumber/db_name"
    public static final String dbUrl = "jdbc:mysql://localhost:3306/phonebook";

    //database username
    public static final String username = "root";

    //database password
    public static final String password = "***";

    //query to execute
    public static final String query = "select * from users";
    public static final String query1 = "delete from users where username='manuel@gm.com';";

    public static final int index = 1;
    public static final int Index1 = 2;
}
