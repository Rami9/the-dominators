/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;
import java.util.Comparator ;


/**
 *
 * @author radhi
 */
public class CrtereNom implements Comparator <Etudiant>{

    public int compare( Etudiant e1,Etudiant e2)
    {
        return e1.nom.compareTo(e2.nom);
    }
}

