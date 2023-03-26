package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

public class Cofe {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.printf("%s $ %f\n", espresso.getDescription(), espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast); // 可以用多層裝飾器裝飾
        darkRoast = new Whip(darkRoast);
        System.out.printf("%s $ %f\n", darkRoast.getDescription(), darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.printf("%s $ %f\n", houseBlend.getDescription(), houseBlend.cost());

    }
}
