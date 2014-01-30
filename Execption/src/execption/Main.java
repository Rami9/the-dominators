/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package execption;

/**
 *
 * @author radhi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CreationExecption {
        // TODO code application logic here
      try
            {   Point p1=new Point (1,2);
        Point p2 =new Point(-1,-7);
  Point p3 =new Point(0,-7);
      }
  catch (CreationExecption ce)
            {
                System.out.println(ce.getMessage());
            }finally {
                System.out.println("FIN DE Traitement");
                   }

    try
    {
        Point p9=new Point(3,6);
    p9.deplacer(0, -7);
}
    catch(DeplacementExp de)
    {
        System.out.println(de.getMessage());
    }
            catch (CreationExecption ce){
                System.out.println(ce.getMessage());
            }

    }
}
