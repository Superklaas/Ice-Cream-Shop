package be.vdab.eatables;

public class Cone implements Eatable {
    private Flavor[] balls = {Flavor.BANANA};
    public Cone() {};
    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    public void eat() {
        // enkelvoud in return: ball ipv balls
        if (balls.length == 1) {
            System.out.print("You are eating a cone with " + balls.length + " ball, flavor ");
            System.out.print(balls[0].toString().toLowerCase());
            System.out.println();
        }
        // meervoud in print: balls
        else {
            System.out.print("You are eating a cone with " + balls.length + " balls, flavors ");
            for (int i = 0; i < balls.length; i++) {
                System.out.print(balls[i].toString().toLowerCase() + " ");
            }
            System.out.println();
        }
    }
}
