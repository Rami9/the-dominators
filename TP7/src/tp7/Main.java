/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp7;

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
        Enseignant e=new Enseignant (2,"AR","AS");
        Enseignant e2=new Enseignant (1,"w","NY");
        Enseignant e3=new Enseignant (1,"w","NY");
        System.out.println(e.toString());
        System.out.println(e.equals(e2));
        EspritHashSet s=new EspritHashSet();
        s.ajouterEnseignant(e);
        s.ajouterEnseignant(e2);
        s.ajouterEnseignant(e3);
        s.displayEnseignants();
        System.out.println(s.rechercherEnseignant(1));
        System.out.println(s.rechercherEnseignant(e2));

        EspritTreeSet set=new EspritTreeSet();
        set.ajouterEnseignant(e);
        set.ajouterEnseignant(e2);
        set.displayEnseignants();
        

    }

}
