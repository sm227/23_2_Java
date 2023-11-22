package week12.test1;

public class Triangle extends Shape {
    public Triangle(int a, int b) {
        super("삼각형", a*b/2);
    }

    public void printArea() {

        System.out.println(getName() + " 넓이: " + area);
    }
}
