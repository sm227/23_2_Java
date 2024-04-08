package T24.week06.p2;

public class Actor {
    protected String name;


    public Actor(String name) {
        this.name = name;
    }
    public void play() {
        System.out.printf("배우 %s 은 연기합니다\n", name);
    }
}
