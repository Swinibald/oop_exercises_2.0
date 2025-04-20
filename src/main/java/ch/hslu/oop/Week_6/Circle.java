package ch.hslu.oop.Week_6;

public class Circle  extends Shape{
    private int radius;

    public Circle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.radius = width/2;
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
