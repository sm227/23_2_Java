package week01;
/** (1) 자바메소드정리.java : 2라인-27라인 **/
class MethodTest1 {
    public int add (int a, int b) {
        int result = a+ b;
        return result;
    }
    public double mul (double a, int b) {
        return a * b;
    }
    public void sub (float a, float b) {
        float reault = a-b;
        System.out.println("결과값 = " + reault);
//        return; 생략
    }
}

public class Test1 {
    public static void main(String[] args) {
        MethodTest1 a = new MethodTest1();
        int b = a.add(10,20);
        System.out.println("덧셈 결과값 = " + b);
        System.out.println("덧셈 결과값 = " + a.add(10,20));
        double c = a.mul(2.5,3);
        System.out.println("곱셈 결과값 = " + c);
        System.out.println("곱셈 결과값 = " + a.mul(2.5,3));
        a.sub(2.5f, 1.2f);
//        System.out.println("뺄셈 결과값 = " + a.sub(2.5f, 1.2f)); [에러] 반환값이 없어서 출력할게 없음!
    }
}


