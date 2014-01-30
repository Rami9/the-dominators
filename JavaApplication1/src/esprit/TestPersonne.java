/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package esprit;

/**
 *
 * @author radhi
 */
public class TestPersonne {
public static void main (String []args){
    Personne p=new Personne();
    p.setNom("a");
    p.setAge(78);
   Personne p1=new Personne();
    p1.setNom("a");
    p1.setAge(78);
System.out.println(p);
System.out.println(p.equals(p1));
}
}
