/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author radhi
 */
public class SocieteHashMap implements Societe {
Map<Employe,Departement> Hmap;
public SocieteHashMap(){
    Hmap=new HashMap<Employe,Departement>();
}
    public void ajouterEmployeDepartement(Employe e, Departement d) {
  Hmap.put(e,d);
    }

    public void supprimerEmploye(Employe e) {
       Hmap.remove(e);
    }
 public void supprimerDepartement(Employe e) {

     for(Entry <Employe,Departement> record: Hmap.entrySet())
     {
         if(record.getValue().equals(e))
             record.setValue(null);

    }
    }
    public void afficherLesEmployesLeursDepartements()
    {  // for(Entry <Employe,Departement> record: Hmap.entrySet())
       //     {
       //     System.out.println(record.getKey());
      //              System.out.println(record.getValue());
      //  }

        Iterator <Entry<Employe,Departement>> it =Hmap.entrySet().iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
     
    public void afficherLesEmployes() {
        for (Employe e:Hmap.keySet())
            System.out.println(e);
    }

    public void afficherLesDepartements() {
    System.out.println(  Hmap.values());
    }

    public void afficherDepartement(Employe e) {
        System.out.println(Hmap.get(e));
    }

    public boolean rechercherEmploye(Employe e) {
       return Hmap.containsKey(e);
    }

    public boolean rechercherDepartement(Departement e) {
       return Hmap.containsValue(e);
    }
}
