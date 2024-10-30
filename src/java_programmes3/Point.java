package java_programmes3;

/**
 * Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
   constructor). The second constructor has parameters x and y of type int and it needs to initialize the
   fields.
  Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this
 Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance
 between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance
 between this Point and another Point as double.
 NOTE: Use Math.sqrt to calculate the square root √.
 NOTE: Try to avoid duplicated code.
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 7 methods.

 */
public class Point {

    private int x;
    private int y;

    // No-arg constructor
    public Point() {
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the x value
    public int getX() {
        return x;
    }

    // Method to get the y value
    public int getY() {
        return y;
    }

    // Method to set the x value
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the y value
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate the distance from this point to the origin (0,0)
    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    // Method to calculate the distance from this point to another point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // Method to calculate the distance from this point to another Point object
    public double distance(Point another) {
        return distance(another.x, another.y);
    }

    public static void main(String[] args) {
        // Test code
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());  // distance from (6,5) to (0,0)
        System.out.println("distance(second)= " + first.distance(second));  // distance from (6,5) to (3,1)
        System.out.println("distance(2,2)= " + first.distance(2, 2));  // distance from (6,5) to (2,2)

        Point point = new Point();
        System.out.println("distance()= " + point.distance());  // distance from (0,0) to (0,0)
    }

}

