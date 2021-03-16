package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.entity.GarageDoor;
import headfirst.designpatterns.command.interfaces.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
