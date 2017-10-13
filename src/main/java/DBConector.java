import java.sql.*;
import java.util.ArrayList;

public class DBConector {
    static String  DB_CONNECTION ="jdbc:mysql://10.0.14.152:3306/Tavriav790_T?autoReconnect=true&useSSL=false";
    static String  DB_USER ="Supervisor";
    static String  DB_PASSWORD ="Supervisor";


    public static Connection getDBConnection() {
        Connection dbConnection = null;
      try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your SQL JDBC Driver?");
            System.out.println(e.getMessage());
        }

        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }


    public  ArrayList<String> selectResultList (String query, String returnColumn)
    {


        //    String selectTableSQL = "SELECT top 1 Id from CashPointUA_T_R.dbo.Contact order by CreatedOn desc";
        ArrayList<String> list = new ArrayList<>();
        String selectTableSQL = query ;
     //   selectTableSQL ="SELECT Name FROM Contact WHERE Name = 'Oleg Mysterious Uknowovych';";
        Statement statement ;
        DBConector conector = new DBConector();
        try {
            System.out.println(DBConector.getDBConnection());
            System.out.println("---------------Ответ SQL------------------");
            statement = conector.getDBConnection().createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            // И если что то было получено то цикл while сработает
            while (rs.next()) {
                String result = rs.getString(returnColumn);
                list.add(result);
                System.out.println("Result: " + result);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------------");

        return list;
    }




}
