package headfirst.designpatterns.command.entity;


public class TV {
    public void on(){
        System.out.println("TV is on.");
    }

    public void off(){
        System.out.println("TV is off.");
    }

    public void sound (int capacity){
        System.out.println("TV sound is " + capacity);
    }

    public void channel (int which){
        System.out.println("TV`s channel is " + which);
    }
}
