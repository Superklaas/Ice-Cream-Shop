package be.vdab.sellers;

import be.vdab.eatables.*;

public class IceCreamCar implements IceCreamSeller{

    // data fields
    private PriceList priceList;
    private Stock stock;
    private double totalProfit;

    // constructors
    public IceCreamCar() {};
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    // obtain total profit
    public double getProfit() {
        return totalProfit;
    }

    // order cone
    public Cone orderCone(Flavor[] balls)
            throws NoMoreIceCreamException {
        if (stock.getCones() > 0 && stock.getBalls() > 0) {
            Cone cone = prepareCone(balls);
            return cone;
        } else
            throw new NoMoreIceCreamException("Out of stock");
    }
    private Cone prepareCone(Flavor[] balls) {
        Cone cone = new Cone(balls);
        totalProfit += priceList.getBallPrice()*balls.length;
        stock.setCones(stock.getCones()-1);
        stock.setBalls(stock.getBalls()-1);
        return cone;
    }

    // order ice rocket
    public IceRocket orderIceRocket()
            throws NoMoreIceCreamException {
        if (stock.getIceRockets() > 0) {
            IceRocket iceRocket = prepareIceRocket();
            return iceRocket;
        } else
            throw new NoMoreIceCreamException("Out of stock");
    }
    private IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        stock.setIceRockets(stock.getIceRockets()-1);
        return iceRocket;
    }

    // order magnum
    public Magnum orderMagnum(MagnumType magnumType)
            throws NoMoreIceCreamException {
        if (stock.getMagni() > 0) {
            Magnum magnum = prepareMagnum(magnumType);
            return magnum;
        } else
            throw new NoMoreIceCreamException("Out of stock");
    }
    private Magnum prepareMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        totalProfit += priceList.getMagnumPrice(magnumType);
        stock.setMagni(stock.getMagni()-1);
        return magnum;
    }
}

