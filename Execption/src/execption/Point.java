/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package execption;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author radhi
 */
public class Point {
    private int x;
    private int y;
public Point(int x ,int y) throws CreationExecption{
    if(x<0 || y<0){
           
                throw new CreationExecption();
            } 
    else
       this.x=x;
       this.y=y;
}
public void deplacer(int dx,int dy) throws DeplacementExp{
    x+=dx;
    y+=dy;
    if(x<0 || y<0){
        throw new DeplacementExp();
    }
}

}
