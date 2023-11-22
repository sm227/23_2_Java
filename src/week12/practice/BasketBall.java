package week12.practice;

public class BasketBall extends Sports{
    public BasketBall() {
        super("gemini", 20, "100만 달러");
        printInfo();
    }
    public void playGame() {
        System.out.println(name + "가 손으로 공을 던집니다.");
    }
}

