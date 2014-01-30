/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp8;

/**
 *
 * @author radhi
 */
public class Departement {

    public String nom;
    public int id ;
    public Departement(){

    }
    public Departement(int i,String n){
        nom=n;
        id=i;
    }
    public String toString (){
    return id+" "+nom;
}
public boolean equals(Object obj)
   {
  if(obj==null)
      return false;
  if(obj.getClass() !=this.getClass())
      return false;
  Departement d=(Departement)obj;
  if(id==d.id)
      return true;
  return false;
}
}
