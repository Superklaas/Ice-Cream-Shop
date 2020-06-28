package be.vdab.sellers;

import be.vdab.eatables.*;

public class IceCreamSalon {
    PriceList priceList;
    double totalProfit;
    public IceCreamSalon() {};
    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }
    public double getProfit() {
        return totalProfit;
    }
    public Cone orderCone(Flavor[] balls) {
        Cone cone = new Cone(balls);
        totalProfit += priceList.getBallPrice()*balls.length;
        return cone;
    }
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;
    }
    public Magnum orderMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        totalProfit += priceList.getMagnumPrice(magnumType);
        return magnum;
    }
}
