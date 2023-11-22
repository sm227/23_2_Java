package week12.test1;


public class Square extends Shape {
    int a;
    int b;
    public Square(int a, int b) {
        super("사각형", a*b);
        this.a = a;
        this.b = b;
    }
    public void printArea() {

        System.out.println(getName() + " 넓이: " + area);
        System.out.println(getName() + "둘레: " + (a+b)*2);
    }

}
