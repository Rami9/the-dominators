/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp7;

/**
 *
 * @author radhi
 */
public class Enseignant implements Comparable<Enseignant>{
public int id;
public String nom;
public String prenom;
public Enseignant(){

}
public Enseignant(int i,String n,String p){
    nom=n;
    prenom=p;
    id=i;
}
public String toString (){
    return id+" "+nom+" "+prenom;
}
public boolean equals(Object obj)
   {
  if(obj==null)
      return false;
  if(obj.getClass() !=this.getClass())
      return false;
  Enseignant e=(Enseignant)obj;
  if(id==e.id)
      return true;
  return false;
}
public int hashCode(){
    return 1;
}

    public int compareTo(Enseignant o) {
        return nom.compareTo(o.nom);
    }
}
