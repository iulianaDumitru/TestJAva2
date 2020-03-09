package sda.interfata;

import org.junit.Assert;
import org.junit.Test;

public class PersoanaTest {
    Persoana pers1 = new Persoana(34);
    Persoana pers2 = new Persoana(28);

    @Test
    public void compareTo() {
    int rezultat = pers1.compareTo(pers2);

        Assert.assertEquals(1,rezultat);
    }
}
