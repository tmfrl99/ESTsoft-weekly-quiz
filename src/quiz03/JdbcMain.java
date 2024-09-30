package quiz03;

import java.sql.*;

public class JdbcMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String userName = "root";
        String password = "0000";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students WHERE age BETWEEN 30 AND 39");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");

                System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
            }
        } catch (SQLException e) {
            System.out.println("SQL 에러 발생: " + e.getMessage());
        }
    }
}

