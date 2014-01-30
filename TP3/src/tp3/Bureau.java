/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author radhi
 */
public class Bureau {
final int NB_MAX_CHERCHEUR=5;
private int code;
private String nom;
private Chercheur [] tabCher;
public static int nbChercheur;

public Bureau (int code ,String nom){
    this.code=code;this.nom=nom;tabCher=new Chercheur[NB_MAX_CHERCHEUR];
}
public String toString(){
    String res= code+" "+nom+" ";
    for(int i=0;i< nbChercheur;i++){
       res+= tabCher[i];
    }
    return res;
}

public boolean ajouterChercheur(Chercheur ch1){

if(nbChercheur<NB_MAX_CHERCHEUR)
{tabCher[nbChercheur]=ch1;
 nbChercheur++;
 return true;
}
return false;
}
public int trouverChercheur (Chercheur ch1){
    for (int i = 0;i<nbChercheur;i++)
    {
        if(tabCher[i].equals(ch1)     )
return i;
}
    return -1;
}
public static boolean compare(Bureau bureau1,Bureau bureau2)
    {
    if (bureau1.nbChercheur==bureau2.nbChercheur)
        return true;
    return false;
}

}
