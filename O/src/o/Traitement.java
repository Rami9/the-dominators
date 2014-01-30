/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package o;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author radhi
 */
public class Traitement {
    private Connection con=  MaConnexion.getCurrentconnection();
    public void ajouterFilm(Film f)
    {
try{
    String requete ="insert into Film(id,Titre,producteur) values (?,?,?)";
PreparedStatement pstm =con.prepareStatement(requete);
  pstm.setInt(1,f.id);
  pstm.setString(2,f.Titre);
  pstm.setString(3,f.producteur);
    pstm.executeQuery();
    }catch(SQLException e)
            {
                System.out.println(e.getMessage());
    }
    }
public void afficher(){
    try{
        String requete ="Select *from Film";
        Statement stm =con.createStatement();
     ResultSet ns= stm.executeQuery(requete);
    while(ns.next()){
        System.out.println(ns.getInt(1)+" "+ns.getString(2));
    }
    }catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }
}
}
