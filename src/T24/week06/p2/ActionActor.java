package T24.week06.p2;

public class ActionActor extends Actor{
    private String talent;

    public  ActionActor(String name, String talent){
        super(name);
        this.talent = talent;
    }

    public void play() {
        System.out.println(name );
    }
    public void excercise() {

    }
}
