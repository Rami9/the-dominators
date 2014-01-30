/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author radhi
 */
public class EspritArrayList implements University {
      List <Etudiant> ar;
  public EspritArrayList(){
       ar =new ArrayList <Etudiant>();
  }
    public void ajouterEtudiant(Etudiant e) {
      ar.add(e);
    }

    public boolean rechercherEtudiant(Etudiant e) {
     return  ar.contains(e);
    }

    public boolean rechercherEtudiant(String nom) {
        for(int i=0;i<ar.size();i++)
    {
       if(ar.get(i).nom.equals(nom))
           return true;
        }
        return false;
    }
    

    public void supprimerEtudiant(Etudiant e) {
   ar.remove(e);
    }

    public void displayEtudiants() {
           for(Etudiant e:ar){
           System.out.println(e);
       }

    }
    

    public void trierEtudiantsParId() {
      Collections.sort(ar);
    }

    public void trierEtudiantsParNom() {
       Collections.sort(ar, new CrtereNom());
    }

}
