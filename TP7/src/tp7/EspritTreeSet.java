/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp7;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author radhi
 */
public class EspritTreeSet implements GestionEnseignant{
Set <Enseignant> s;
public EspritTreeSet(){
    s=new TreeSet<Enseignant>();
}
    public void ajouterEnseignant(Enseignant e) {
      s.add(e);
    }

    public boolean rechercherEnseignant(Enseignant e) {
    return s.contains(e);
    }

    public boolean rechercherEnseignant(int id) {
     for(Enseignant e :s)
    {
       if(e.id==id)
           return true;
        }
        return false;
    }


    public void supprimerEnseignant(Enseignant e) {
        s.remove(e);
    }

    public void displayEnseignants() {
     for(Enseignant e :s){
         System.out.println(e);
     }
    }



}
