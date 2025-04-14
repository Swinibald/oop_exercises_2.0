package ch.hslu.oop.Week_5;

public class Circle  extends Shape{
    private int radius;
    private int diameter;

    public Circle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.radius = width/2;
        this.diameter = height;
        }
        
    @Override
    public int getArea(){
        return (int) (Math.pow(this.radius, 2) * Math.PI);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * radius * Math.PI);
    }
}
