/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heritage;
import Test.Employe2;

/**
 *
 * @author radhi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Personne p1=new Personne();
      Personne p2=new Personne("RADHI",1237892379);
    Personne p3=new Personne("RA",12379);
      Employe e1=new Employe ();
      Employe e2 =new Employe ("TN","1990 08");
      Employe e3=new Employe(9,"Houli","13","MAR");
      Employe e4=new Employe(000,"Houli","13","MAR");
     // System.out.println(e2);
      System.out.println(p3);
    //   System.out.println(e3);
     //  System.out.println(p1.equals(p2));
     //  System.out.println(e4.equals(e3));
//e3.afficheAtt();
    }

}
