package be.vdab.application;

import be.vdab.eatables.*;
import be.vdab.sellers.*;

import static be.vdab.eatables.Flavor.*;

public class IceCreamApp2 {
    public static void main(String[] args) {

        // object instantiation: ice cream car, price list, stock
        PriceList priceList = new PriceList();
        Stock stock = new Stock();
        IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock);

        // order & eat cone
        try {
            Cone i1 = iceCreamCar.orderCone(new Flavor[]{STRACIATELLA, STRAWBERRY, BANANA});
            i1.eat();
        } catch (NoMoreIceCreamException ex) {
            System.out.println("You can't order more cones");
        }

        // order & eat ice rocket 1
        try {
            IceRocket i2 = iceCreamCar.orderIceRocket();
            i2.eat();
        } catch (NoMoreIceCreamException ex) {
            System.out.println("You can't order more ice rockets");
        }

        // order & eat ice rocket 2
        try {
            IceRocket i3 = iceCreamCar.orderIceRocket();
            i3.eat();
        } catch (NoMoreIceCreamException ex) {
            System.out.println("You can't order more ice rockets");
        }

        // order & eat magnum
        try {
            Magnum i4 = iceCreamCar.orderMagnum(MagnumType.ALPINENUTS);
            i4.eat();
        } catch (NoMoreIceCreamException ex) {
            System.out.println("You can't order more ice magnums");
        }

        // calculate profit made by ice cream car
        System.out.println("The profit is €" + iceCreamCar.getProfit());
    }
}





