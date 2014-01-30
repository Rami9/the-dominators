/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package o;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author radhi
 */
public class MaConnexion {
   private String url="jdbc:mysql://localhost:3306/";
   private String nomUser="root";
   private String mdp="";
   private String nomBd="cinema";
private static Connection con;
private MaConnexion(){

}
    public Connection getConnection()  {
   try{//chargement de driver
     Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection(url+nomBd,nomUser,mdp);
       System.out.println("Connection etablie");
   }catch(ClassNotFoundException e){
       System.out.println("errerur de chargement de driver"+e.getMessage());
   }catch (SQLException s){
       System.out.println("Erreur de connection"+s.getMessage());
   }
    return con;
}
     public static Connection getCurrentconnection(){
        if(con==null)
        {
            con=new MaConnexion().getConnection();
        }return con;
    }
}
