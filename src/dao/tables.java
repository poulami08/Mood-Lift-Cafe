/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author POULAMI
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234561239','India','admin','Your first school name?','abc','true')";
            String categoryTable = "create table category (id int AUTO_INCREMENT primary key,name varchar(200))";
            Dboperations.setDataOrDelete(userTable,"User Table Created Successfully");
            Dboperations.setDataOrDelete(adminDetails,"Admin Details Added Successfully");
            Dboperations.setDataOrDelete(categoryTable,"Category Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
                    
        }
    }
}
