/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import heritage.Personne;


/**
 *
 * @author radhi
 */
public class Employe2 extends Personne{
    public String matricule;
    public String date;
    public Employe2 ()
    {
        super();//SUPER fait appel au constructeur par default de la classe mére

    }
public Employe2 (String matricule ,String date)
{
    super();//appel implicite si on fé pas

    this.matricule=matricule;this.date=date;

}
public Employe2 (int cin,String nom,String matricule,String date)
    {
      super( nom, cin);
    this.matricule=matricule;this.date=date;


}
public void afficheAtt(){
    System.out.println(this.cin);
    System.out.println(this.nom);
}

public String toString (){

    return super.toString()+" "+ date+" "+matricule;
}
public boolean equals (Employe2 e)
    {
    if(super.equals(e)&&this.date.equals(e.date) &&
            this.matricule.equals(e.matricule))
    return true ;
    return false ;

}
}

