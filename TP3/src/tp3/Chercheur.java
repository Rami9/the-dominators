/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author radhi
 */
public class Chercheur {
  private  String nom;
  private  String poste;
  private  int numOrdinateur;
 static public  int nbChercheurs;
  public Chercheur (String nom,int numOrdinateur,String poste)
    {
this.nom=nom;this.numOrdinateur=numOrdinateur;this.poste=poste;nbChercheurs++;
}
  public int getNumOrdinateur(){return numOrdinateur;}
 public String getPoste(){
     return poste;
 }
  public String getNom()
    {return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
  public void setPoste(String poste){
      this.poste=poste;
  }
  public void setNumOrdinateur (int numOrdinateur){
      this.numOrdinateur=numOrdinateur;
  }
  public String toString ()
    {
      return nom+" "+numOrdinateur+" "+poste+" ";

}
  public boolean equals(Chercheur c){
      if (this.nom.equals(c.getNom())
              &&this.numOrdinateur==c.getNumOrdinateur()
              &&this.poste.equals(c.getPoste()))
          return true;
      return false;
  }

}
