package headfirst.designpatterns.template;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pureInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void pureInCup(){
        System.out.println("Puring in cup.");
    }

    public abstract void brew();

    public abstract void addCondiments();

}
