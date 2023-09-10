package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /* Injection des dependances par
         instantiation statique => new  */
        MetierImpl metier=new MetierImpl();
        metier.setDao(new DaoImpl());
        System.out.println("Resultat: "+metier.calculer());
    }
}
