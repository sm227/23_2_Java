package week11.quiz;

public class Actor {
    public String name;
    private String perform;

    public  Actor(String name) {
        this.name = name;
    }
    public  Actor(String name, String perform) {
        this.name = name;
        this.perform = perform;
    }

    public void start() {
        System.out.printf("%s 은 연기합니다 \n", name);
    }
}
