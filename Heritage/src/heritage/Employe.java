/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heritage;

/**
 *
 * @author radhi
 */
public class Employe extends Personne{
    public String matricule;
    public String date;
    public Employe ()
    {
        super();//SUPER fait appel au constructeur par default de la classe mére
    System.out.println("constructeur par default Employe");
    }
public Employe (String matricule ,String date)
{
    super();//appel implicite si on fé pas

    this.matricule=matricule;this.date=date;
System.out.println("COnstructeur a parametres 1 employe");
}
public Employe (int cin,String nom,String matricule,String date)
    {
      super( nom, cin);
    this.matricule=matricule;this.date=date;
    System.out.println("Construct 2");
  
}
public void afficheAtt(){
    System.out.println(this.cin);
    System.out.println(this.nom);
}

public String toString (){

    return super.toString()+" "+ date+" "+matricule;
}
public boolean equals (Employe e)
    {
    if(super.equals(e)&&this.date.equals(e.date) &&
            this.matricule.equals(e.matricule))
    return true ;
    return false ;
     
}





}

