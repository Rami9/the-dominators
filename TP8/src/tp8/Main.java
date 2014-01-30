/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp8;

/**
 *
 * @author radhi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Departement d=new Departement(1,"Dept07");
       Employe e=new Employe(1,90,"Employe1","ra");
        Departement d1=new Departement(2,"Dept76");
       Employe e1=new Employe(2,1,"Employe2","as");
       SocieteHashMap h=new SocieteHashMap();
       h.ajouterEmployeDepartement(e,d);
       Employe e3=new Employe(1,90,"Employe1","ra");
       h.ajouterEmployeDepartement(e1, d1);
       h.ajouterEmployeDepartement(e3, d1);
       //h.supprimerDepartement(e);
       h.afficherLesEmployesLeursDepartements();
      System.out.println(h.rechercherDepartement(d1));
      System.out.println( h.rechercherEmploye(e));
      SocieteTreeMap t=new SocieteTreeMap();
      t.ajouterEmployeDepartement(e, d);
      t.ajouterEmployeDepartement(e1, d);
      t.afficherLesEmployesLeursDepartements();
    }

}
