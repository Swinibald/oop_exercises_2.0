package ch.hslu.oop.Week_3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
    this.x = x;
    this.y = y;
        }
    
    public int getX() {
        return x;
        }

    public int getY() {
        return y;
        }

    public void setX(int x) {
        this.x = x;
        }

    public void setY(int y) {
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
