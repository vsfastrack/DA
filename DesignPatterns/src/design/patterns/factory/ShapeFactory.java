package design.patterns.factory;

public class ShapeFactory{
    public static Shape getShape(String shapeType){
        if(ShapeEnum.SQUARE.equals(ShapeEnum.valueOf(shapeType))){
            return new Sqaure();
        }else if(ShapeEnum.RECTANGLE.equals(ShapeEnum.valueOf(shapeType))){
            return new Rectangle();
        }else if(ShapeEnum.CIRCLE.equals(ShapeEnum.valueOf(shapeType))){
            return new Circle();
        }
        return null;
    }
}
