package bank.management.system;

import java.sql.*;

public class conicon1 {

    Connection connection;
    Statement statement;
    public conicon1(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","yadav252@ayansh");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
