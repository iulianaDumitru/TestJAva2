package sda.interfata;

import org.junit.Assert;
import org.junit.Test;

public class PatratTest {
    Patrat patrat1 = new Patrat(2);
    Patrat patrat2 = new Patrat(3);

    @Test
    public void compareTo() {
        int result = patrat1.compareTo(patrat2);
        Assert.assertEquals(result,1);
    }
}