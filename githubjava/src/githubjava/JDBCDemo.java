package githubjava;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/jdbcdemo";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // optional


            String username = "root";
            String password = "";


            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from student2");
            while(resultset.next()){
                System.out.println(resultset.getInt(1)+" "+ resultset.getString(2)+resultset.getInt(3));
            }

            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}