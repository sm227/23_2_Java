package T24.week13;

public class LampOffCommand implements Command {
    private Lamp theLamp;

    public LampOffCommand(Lamp lamp) {
        this.theLamp = lamp;
    }
    public void execute() {
        theLamp.turnOff();
    }
}
