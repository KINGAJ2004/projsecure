package com.secure.projsecure.dao;

import com.secure.projsecure.data.UserDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDetailsDaoImpl {

    static final String DBURL = "jdbc.mysql://127.0.0.1/User";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "sunday123";

    public void addUser(UserDetails userDetails){
        String insertUser = "insert into UserDetails(UserId, firstName, lastName, addressLine1, addressLine2 , postCode, phoneNumber, emailAddress" +
                             "values" + (userDetails.getUserId()) +
                              "," + (userDetails.getFirstName()) +
                              "," + (userDetails.getLastName()) +
                              "," + (userDetails.getAddressLine1()) +
                               "," + (userDetails.getAddressLine2()) +
                               "," + (userDetails.getPostCode()) +
                               "," + (userDetails.getPhoneNumber()) +
                               "," + (userDetails.getEmailAddress());
        try{
            Connection connection = DriverManager.getConnection(DBURL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(insertUser);
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
