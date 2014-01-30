/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heritage;

/**
 *
 * @author radhi
 */
public  class Personne {
    protected String nom;
    protected int cin;
    public Personne(){System.out.println("Constructeur par default Personne");};
    public Personne(String n,int c){nom=n;cin=c;
    System.out.println("Constructeur a parametres Personne");}
public String getNom(){return nom;}
public int getCin() {return cin;}
public void setNom(String nom){
    this.nom=nom;
}
public void setCin(int cin ){this.cin=cin;}

public String toString(){
    return nom+" "+cin;}
//public boolean equals (Personne p){
//    if(this.cin==p.getCin()&&this.nom.equals(p.getNom()))
  //      return true;
 //   return false;
//}
public boolean equals(Object o)
   {
    if (o.getClass()!=this.getClass())//if(o instanceof Personne)
        return false;                //
 Personne p=(Personne) o;
 if(this.cin==p.getCin()&&this.nom.equals(p.getNom()))
   return true;
    return false;

}

}
