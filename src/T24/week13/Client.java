package T24.week13;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);

        // 램프를 켜는 커맨드를 설정함
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        // 램프를 끄는 커맨드를 설정함
        button1.setCommand(lampOffCommand);
        button1.pressed();

    }
}
