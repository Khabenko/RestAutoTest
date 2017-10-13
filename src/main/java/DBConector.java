import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConector {

    static String  DB_CONNECTION ="jdbc:mysql://10.0.14.152:3306/Tavriav790_T";
    static String  DB_USER ="Supervisor";
    static String  DB_PASSWORD ="Supervisor";

    public static Connection getDBConnection() {
        Connection dbConnection = null;
  /*     try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your SQL JDBC Driver?");
            System.out.println(e.getMessage());
        }
*/
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

}
