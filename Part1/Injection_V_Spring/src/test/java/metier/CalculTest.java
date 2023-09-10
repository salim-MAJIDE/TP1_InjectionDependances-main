package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    Calcul calcul;

    @Test
    public void testSomme(){

        calcul=new Calcul();
       double res= calcul.somme(10,20);
       double expected=30;
        Assert.assertTrue(res==expected);


    }

}
