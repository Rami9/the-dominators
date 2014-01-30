/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tp2;

/**
 *
 * @author radhi
 */
public class Produit {
    public int idProduit;
    public String libelleProduit;
    public float prixHorsTaxe;
    public Produit (){};
    public Produit(int a,String l ,int b)
    {
idProduit=a;libelleProduit=l;prixHorsTaxe=b;
}
    public void setIdProduit(int idProduit){
    this.idProduit =idProduit ;
}
    public void setLibelleProduit(String libelleProduit){
    this.libelleProduit=libelleProduit;
}
        public void setPrixHorsTaxe(int prixHorsTaxe){
    this.prixHorsTaxe =prixHorsTaxe ;
}
        public int getIdProduit() {return idProduit;}
    public float getPrixHorsTaxe() {return prixHorsTaxe;}
public String getLibelleProduit() {return libelleProduit;}
public String toString(){return idProduit +" "+prixHorsTaxe+" "+libelleProduit;}
public boolean equals (Produit p){
if (this.idProduit==p.getIdProduit()&&this.prixHorsTaxe==p.getPrixHorsTaxe()
        &&this.libelleProduit.equals(p.getLibelleProduit()))
            return true;
 return false;}
}
