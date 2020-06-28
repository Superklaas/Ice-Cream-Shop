package be.vdab.application;

import be.vdab.eatables.*;
import be.vdab.sellers.IceCreamSalon;
import be.vdab.sellers.IceCreamSeller;
import be.vdab.sellers.PriceList;

import static be.vdab.eatables.Flavor.*;

public class IceCreamApp1 {
    public static void main(String[] args) {

        // object instantiation: pricelist, icecream salon
        PriceList priceList = new PriceList();
        // In de opgave staat dat je de iceCreamSalon in een variabele van type IceCreamSeller moet steken.
        // IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        // order ice cream
        Cone i1 = iceCreamSalon.orderCone(new Flavor[]{STRACIATELLA, STRAWBERRY, BANANA});
        IceRocket i2 = iceCreamSalon.orderIceRocket();
        Magnum i3 = iceCreamSalon.orderMagnum(MagnumType.ALPINENUTS);

        // eat ice cream
        Eatable[] orderedIceCreams = {i1, i2,i3};
        for (int i = 0; i < orderedIceCreams.length; i++) {
            orderedIceCreams[i].eat();
        }

        // calculate profit
        System.out.println("The profit is €" + iceCreamSalon.getProfit());
    }
}
