package sda.gamecharacter;

import org.junit.Assert;
import org.junit.Test;

public class HeroTest {
    Hero hero = new Hero(100, 10);
    NonPlayerCharacter enemy1 = new NonPlayerCharacter(100, 2);

    @Test
    public void attack() {
        hero.setViata(enemy1.attack(hero));
        System.out.println(hero.getViata());
        Assert.assertEquals(98, hero.getViata());

        /*enemy1.setViata( hero.attack(enemy1));
        System.out.println(enemy1.getViata());
        Assert.assertEquals(90, enemy1.getViata());*/
    }
}