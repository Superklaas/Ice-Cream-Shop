package be.vdab.sellers;

import be.vdab.eatables.MagnumType;

public class PriceList {

    // data fields
    private double ballPrice = 1;
    private double rocketPrice = 2.5;
    private double magnumStandardPrice = 2;

    // constructors
    public PriceList() {};
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    // setters
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }
    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }
    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    // getters
    public double getBallPrice() {
        return ballPrice;
    }
    public double getRocketPrice() {
        return rocketPrice;
    }
    public double getMagnumPrice(MagnumType type) {
        double magnumPrice = magnumStandardPrice;
        // if en de code block van de if nooit op één lijn, met curly braces!
        if (type == MagnumType.ALPINENUTS) magnumPrice = 1.5*magnumStandardPrice;
        if (type == MagnumType.ROMANTICSTRAWBERRIES) magnumPrice = 2*magnumStandardPrice;
        return magnumPrice;
    }
}
