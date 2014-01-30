/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author radhi
 */
public class Laboratoire {
public final int NB_MAX_BUREAU =50;
private String nom;
private String specialite;
public Bureau [] tabB;
public int nbBureau;
public Laboratoire (String nom,String specialite,Bureau br)
        {
    this.nom=nom;this.specialite=specialite;
    tabB=new Bureau[NB_MAX_BUREAU];
tabB [nbBureau]=br;
nbBureau ++;
}
public boolean ajouterBureau(Bureau b1)
        {
    if(nbBureau<NB_MAX_BUREAU)
    {
        tabB[nbBureau] = b1;
    nbBureau++;
return true;
    }
    return false;
}


}
