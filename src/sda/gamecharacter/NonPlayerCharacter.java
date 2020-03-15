package sda.gamecharacter;

public class NonPlayerCharacter extends GameCharacter {
    private String name;


    public NonPlayerCharacter(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    @Override
    int decressLife(int val) {
        return getViata() - val;
    }

    @Override
    int attack(GameCharacter gameCharacter) {
        System.out.println("O sa te atac");

        return decressLife(gameCharacter.getPutereDeAtac());

    }
}
