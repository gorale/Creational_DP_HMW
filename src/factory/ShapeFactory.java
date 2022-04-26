package factory;

public class ShapeFactory {
    public Shape createShape(String choose){
        switch (choose){
            case "triangle":
               return new TriangleShape();
            case "Rectangle":
               return new RectangleShape();
            default:
                throw new IllegalArgumentException("Unknown choose "+choose);

        }

    }
}
