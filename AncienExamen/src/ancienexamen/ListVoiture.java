/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ancienexamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author radhi
 */
public class ListVoiture {
    private List<Voiture> voitures;

 public ListVoiture(List<Voiture> voitures) {


  this.voitures=voitures;
 }

 public ListVoiture() {
voitures = new ArrayList <Voiture>() ;

 }

 public List<Voiture> getVoitures() {

 return voitures;

 }

 public void setVoitures(List<Voiture> voitures) {

this.voitures= voitures;

 }

 public void ajoutVoiture(Voiture v) throws VoitureException
             {
        if (voitures.contains(v)) {
    throw new VoitureException("La voiture existe");
}
    else{
     voitures.add(v);

    }


 }

 public void supprimeVoiture(Voiture v) throws VoitureException{

 if(voitures.contains(v)){
     voitures.remove(v);
 }else
     throw new VoitureException("Voiture nexiste pa a supprimer");

 }

 public Iterator<Voiture> iterateur(){

 return voitures.iterator();

 }

 public int size(){

 return voitures.size();

 }

 public void affiche(){
      for(Voiture v:voitures){
           System.out.println(v);
       }
 }

}
