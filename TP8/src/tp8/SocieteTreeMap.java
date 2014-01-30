/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp8;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author radhi
 */
public class SocieteTreeMap implements Societe{
Map<Employe,Departement> Tmap;
public  SocieteTreeMap(){
    Tmap=new TreeMap<Employe,Departement>();
}
       public void ajouterEmployeDepartement(Employe e, Departement d) {
  Tmap.put( e,d);
    }

    public void supprimerEmploye(Employe e) {
       Tmap.remove(e);
    }
 public void supprimerDepartement(Employe e) {

     for(Entry <Employe,Departement> record: Tmap.entrySet())
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

        Iterator <Entry<Employe,Departement>> it =Tmap.entrySet().iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }

    public void afficherLesEmployes() {
        for (Employe e:Tmap.keySet())
            System.out.println(e);
    }

    public void afficherLesDepartements() {
    System.out.println(  Tmap.values());
    }

    public void afficherDepartement(Employe e) {
        System.out.println(Tmap.get(e));
    }

    public boolean rechercherEmploye(Employe e) {
       return Tmap.containsKey(e);
    }

    public boolean rechercherDepartement(Departement e) {
       return Tmap.containsValue(e);
    }

}
