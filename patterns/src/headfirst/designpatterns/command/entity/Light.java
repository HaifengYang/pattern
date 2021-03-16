package headfirst.designpatterns.command.entity;

public class Light {
    private String name;

    public Light() {
    }

    public Light(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(name + " is on.");
    }
    public void off(){
        System.out.println(name + " is off.");
    }
}
