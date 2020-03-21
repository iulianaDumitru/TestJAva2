package sda.magazin1;

public class Fructe1 extends Perisabile1 {
    private String taraOrigine;
    private  UnitateDeMasura1 unitateDeMasura1;

    public String getTaraOrigine() {
        return taraOrigine;
    }

    public void setTaraOrigine(String taraOrigine) {
        this.taraOrigine = taraOrigine;
    }
    public Fructe1() {
        super.setUnitateDeMasura1(UnitateDeMasura1.KILOGRAM);
    }
    /*@Override
    public UnitateDeMasura1 getUnitateDeMasura1() {
        return unitateDeMasura1;
    }

    @Override
    public void setUnitateDeMasura1(UnitateDeMasura1 unitateDeMasura1) {
        this.unitateDeMasura1 = UnitateDeMasura1.KILOGRAM;
    }*/
}
