package ch.hslu.oop.Week_4;

public class Line2 {

    Point point1;
    Point point2;

    public Line2(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public String getLine(){
        return String.format("(%d;%d),(%d;%d)",point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }

    public void setLine(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

}
