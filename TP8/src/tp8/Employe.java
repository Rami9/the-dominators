/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp8;

/**
 *
 * @author radhi
 */
public class Employe implements Comparable<Employe>{
    public String nom;
    public String prenom;
    public int cin;
    public int matr;
public Employe (){
    
}
public Employe(int c ,int m,String n,String p)
    {prenom=p;
     cin=c;
     matr=m;
    nom=n;
}
   public String toString (){
    return cin+" "+nom+" "+prenom+" "+matr;
}
public boolean equals(Object obj)
   {
  if(obj==null)
      return false;
  if(obj.getClass() !=this.getClass())
      return false;
  Employe e=(Employe)obj;
  if(cin==e.cin)
      return true;
  return false;
}
public int hashCode(){
    return 0;
}

    public int compareTo(Employe o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
