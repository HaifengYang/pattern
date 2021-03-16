package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.entity.TV;
import headfirst.designpatterns.command.interfaces.Command;

public class TVOpenCommand implements Command {
    private TV tv;

    public TVOpenCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.sound(11);
        tv.channel(4);
    }
}
