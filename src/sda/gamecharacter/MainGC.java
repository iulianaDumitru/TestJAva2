package sda.gamecharacter;

public class MainGC {

    public static void main(String[] args) {

        Hero hero = new Hero(100, 10);
        NonPlayerCharacter enemy1 = new NonPlayerCharacter(100, 2);

        int newLife = hero.attack(enemy1);
        System.out.println("viata lui enemy1 e: " + newLife);

        int newLifeHero = enemy1.attack(hero);
        System.out.println("viata lui hero e: " + newLifeHero);
    }
}
