package sda.magazin1;

import sda.magazinalimentar.Fructe;

import java.util.ArrayList;
import java.util.List;

public class MainM1 {
    public static void main(String[] args) {
        Magazin1 magazin1 = new Magazin1();
        List<Produs1> cosCumparaturi = new ArrayList<Produs1>();

        Produs1 produs1 = new Fructe1();
        produs1.setNume("Mere");

        Produs1 produs2 = new Carne1();
        produs2.setNume("Carne");
        Produs1 produs3 = new Haine1();
        produs3.setNume("Blugi");

        cosCumparaturi.add(produs1);
        cosCumparaturi.add(produs1);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);

        magazin1.adaugaStockProdus(produs1, 50);
        magazin1.adaugaStockProdus(produs2, 30);
        magazin1.adaugaStockProdus(produs3, 20);

        magazin1.afiseazaStockProduse();
        //magazin1.cumparaProdus(produs1);
        //magazin1.cumparaProduse(cosCumparaturi);
       /*int stocNouMere = magazin1.getStock("Mere");
        System.out.println("Stocul pentru mere este: " + stocNouMere);*/
       //magazin1.CautaProdus("Mere");
        /*int mereInStoc = magazin1.getStock("Mere");
        System.out.println("Stocul este: "+ mereInStoc);*/
    }
}
