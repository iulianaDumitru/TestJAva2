package sda.gamecharacter;

public abstract class GameCharacter {
    private int viata;
    private int putereDeAtac;

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    public int getPutereDeAtac() {
        return putereDeAtac;
    }

    public GameCharacter(int viata, int putereDeAtac) {
        this.viata = viata;
        this.putereDeAtac = putereDeAtac;
    }

    public void setPutereDeAtac(int putereDeAtac) {
        this.putereDeAtac = putereDeAtac;
    }

    abstract int decressLife(int val);

    abstract int attack(GameCharacter gameCharacter);
}
