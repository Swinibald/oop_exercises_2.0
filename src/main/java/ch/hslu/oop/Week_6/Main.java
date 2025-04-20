package ch.hslu.oop.Week_6;

public class Main {


    public static void main(String[] args) {
        Shape shape1;
        Shape shape2;
        Circle circle = new Circle(10, 10, 5, 5);
        Rectangle rectangle = new Rectangle(10, 5, 20, 10);
        shape1 = circle;
        shape2 = rectangle;
        shape1.move(10, 10);
        System.out.println(shape1.getX());
        System.out.println(shape1.getPerimeter());
    }

}
