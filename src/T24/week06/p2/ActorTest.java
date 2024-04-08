package T24.week06.p2;

public class ActorTest {
    public static void main(String[] args) {
        Director d = new Director();
        d.cast(new Actor("박보검"));
        d.cast(new ActionActor("우도환", "돌려차기"));
        d.cast("김태리", "발차기");
        d.direct();
    }
}
