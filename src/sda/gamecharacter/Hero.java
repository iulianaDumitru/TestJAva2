package sda.gamecharacter;

public class Hero extends GameCharacter {
    private String name;

    public Hero(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    int decressLife(int val) {
        return  getViata() - val;
    }

    @Override
    int attack(GameCharacter gameCharacter) {
        return decressLife(gameCharacter.getPutereDeAtac());
    }
}
