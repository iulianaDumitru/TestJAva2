package sda.interfata;

public  class Persoana implements Comparable<Persoana>{
    private int varsta;

    public Persoana(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }


    @Override
    public int compareTo(Persoana persoana1) {
        int result = 0;
        if(persoana1.getVarsta() > this.getVarsta()){
            result = -1;
        }else if(persoana1.getVarsta() < this.getVarsta()){
            result = 1;
        }else if(persoana1.getVarsta() == this.getVarsta()){
            result =0;
        }
        return result;
    }
}
