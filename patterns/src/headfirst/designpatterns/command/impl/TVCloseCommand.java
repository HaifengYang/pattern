package headfirst.designpatterns.command.impl;

import headfirst.designpatterns.command.entity.TV;
import headfirst.designpatterns.command.interfaces.Command;

public class TVCloseCommand implements Command {
    private TV tv;

    public TVCloseCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
