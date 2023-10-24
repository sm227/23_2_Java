package week2;

/**
 * (2) 수업시간에 했던 합격 여부를 알려주는 메소드 설계 문제
 */
class Test {
    public void pass(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum/3;

        if (avg>=60) {
            System.out.println("합격입니다");
        }
        else System.out.println("불합격입니다");
    }
        }

public class Main {
    public static void main(String[] args) {
        Test a = new Test();
        a.pass(90,100,80);
    }
}