package be.vdab.eatables;

public class Magnum implements Eatable {
    private MagnumType type = MagnumType.MILKCHOCOLATE;
    public Magnum() {};
    public Magnum(MagnumType type) {
        this.type = type;
    }
    public MagnumType getType() {
        return type;
    }
    public void eat() {
        System.out.println("You are eating a magnum type " + type.toString().toLowerCase());
    }
}
