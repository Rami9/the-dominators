/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poly;

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
        
        Personne p= new Personne (97,"Radi");
System.out.println(p.toString());
Etudiant e=new Etudiant(1,"radicali","1323");
System.out.println(e.toString());
e.afficher();
Personne p1 =e;
Etudiant e3=(Etudiant) p;
e3.afficher();
    }

}
