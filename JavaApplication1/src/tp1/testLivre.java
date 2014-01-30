/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

/**
 *
 * @author radhi
 */
public class testLivre {
    public static void main( String []args)
    {Livre l1=new Livre();
     l1.setAuteur("yyy");
     l1.setTitre("azeaz");
     l1.setNbPages(8);
        Livre l2 =new Livre("a","b",2);
   l1.afficheToi();
System.out.println(l1.equals(l2));
}
}
