package sda.magazin1;

public enum TipCarne1 {
    PORC("porc"), PUI("pui"), PESTE("peste");

    private String fel;

    public String getFel() {
        return fel;
    }

    TipCarne1(String fel) {
        this.fel = fel;
    }
}
