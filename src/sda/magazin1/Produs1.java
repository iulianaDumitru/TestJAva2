package sda.magazin1;

import sda.magazinalimentar.UnitateDeMasura;

public class Produs1 {
    private double pret;
    private String nume;
    private String cod;
    private String detalii;
    private String producator;
    private UnitateDeMasura1 unitateDeMasura1;

    public Produs1() {
       setUnitateDeMasura1(UnitateDeMasura1.BUCATA);
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setUnitateDeMasura1(UnitateDeMasura1 unitateDeMasura1) {
        this.unitateDeMasura1 = unitateDeMasura1;
    }

    public UnitateDeMasura1 getUnitateDeMasura1() {
        return unitateDeMasura1;
    }

}
