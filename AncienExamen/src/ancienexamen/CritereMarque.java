/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ancienexamen;

/**
 *
 * @author radhi
 */
public class CritereMarque {
    private String marque;

 public CritereMarque(String marque) {

 this.marque = marque;

 }

 public boolean estSatisfaitPar(Voiture v) {
return v.getMarque().equals(marque);

 }

}
