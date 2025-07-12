package org.example.team;

public class GarageDoorUpCommand implements Command {
    GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
