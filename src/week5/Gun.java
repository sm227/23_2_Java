package week5;

public class Gun {
    private int bullet;

    public Gun(int bullet) {
        this.bullet = bullet;
    }

    public void shoot() { // 메소드 위임됨.
        System.out.println("총알 발사");
        bullet --;
    }
}
