package sda.magazin1;

public enum UnitateDeMasura1 {
    BUCATA("bucata"),
    KILOGRAM("kg");

    private String denumire;

    public String getDenumire() {
        return denumire;
    }

    UnitateDeMasura1(String denumire) {
        this.denumire = denumire;
    }
}
