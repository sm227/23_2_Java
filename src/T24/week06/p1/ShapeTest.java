package T24.week06.p1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arrayOfShapes = new Shape[3];
        ShapeTest test = new ShapeTest();
        test.init(arrayOfShapes);
        test.drawAll(arrayOfShapes);
    }

    public void init(Shape[] arrayOfShapes) {
        arrayOfShapes[0] = new Rectangle();
        arrayOfShapes[1] = new Triangle();
        arrayOfShapes[2] = new Circle();
    }

    public void drawAll(Shape[] arrayOfShapes) {
        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].draw();
        }
    }
}
