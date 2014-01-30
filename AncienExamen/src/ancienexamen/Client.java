/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ancienexamen;

/**
 *
 * @author radhi
 */
public class Client {

    private int code;

private String nom;

private String prenom;

public Client(int code, String nom, String

prenom) {

this.code=code;
this.nom=nom;
this.prenom=prenom;

 }



public int getCode() {

 return code;

}

public void setCode(int code) {

 this.code = code;

}

public String getNom() {

 return nom;

}

public void setNom(String nom) {

 this.nom = nom;

}

public String getPrenom() {

 return prenom;

}

public void setPrenom(String prenom) {

 this.prenom = prenom;

}

public int hashCode() {

return 0;

}

public boolean equals(Object obj) {

if(obj==null)
      return false;
  if(obj.getClass() !=this.getClass())
      return false;
  Client c=(Client)obj;
  if(code ==c.code)
      return true;
  return false;
}

public String toString(){

return code+" "+nom+" "+prenom;

}}

