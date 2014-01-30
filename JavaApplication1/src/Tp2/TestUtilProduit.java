/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tp2;

/**
 *
 * @author radhi
 */
public class TestUtilProduit {
    public  static void main(String []args){
        Produit prod =new Produit (2,"livre",100);
   Produit prod1 =new Produit (1,"chaise",200);
 UtilProduit up=new UtilProduit();
 up.ajouterProduit(prod);
 up.ajouterProduit(prod1);
 up.afficherProduit();
System.out.println( up.recupererProduit(1));
System.out.println( up.rechercherProduit(1));
up.supprimerProduit(2);
up.afficherProduit();
    }

}
