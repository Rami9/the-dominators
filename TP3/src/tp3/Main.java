/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author radhi
 */
public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Chercheur chercheur1=new Chercheur ("Radhi",1,"TTTT");
        Chercheur chercheur2=new Chercheur ("HOULI",2,"KKK");
        System.out.println(chercheur1.toString());
        System.out.println(chercheur2.toString());
        System.out.println(chercheur1.equals(chercheur2));
System.out.println(Chercheur.nbChercheurs);

Bureau bureau1=new Bureau(1,"ka");
Bureau bureau2=new Bureau(2,"RAFA");
    bureau1.ajouterChercheur(chercheur1);
    bureau1.ajouterChercheur(chercheur2);
    System.out.println(bureau1);
    System.out.println(Bureau.compare(bureau1, bureau2));
Laboratoire lab1=new Laboratoire ("S","sss",bureau1);
        Chercheur chercheur3=new Chercheur ("Zabaleta",2,"toul");
    bureau2.ajouterChercheur(chercheur3);
    lab1.ajouterBureau(bureau2);
    int m=0;
    for(int i=0;i<lab1.nbBureau;i++)
    {if(lab1.tabB[i].nbChercheur>m)
         System.out.println(lab1.tabB[i].toString());
    }

}
}
