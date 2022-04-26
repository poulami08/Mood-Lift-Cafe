/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql*;
/**
 *
 * @author POULAMI
 */
public class ConnectionProvider {
    public static connection getCon(){
        try{
            Class.forName("com_mysql")
            
        }
        catch(Exception e){
            return null;
        }
    }
    
}
