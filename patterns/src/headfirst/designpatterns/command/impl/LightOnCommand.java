package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.interfaces.Command;
import headfirst.designpatterns.command.entity.Light;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
