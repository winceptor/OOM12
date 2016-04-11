public class GarageDoorCommand implements Command {

    private GarageDoor garagedoor;

    public GarageDoorCommand(GarageDoor gd) {
        garagedoor = gd;
    }

    public void execute() {
        garagedoor.open();
    }
}
