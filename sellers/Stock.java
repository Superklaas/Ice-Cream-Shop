package be.vdab.sellers;

public class Stock {

    // data fields
    
    // Waarden hardcoden in data fields doe je best niet. Dit is specifiek voor een seller, kan je niet op voorhand bepalen in je model.
    private int iceRockets = 1;
    private int cones = 2;
    private int balls = 5;
    private int magni = 7;

    // constructor
    public Stock() {};
    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    // getters & setters
    public int getIceRockets() {
        return iceRockets;
    }
    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }
    public int getCones() {
        return cones;
    }
    public void setCones(int cones) {
        this.cones = cones;
    }
    public int getBalls() {
        return balls;
    }
    public void setBalls(int balls) {
        this.balls = balls;
    }
    public int getMagni() {
        return magni;
    }
    public void setMagni(int magni) {
        this.magni = magni;
    }
}
