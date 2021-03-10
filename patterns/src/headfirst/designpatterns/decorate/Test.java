package headfirst.designpatterns.decorate;

public class Test {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);
        Whip whip = new Whip(mocha);
        System.out.println(whip.getDescription());
        System.out.println(whip.cost());
    }
}
