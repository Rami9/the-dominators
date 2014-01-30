/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

/**
 *
 * @author radhi
 */
public class Etudiant implements Comparable <Etudiant>{
public int id;
public String nom;
public String prenom;
public Etudiant(){

}
public Etudiant (int i,String n,String p){
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
  Etudiant e=(Etudiant)obj;
  if(id==e.id)
      return true;
  return false;
}

    public int compareTo(Etudiant o) {
      if(id <o.id)
          return -1;
      else if(id>o.id)
          return 1;
                  else
                     return 0;
   //   return (nom.compareTo(o.nom));
    }

}
