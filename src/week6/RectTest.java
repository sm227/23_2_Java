package week6;
class Point{
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Point(int a, int b) {
        this.X = a;
        this.Y = b;
    }
}
class Rect{
    private Point start;
    private Point end;

    public Rect(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public int getArea() {
        int height = end.getY() - start.getY();
        int width = end.getX() - start.getX();


        return height * width;
    }
    public int getCircum(){
        int height = end.getY() - start.getY();
        int width = end.getX() - start.getX();

        return (height + width) * 2;
    }
    public Rect(int x1, int x2 , int y1, int y2) {
        this.start = new Point(x1,x2);
        this.end = new Point(y1,y2);
    }
}
class RectTest{
    public static void main(String[] args){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);
        Rect a = new Rect(p1, p2);
        System.out.print("시작점(" + a.getStart().getX() + "," + a.getStart().getY() + ")");
        System.out.println("끝점(" + a.getEnd().getX() + "," 	+ a.getEnd().getY() + ")");
        System.out.println("넓이=" + a.getArea());
        System.out.println("둘레=" + a.getCircum());
        Rect b = new Rect(10, 10, 20, 20);
        System.out.print("시작점(" + b.getStart().getX() + "," + b.getStart().getY() + ")");
        System.out.println("끝점(" + b.getEnd().getX() + "," 	+ b.getEnd().getY() + ")");
        System.out.println("넓이=" + b.getArea());
        System.out.println("둘레=" + b.getCircum());
    }
}