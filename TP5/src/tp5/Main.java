/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

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
   Etudiant e=new Etudiant (1,"radhi","Houli");
   Etudiant e1=new Etudiant (2,"oh","sh");
   Etudiant e2=new Etudiant (9,"habla","goz");
  // System.out.println( e.equals(e1));
 //  System.out.println( e.toString());
   EspritVector ev=new EspritVector();
     Etudiant e3=new Etudiant (0,"radicali","ASK");
   ev.ajouterEtudiant(e3);
   ev.ajouterEtudiant(e);
ev.ajouterEtudiant(e2);
ev.ajouterEtudiant(e1);
   System.out.println(ev.rechercherEtudiant("radicali"));
 //  ev.displayEtudiants();
  ev.trierEtudiantsParId();
  ev.displayEtudiants();
  ev.trierEtudiantsParNom();
  ev.displayEtudiants();
    }

}
