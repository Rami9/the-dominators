/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class TestSociete {
    public static void main (String []args){
    Societe s=new Societe();
    s.setNom("a");
    s.setEmplacement("charguia");
   Societe s1=new Societe();
    s1.setNom("b");
    s1.setEmplacement("manar");
       Societe s2=new Societe();
    s2.setNom("a");
    s2.setEmplacement("charguia");
System.out.println(s);
System.out.println(s.equals(s2));

}

   }