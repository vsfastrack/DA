package design.patterns.factory;

public enum ShapeEnum {
    CIRCLE("SHAPE_CIRCLE" , "Circle"),
    SQUARE("SHAPE_SQUARE" , "Square"),
    RECTANGLE("SHAPE_RECTANGLE" , "Rectnagle");
    private final String shapeCode;
    private final String shapeDescription;
    ShapeEnum(String code , String description){
        this.shapeCode = code;
        this.shapeDescription = description;
    }

    public String getShapeCode() {
        return shapeCode;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }
}
