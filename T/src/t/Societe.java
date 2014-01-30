/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class Societe {
    public final int MAX=100;
    private String nom ;
    private String emplacement;
    public Employe [] tabE;
 public Societe(){};
 public int nb;
public Societe (String nom,String emplacement,Employe e)
        {
    this.nom=nom;this.emplacement=emplacement;
    tabE=new Employe[MAX];
tabE [nb]=e;
nb ++;
}






    public String getNom()
    {return nom;}

public void setNom(String nom){
    this.nom=nom;
}
  public String getEmplacement()
    {return emplacement;
}
public void setEmplacement(String emplacement){
    this.emplacement=emplacement;
}
public String toString(){
    return nom+" "+emplacement;}
public boolean equals (Societe s)
{
    if(this.nom.equals(s.getNom())&&this.emplacement.equals(s.getEmplacement()))
        return true;
    return false;
}


}
