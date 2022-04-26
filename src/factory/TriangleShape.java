package factory;

import factory.Shape;

public class TriangleShape implements Shape {

    @Override
    public void shape() {
        System.out.println("Triangle shape");
    }
}
