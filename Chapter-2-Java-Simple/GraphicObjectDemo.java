public class GraphicObjectDemo {
    public static void main(String[] args) {
        GraphicObjectDemo_Circle circle = new GraphicObjectDemo_Circle(10);
        circle.moveTo(5, 7);
        circle.draw();
        circle.resize();
        circle.draw();
    }
}

abstract class GraphicObjectDemo_GraphicObject {
    int x;
    int y;

    void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }

    abstract void draw();
    abstract void resize();
}

class GraphicObjectDemo_Circle extends GraphicObjectDemo_GraphicObject {
    private int radius;

    GraphicObjectDemo_Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("GraphicObjectDemo_Circle at " + x + ", " + y + " radius " + radius);
    }

    @Override
    public void resize() {
        if (radius < 100) {
            radius *= 2;
        }
    }
}
