/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ancienexamen;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author radhi
 */
public class Agence {
    private String nom;

 private ListVoiture vs;

 private Map<Client, ListVoiture> ClientVoitureLoue;

 public Agence(String nom) {
this.nom=nom;
vs=new ListVoiture();
ClientVoitureLoue=new HashMap<Client,ListVoiture>();
 }

 public void ajoutVoiture(Voiture v) throws VoitureException{
vs.ajoutVoiture(v);
 }


 public void suppVoiture(Voiture v)throws

VoitureException{

 vs.supprimeVoiture(v);

 }

 public void loueClientVoiture(Client cl, Voiture v)throws VoitureException{

if(ClientVoitureLoue.containsKey(cl))
{
    ListVoiture lv=ClientVoitureLoue.get(cl);
    lv.ajoutVoiture(v);
ClientVoitureLoue.put(cl, lv);
}else{
    ListVoiture lv =new ListVoiture ();
    lv.ajoutVoiture(v);
    ClientVoitureLoue.put(cl, lv);
}

 }

 public void retourClientVoiture(Client cl , Voiture v)

throws VoitureException{

 // à completer

 }

public List<Voiture> selectVoitureSelonCritere(Critere

c){

 //à completer

 }

 public Set<Client> ensembleClientsLoueurs(){

 // à completer

 }

 public Collection<ListVoitures>

collectionVoituresLouees(){

 // à completer

 }

 public void afficheLesClientsEtLeursListesVoitures(){

 //à compléter

}

 public Map<Client, ListVoitures> triCodeCroissant(){

 // à completer

 }

public Map<Client, ListVoitures> triNomCroissant(){

 // à completer

 }

}
