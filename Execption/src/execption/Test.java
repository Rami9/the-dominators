/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package execption;

/**
 *
 * @author radhi
 */
public class Test {

       public static void main(String[] args){
           try
           {

           System.out.println("la division de 5% ="+5/0);
           }
           catch(ArithmeticException ae){
               System.out.println(ae.getMessage());
           }
           }
}
