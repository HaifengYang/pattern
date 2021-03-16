package headfirst.designpatterns.command.controller;

import headfirst.designpatterns.command.interfaces.Command;

public class SimpleRemoteController {
    private Command[] onCommand;
    private Command[] offCommand;

    public SimpleRemoteController() {
        onCommand = new Command[4];
        offCommand = new Command[4];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonIsPressed(int slot) {
        onCommand[slot].execute();

    }

    public void offButtonIsPressed(int slot){
        this.offCommand[slot].execute();
    }

}
