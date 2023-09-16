abstract class GraphicObject {
    int x, y;

    public GraphicObject() {
        System.out.println("base abstract class is java");
    }

    void moveto(int newX, int newY) {
        System.out.println("move to x" + x + "move to y" + y);
    }

    abstract void draw();

    abstract void resize();
}

class Rectangle extends GraphicObject {
    void draw() {
        System.out.println("draw a rectangle");
    }

    void resize() {
        System.out.println("resize a rectangle");
    }

}

class Circle extends GraphicObject {
    void draw() {
        System.out.println("draw a circle");
    }

    void resize() {
        System.out.println("resize a circle");
    }
}

class Demo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.draw();
        r1.resize();
        Circle c1 = new Circle();
        c1.draw();
        c1.resize();
    }
}