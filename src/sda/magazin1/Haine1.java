package sda.magazin1;

import sda.magazinalimentar.UnitateDeMasura;

public class Haine1 extends Produs1 {
    private String numeMaterial;
    private UnitateDeMasura1 unitateDeMasura1;

   /* public Haine1() {
    }*/
    public Haine1(){
        super.setUnitateDeMasura1(UnitateDeMasura1.BUCATA);
    }

    @Override
    public UnitateDeMasura1 getUnitateDeMasura1() {
        return unitateDeMasura1;
    }

    @Override
    public void setUnitateDeMasura1(UnitateDeMasura1 unitateDeMasura1) {
        this.unitateDeMasura1 = UnitateDeMasura1.BUCATA;
    }

    public String getNumeMaterial() {
        return numeMaterial;
    }

    public void setNumeMaterial(String numeMaterial) {
        this.numeMaterial = numeMaterial;
    }
}
