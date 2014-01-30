/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package esprit;

/**
 *
 * @author radhi
 */
public class Personne {
    private String nom;
    private int age;
public String getNom(){return nom;}
public int getAge() {return age;}
public void setNom(String nom){
    this.nom=nom;
}
public void setAge(int age ){this.age=age;}
public String toString(){
    return nom+" "+age;}
public boolean equals (Personne p){
    if(this.nom.equals(p.getNom())&&this.age==p.getAge())
        return true;
    return false;
}
}

