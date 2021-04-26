package design.patterns.factory;

public class TestRunner {
    public static void main(String[] args)throws InterruptedException{
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
        Thread.sleep(2000);
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Thread.sleep(2000);
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
