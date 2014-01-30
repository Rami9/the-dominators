/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author radhi
 */
public class EspritVector implements University {
        List <Etudiant> vect;
public EspritVector (){
    vect=new Vector <Etudiant>();
}

    public void ajouterEtudiant(Etudiant e) {
  vect.add(e);
    }

    public boolean rechercherEtudiant(Etudiant e) {
        
        return vect.contains(e);
    }

    public boolean rechercherEtudiant(String nom) {
    for(int i=0;i<vect.size();i++)
    {
       if(vect.get(i).nom.equals(nom))
           return true;
        }
        return false;
    }
    public void supprimerEtudiant(Etudiant e) {
       vect.remove(e);
    }

    public void displayEtudiants() {
       for(Etudiant e:vect){
           System.out.println(e);
       }

    }

    public void trierEtudiantsParId() {
      
        Collections.sort(vect);
    }

    public void trierEtudiantsParNom() {
    Collections.sort(vect, new CrtereNom());
    }

    
}
