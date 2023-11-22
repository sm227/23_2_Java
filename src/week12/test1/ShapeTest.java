package week12.test1;

public class ShapeTest {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(10, 20);
        Square sq1 = new Square(10, 5);
        Square sq2 = new Square(10,10);
        Triangle tr2 = new Triangle(20,10);

        Shape[] sh = new Shape[4];
        sh[0] = tr1;
        sh[1] = sq1;
        sh[2] = sq2;
        sh[3] = tr2;

        for(int i = 0; i< sh.length; i ++) {
            sh[i].printArea();
        }

    }
}
