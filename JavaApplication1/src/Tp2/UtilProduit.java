/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tp2;

/**
 *
 * @author radhi
 */
public class UtilProduit {
    Produit[] tabProduit  ;
    final int MAX_TAB = 20;
    int nbProduit;
    public UtilProduit(){tabProduit =new Produit [MAX_TAB];}
    public void ajouterProduit(Produit p ){
        if(nbProduit<MAX_TAB)
        {
        tabProduit[nbProduit] = p;
        nbProduit++;
    }}
        public void afficherProduit(){
            for(int i=0;i<nbProduit;i++)
                System.out.println(tabProduit[i]);
        }
   public Produit recupererProduit (int idProduit){
for (int i=0;i<nbProduit;i++)
    {if(tabProduit [i].getIdProduit()==idProduit)
       return tabProduit[i];
        }return null;
    }
   public boolean rechercherProduit (int idProduit){
      for (int i=0;i<nbProduit ;i++) {
        if (tabProduit[i].equals(tabProduit[idProduit]))
 return true;
      }return false;
   }
   public void supprimerProduit (int idProduit)
    {
        for (int i=0;i<nbProduit ;i++)
        { if (tabProduit[i].getIdProduit()==idProduit)
                {for (int j=i+1;j<nbProduit;j++)
                        {
                            tabProduit[j-1] = tabProduit[j];
        }
        nbProduit--;}
    }
   }
}
