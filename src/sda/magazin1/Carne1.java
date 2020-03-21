package sda.magazin1;

import sda.interfata.Persoana;

public class Carne1 extends Perisabile1 {
    private TipCarne1 tipCarne1;
    private UnitateDeMasura1 unitateDeMasura1;

    public TipCarne1 getTipCarne1() {
        return tipCarne1;
    }

    public Carne1() {
        super.setUnitateDeMasura1(UnitateDeMasura1.KILOGRAM);
    }

    public void setTipCarne1(TipCarne1 tipCarne1) {
        this.tipCarne1 = tipCarne1;
    }

}
