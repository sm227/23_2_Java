package week5;

/**
 * (3) 자바클래스정리2.java : 경찰예제1, 2, 시계예제
 */
public class Police {
    private int handcuffs;
    private Gun pistol;

    public Police(int bullet, int handcuffs) {
        this.handcuffs = handcuffs;
        if (bullet > 0) {
            this.pistol = new Gun(bullet);
        }
    }

    public void shoot() {
        if (pistol == null) {
            System.out.println("총 없음");
        }
        else {
            pistol.shoot();
        }
    }

    public void putHandcuff() {
        System.out.println("체포됨");
        handcuffs--;
    }

    public static void main(String[] args) {
        Police p1 = new Police(5,3);
        p1.shoot();
        p1.putHandcuff();

        Police p2 = new Police(0,3);
        p2.shoot();
        p2.putHandcuff();
    }
}
