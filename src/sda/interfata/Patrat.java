package sda.interfata;

public class Patrat implements Comparable<Patrat> {
    private double latura;

    public double getArea() {
        return latura * latura;
    }

    public double getLatura() {
        return latura;
    }



    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public int compareTo(Patrat patrat) {
        int rezultat = 0;
        if (patrat.getArea() > this.getArea()) {
            rezultat = -1;
            return rezultat;
        } else if (patrat.getArea() < this.getArea()) {
            rezultat = 1;
            return rezultat;
        } else if (patrat.getArea() == this.getArea()) {
            rezultat = 0;
            return rezultat;
        }
        return rezultat;
    }

}
