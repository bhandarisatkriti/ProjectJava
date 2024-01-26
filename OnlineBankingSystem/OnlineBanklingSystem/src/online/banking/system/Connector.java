package online.banking.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Connector {
    Connection connection;

    Statement statement;
    public Connector(){

    try{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineBanking","root","Satkriti1@#4");
        statement=connection.createStatement();
        System.out.println(connection);

    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
