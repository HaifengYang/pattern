package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.entity.Light;
import headfirst.designpatterns.command.interfaces.Command;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
