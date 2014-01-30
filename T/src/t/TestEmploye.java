/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class TestEmploye {
    public  static void main(String []args){
     Diplome d=new Diplome("Bac","200000");

   Diplome d1=new Diplome("Master","00");
 Employe e=new Employe("R","a",d,12997);
e.ajouterDiplome(d1);
//e.afficherDiplome();
e.supprimerDiplome("Bac");
e.afficherDiplome();


    }
}
