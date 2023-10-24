package week2;

class Test3 {
    public String pass3(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum/3;

        if (avg>=60) return "합격";
        else return "불합격";

    }
}
public class Main3 {
    public static void main(String[] args) {
        Test3 a = new Test3();
        String b = a.pass3(100,100,100);
        System.out.println(b);
    }
}
