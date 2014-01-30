/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poly;

/**
 *
 * @author radhi
 */
public class Etudiant extends Personne{
    private String numCarte;
    public Etudiant(){
        }
    public Etudiant(int cin,String nom,String numCarte){
       this.cin=cin;
       this.nom=nom;
       this.numCarte=numCarte;
    }
    public String toString (){
        return super.toString()+" "+numCarte;

    }
    public void afficher ()
    {
        System.out.println(super.toString()+" "+numCarte);
    }

}
