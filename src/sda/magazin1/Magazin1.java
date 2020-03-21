package sda.magazin1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazin1 {
    private HashMap<Produs1, Integer> stockProduse = new HashMap<>();

    public Magazin1() {
    }

    //ok
    public void adaugaStockProdus(Produs1 produs, int stocProdus) {
        stockProduse.put(produs, stocProdus);
    }

    //ok
    public int cumparaProdus(Produs1 produs1) {
        int noulStocProdus = 0;
        for (Map.Entry<Produs1, Integer> intrare : stockProduse.entrySet()) {
            if (produs1.getNume().equals(intrare.getKey().getNume())) {

                System.out.println("Noul stoc pentru " + produs1.getNume() + " este " + " " + noulStocProdus);
            }
        }
        return noulStocProdus;
    }

    public void cumparaProduse(List<Produs1> produse) {
        int noulStocProdus = 0;

        for (int i = 0; i < produse.size(); i++) {
            for (Map.Entry<Produs1, Integer> intrare : stockProduse.entrySet()) {
                if (produse.get(i) == intrare.getKey()) {
                    stockProduse.put(produse.get(i), intrare.getValue() - 1);

                    System.out.println("Produsul " + produse.get(i).getNume() +
                            " este in stoc cu " + intrare.getValue() + " unitati");

                }

            }
        }

    }
// nu merge
    public void afiseazaStockProduse() {
        for (Map.Entry<Produs1, Integer> intrare : stockProduse.entrySet()) {
            Produs1 cheie = intrare.getKey();
            int value = intrare.getValue();
            System.out.println(cheie.getNume() + " " + value + " " + cheie.getUnitateDeMasura1());
        }
    }

    public void CautaProdus(String nume) {
        for (Map.Entry<Produs1, Integer> intrare : stockProduse.entrySet()) {
            Produs1 cheie = intrare.getKey();
            if (nume.equals(cheie.getNume())) {
                System.out.println("Produsul " + nume + " a fost gasit.");
            }
        }
    }

    //ok
    public int getStock(String nume) {
        int stoc = 0;
        for (Map.Entry<Produs1, Integer> intrare : stockProduse.entrySet()) {
            Produs1 cheie = intrare.getKey();
            if (nume.equals(cheie.getNume())) {
                stoc = intrare.getValue();
            }
        }
        return stoc;
    }
}


