package headfirst.designpatterns.template;

public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping coffee throw filter.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Surge.");
    }
}
