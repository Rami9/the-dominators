/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package t;

/**
 *
 * @author radhi
 */
public class Employe {
private int cin;
public final int NB_MAX =20;
private String nom;
private String prenom;
public Diplome [] tabB;
public int nbDiplome;
public Employe (String nom,String prenom,Diplome br,int cin)
        {
    this.nom=nom;this.prenom=prenom;this.cin=cin;
    tabB=new Diplome[NB_MAX];
tabB [nbDiplome]=br;
nbDiplome ++;
}
public boolean ajouterDiplome(Diplome d1)
        {
    if(nbDiplome<NB_MAX)
    {
        tabB[nbDiplome] = d1;
    nbDiplome++;
return true;
    }
    return false;
}
public boolean rechercherDiplome(Diplome d)
    {   for (int i=0;i<nbDiplome ;i++) {
        if (tabB[i].equals(d))
 return true;
      }return false;
   }
     public void supprimerDiplome (String nom)
    {
        for (int i=0;i<nbDiplome ;i++)
        { if (tabB[i].getNom().equals(nom))
                {for (int j=i+1;j<nbDiplome;j++)
                        {
                            tabB[j-1] = tabB[j];
        }
        nbDiplome--;}
    }
   }
        public void afficherDiplome(){
            for(int i=0;i<nbDiplome;i++)
                System.out.println(tabB[i]);
        }

}



