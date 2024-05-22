package design.patterns.factory.method;

import java.util.Objects;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(Objects.equals(shape, "Circle")){
            return new Circle();
        } else if(Objects.equals(shape, "Rectangle")){
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
