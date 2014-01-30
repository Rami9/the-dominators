/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ancienexamen;

/**
 *
 * @author radhi
 */
public class CriterePrix {
private float prix;

 public CriterePrix(float prix) {

 this.prix = prix;

 }

 public boolean estSatisfaitPar(Voiture v) {

 return prix==v.getPrixLocation();
}
}
