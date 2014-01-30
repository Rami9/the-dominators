/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class TestDiplome {
public static void main (String []args){
    Diplome d=new Diplome("Bac","200000");

   Diplome d1=new Diplome("BAC++++","00");

System.out.println(d);System.out.println(d1);
System.out.println(d.equals(d1));
System.out.println(Diplome.nbDiplome);
}
}
