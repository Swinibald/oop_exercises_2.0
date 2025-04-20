package ch.hslu.oop.Week_6;

public class Point {
    private int x;
    private int y;
    private Point point;

    public Point(int x, int y){
    this.x = x;
    this.y = y;
        }

    Point(Point point){
        this.point = point;
    }

    public void moveRelative(int relX, int relY){
        this.x = x + relX;
        this.y = y + relY;
        }
    
    public void moveRelative(Point point){
        this.x = x + point.getX();
        this.y = y + point.getY();
    }

    public void moveRelative(double polarAngle, int lenght){
        this.x = (int) (x + (lenght * Math.cos(polarAngle)));
        this.y = (int) (y + (lenght * Math.sin(polarAngle)));
    }
    
    public int getX() {
        return x;
        }

    public int getY() {
        return y;
        }

    protected void setX(int x) {
        this.x = x;
        }

    protected void setY(int y) {
        this.y = y;
        }
    
    public String getQuad(){
        if ((x == 0) && (y == 0)) {
            return "Center";
        }else if (x == 0) {
            return "On x Axis";
        }else if (y == 0) {
            return "On y Axis";
        }else if ((x > 0) && (y > 0 )) {
            return "First Quadrant";
        }else if ((x > 0) && (y < 0 )) {
            return "Fourth Quadrant";
        }else if ((x < 0) && (y > 0 )) {
            return "Second Quadrant";
        }else if ((x < 0) && (y < 0 )) {
            return "Third Quadrant";
        }else{
            return "Coordinates invalid";
        }
    }
}
