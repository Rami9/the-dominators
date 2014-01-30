/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class Diplome {
    private String nom;
    private String date;
    static public int nbDiplome;
  public Diplome (String nom,String date)
    {
this.nom=nom;this.date=date;
nbDiplome++;
}

   public String getNom()
    {return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
   public String getDate()
    {return nom;
}
public void setDate(String date){
    this.date=date;
}
  public String toString ()
    {
      return nom+" "+date;

}
  public boolean equals(Diplome d){
      if (this.nom.equals(d.getNom())
              &&this.date.equals(d.getDate()))
          return true;
      return false;
  }
  static public int getNbDioplome()
    {
 return nbDiplome;
}

}
