package headfirst.designpatterns.command.test;

import headfirst.designpatterns.command.controller.SimpleRemoteController;
import headfirst.designpatterns.command.entity.GarageDoor;
import headfirst.designpatterns.command.entity.Light;
import headfirst.designpatterns.command.entity.TV;
import headfirst.designpatterns.command.impl.*;

public class Test {
    public static void main(String[] args) {
        SimpleRemoteController control = new SimpleRemoteController();

        Light light = new Light("Dinner room light");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        control.setCommand(0, lightOnCommand, lightOffCommand);

        Light livingRoomLight = new Light("living room light");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        control.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        control.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);

        TV tv = new TV();
        TVOpenCommand tvOpenCommand = new TVOpenCommand(tv);
        TVCloseCommand tvCloseCommand = new TVCloseCommand(tv);
        control.setCommand(3, tvOpenCommand, tvCloseCommand);

        for(int i = 0; i < 4; i++){
            control.onButtonIsPressed(i);
            control.offButtonIsPressed(i);
            System.out.println("-----------");
        }
    }
}
