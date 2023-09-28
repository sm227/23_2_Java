class Test2 {
    public boolean pass2(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum/3;

        return avg >= 60;
    }
}
public class Main2 {
    public static void main(String[] args) {
    Test2 a = new Test2();
    boolean b = a.pass2(70,70,70);
    if(b) System.out.println("합격");
    else System.out.println("불합격");


    }

}
