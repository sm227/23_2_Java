package week12.test1;

abstract class Shape {
    String name;
    int area;
    public Shape(String name, int area) {
        this.name = name;
        this.area = area;

    }

    public void printArea() {}

    public String getName() {
        return name;
    }

}
