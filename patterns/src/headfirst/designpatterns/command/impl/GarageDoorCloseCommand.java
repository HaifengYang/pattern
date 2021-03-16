package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.entity.GarageDoor;
import headfirst.designpatterns.command.interfaces.Command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }
}
