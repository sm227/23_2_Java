package week11;
abstract class Sports {
    String name;
    int age;
    String money;

    public Sports(String name, int age, String money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(money);
    }

    abstract void playGame();
}

class BasketBall extends Sports {
    public BasketBall() {
        super("gemini", 20, "100");
        printInfo();
    }
    public void playGame() {
        System.out.println(name + "손으로 공을 던짐");
    }
}
public class Abstract {
    public static void main(String[] args) {
        BasketBall gemini = new BasketBall();

    }

}
