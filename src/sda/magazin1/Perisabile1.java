package sda.magazin1;

import sda.magazinalimentar.UnitateDeMasura;

import java.util.Date;

public class Perisabile1 extends Produs1{
    private Date dataFabricatie;
    private Date dataExpirare;


    public Perisabile1() {
    }

    public Date getDataFabricatie() {
        return dataFabricatie;
    }

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

}
