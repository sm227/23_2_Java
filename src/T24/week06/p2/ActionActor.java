package T24.week06.p2;

public class ActionActor extends Actor {
    private String talent;

    public ActionActor(String name, String talent) {
        super(name);
        this.talent = talent;
    }

    public void play() {
        System.out.printf("배우 %s은 %s 을 연습합니다\n", name, talent);
    }

    public void excercise() {
        System.out.printf("배우 %s은 액션연기합니다\n", name);
    }
}
