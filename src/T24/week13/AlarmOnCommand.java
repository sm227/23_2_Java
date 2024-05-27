package T24.week13;

public class AlarmOnCommand implements Command {
    private Alarm theAlarm;
    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }
    public void execute() {
        theAlarm.start();
    }
}
