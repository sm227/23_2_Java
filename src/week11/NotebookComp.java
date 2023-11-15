package week11;

public class NotebookComp extends Computer{
    private int battary;
    public NotebookComp (String  name, int initChag) {
        super(name);
        battary = initChag;
    }
    public void charge() {
        battary += 5;
    }
    public  void useBattary() {
        battary -= 1;
    }
    public void  movingCal() {
        if (getBattaryInfo() < 1) {
            System.out.println("층전이 필요합니다.");
            return;
        }
        System.out.println("이동하면서");
        calculate();
        useBattary();
    }
    public int getBattaryInfo() {
        return battary;
    }
}
