package week12.practice;

public class Soccer extends Sports{
    public Soccer() {
        super("johnharu", 25, "150만 달러");
        printInfo();

    }
    public void playGame() {
        System.out.println(name + "가 발로 공을 찹니다");
    }
}
