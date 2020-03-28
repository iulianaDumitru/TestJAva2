package sda.TV;

public class TV {
    private int nrCanal;
    private int volum;
    private boolean stateTV;

    public TV() {
        this.nrCanal = nrCanal;
        this.volum = volum;
        this.stateTV = stateTV;
    }

    public void setNrCanal(int nrCanal) {
        if (stateTV==true) {
            this.nrCanal = nrCanal;
        }/*else{
            this.nrCanal = this.nrCanal;
        }*/
    }

    public int getNrCanal() {
        if (stateTV==true) {
            return nrCanal;
        } else return -1;
    }

    public int getVolum() {
        if (stateTV==true) {
            return volum;
        } else return -1;
    }

    public void setVolum(int volum) {
        if (stateTV==true) {
            this.volum = volum;
        }
    }

    public void setStateTV(boolean stateTV) {
        this.stateTV = stateTV;
    }

    public boolean isStateTV() {
        return stateTV;
    }

    public int increaseVolume() {
        if (stateTV==true) {
            if (this.volum == 50) {
                System.out.println("Maximum volume");
            } else if (this.volum < 50) {
                System.out.println("Increasing volume +++");
                this.volum = this.volum + 1;
            }
            return this.volum;
        }
        else return -1;
    }

    public int decreseVolume() {

        if (stateTV==true) {
            if (this.volum == 0) {
                System.out.println("Minimum volume");
            } else if (this.volum <= 50) {
                System.out.println("Decreasing volume ---");
                this.volum = this.volum - 1;
            }
            return this.volum;
        }
        else return -1;
    }

    public int nextChannel() {
        if (stateTV==true) {
            if (this.nrCanal == 100) {

                this.nrCanal = 1;
            } else if (this.nrCanal < 100) {

                this.nrCanal = this.nrCanal + 1;
            }
            return this.nrCanal;
        }
        else return -1;
    }

    public int beforeChannel() {
        if (stateTV==true) {
            if (this.nrCanal == 0) {
                this.nrCanal = 100;
            } else if (this.nrCanal > 0) {
                this.nrCanal = this.nrCanal - 1;
            }
            return this.nrCanal;
        }
        else return -1;
    }

}


