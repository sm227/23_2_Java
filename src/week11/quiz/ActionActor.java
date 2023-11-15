package week11.quiz;

public class ActionActor extends Actor{
    private String actions;

    public ActionActor(String name , String actions) {
        super(name, actions);
        this.actions = actions;
    }

    public ActionActor(String name, String perform, String actions) {
        super(name, perform);
        this.actions = actions;
    }

    public void start() {
        System.out.printf("액션배우 %s 은 %s 를 연습합니다 \n", name, actions);
        System.out.printf("액션배우%s 은 연기합니다 \n", name);
    }
}


