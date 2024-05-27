package T24.week09;

class shape {
    protected int x,y;

    public void draw() {

    }
}

class Rectangle extends shape {
    private int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("");
    }
}

class Triangle extends shape {

}

class Circle extends shape {

}

public class test {
    public static void main(String[] args) {

    }
}
