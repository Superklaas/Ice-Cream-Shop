package be.vdab.sellers;

import be.vdab.eatables.*;

public interface IceCreamSeller extends Profitable {
    Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException;
}
