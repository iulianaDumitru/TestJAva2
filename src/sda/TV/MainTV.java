package sda.TV;

public class MainTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.setStateTV(true);
        tv1.setNrCanal(100);
        tv1.setVolum(49);


       int newVol = tv1.increaseVolume();
        System.out.println(newVol);
 /*       int newVol2 = tv1.decreseVolume();
        System.out.println(newVol2);*/

      /* int newChannel =  tv1.nextChannel();
        System.out.println("Noul canal este: " + newChannel);*/

    }
}
