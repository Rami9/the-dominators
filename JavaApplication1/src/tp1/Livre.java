/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

/**
 *
 * @author radhi
 */
public class Livre {
private String titre;
private String auteur;
int nbPages;
public Livre (){}
public Livre (String unTitre,String unAuteur,int nb){
    nbPages=nb;titre=unTitre;auteur=unAuteur;
    }
public String getAuteur() {
return auteur;
}
public String getTitre() {
return titre;
}
public void setNbPages(int n) {
nbPages = n;
    }
public void setAuteur(String n) {
auteur = n;
    }public void setTitre(String n) {
titre = n;
    }
public String toString()
    {
    return titre + " " + auteur +" "+ nbPages;

}
public boolean equals (Livre p){
    if(this.auteur.equals(p.getAuteur())&&this.titre.equals(p.getAuteur()))
        return true;
    return false;
}
public void afficheToi()
    { System.out.println(toString());
}

}
