import java.sql.*;

public class Demo {

    public static void main(String[] args) {

      //  String sql = "select name from product_type where id=1";
        String sql = "insert into public.\"Students\" (name,surname,email) values ('Bob', 'Hogan', 'bobby@gmail.com');";



        String url = "jdbc:postgresql://localhost:5432/albertcordina";
        String username = "postgres";
        String password = "Forecastoflove1516";
        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to PostgreSQL server.");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            String name = resultSet.getString(1);
            System.out.println(name);

            connection.close();

        } catch (SQLException e) {
            System.out.println("Error in connection to PostgreSQL server.");
            e.printStackTrace();
        }
    }
}
