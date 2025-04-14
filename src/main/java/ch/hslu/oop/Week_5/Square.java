package ch.hslu.oop.Week_5;

public class Square extends Shape{
    private int side;

    public Square(final int x, final int y, final int width, final int height){
        super(x, y);
        this.side = width;
    }

    @Override
    public int getArea(){
        return (int) Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

}
