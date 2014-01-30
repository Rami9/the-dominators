/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poly;

/**
 *
 * @author radhi
 */
public class Personne {
 protected String nom;
    protected int cin;
    public Personne(){

    }
    public Personne (int cin,String nom){
        this.nom=nom;this.cin=cin;
    }
public String getNom(){return nom;}
public int getCin() {return cin;}
public void setNom(String nom){
    this.nom=nom;
}
public void setCin(int cin ){this.cin=cin;}
public String toString(){
    return nom+" "+cin;}

}


