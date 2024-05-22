package PostgreSQL;

import java.sql.*;

public class PostgreSQL {
    public static void main(String[] args) throws ClassNotFoundException {

        //jdbc:dbname://ip:port/databasename
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "postgres";
        String password = "123";

        Class.forName("org.postgresql.Driver");

                 //  connection  is use for db connection with dburl,username and password
        try (Connection connection = DriverManager.getConnection(url, user, password))
         {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student");

            while (rs.next()) {
            	 int rollNo=rs.getInt("roll");
                 String name=rs.getString("name");
                 String gender=rs.getString("gender");
                 String favFood=rs.getString("fav_food");
                 System.out.println(rollNo+" "+name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}







//   
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class PostgreSQL {
//
//    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydatabase";;
//    private static final String JDBC_USER = "postgres";
//    private static final String JDBC_PASSWORD = "123";
//
//    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//             Statement stmt = conn.createStatement()) {
//             
//            String createTableSQL = """
//                CREATE TABLE employees (
//                    id int PRIMARY KEY,
//                       name VARCHAR,
//                        age INTEGER
//                )
//                """;
//
//            stmt.execute(createTableSQL);
//            System.out.println("Table 'employees' created successfully.");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}













//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class PostgreSQL {
//
//  private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydatabase";;
//  private static final String JDBC_USER = "postgres";
//  private static final String JDBC_PASSWORD = "123";
//    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//             Statement stmt = conn.createStatement()) {
//             
//            String selectSQL = "SELECT * FROM employees";
//
//            ResultSet rs = stmt.executeQuery(selectSQL);
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                
//                System.out.printf("ID: %d, Name: %s, Email: %s%n", id, name, email);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}










//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class PostgreSQL {
//
//  private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydatabase";;
//  private static final String JDBC_USER = "postgres";
//  private static final String JDBC_PASSWORD = "123";
//
//    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//             Statement stmt = conn.createStatement()) {
//
//            String insertSQL = "INSERT INTO users ( name,gender,fav_food) VALUES ('nisil','Male','Pizza');";
//         
//            int rowsAffected = stmt.executeUpdate(insertSQL);
//            if (rowsAffected > 0) {
//                System.out.println("Data successfully inserted!"+rowsAffected);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}





//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class PostgreSQL {
//
//  private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mydatabase";;
//  private static final String JDBC_USER = "postgres";
//  private static final String JDBC_PASSWORD = "123";
//    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//             Statement stmt = conn.createStatement()) {
//
//            String deleteSQL = "DELETE FROM users WHERE name = 'nisil'";
//            
//            int rowsAffected = stmt.executeUpdate(deleteSQL);
//            if (rowsAffected > 0) {
//                System.out.println("Data successfully deleted!");
//            } else {
//                System.out.println("No rows deleted. Please ensure the WHERE clause matches existing data.");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
