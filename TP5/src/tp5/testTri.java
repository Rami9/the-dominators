/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author radhi
 */
public class testTri {
    public static void main(String[] args) {

        String s1=new String ("salih");
        String s2=new String("mehdi");
        String s3=new String ("ali");
        List<String> vect=new Vector <String>();
        vect.add(s1);
        vect.add(s2);
        vect.add(s3);
        
        for(String s :vect){
            System.out.println(s);
        }
        
        Collections.sort(vect,Collections.reverseOrder());
    for(String s :vect){
            System.out.println(s);
        }
    }
    
}
