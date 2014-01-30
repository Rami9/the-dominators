/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author radhi
 */
public class EspritHashSet implements GestionEnseignant{
Set <Enseignant> se;
  public EspritHashSet(){
      se =new HashSet <Enseignant>();
  }


    public void ajouterEnseignant(Enseignant e) {
        se.add(e);
    }

    public boolean rechercherEnseignant(Enseignant e) {
       return se.contains(e);
    }

    public boolean rechercherEnseignant(int id) {
     for(Enseignant e :se)
    {
       if(e.id==id)
           return true;
        }
        return false;
    }

    public void supprimerEnseignant(Enseignant e) {
    se.remove(e);
    }

    public void displayEnseignants() {
    //   for(Enseignant e:se)
    //        System.out.println(e);
    Iterator <Enseignant> it =se.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
}
