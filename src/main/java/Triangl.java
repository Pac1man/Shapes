import java.util.Scanner;

public class Triangl {

    Point x,y,z;
    Scanner scan = new Scanner(System.in);
    public Triangl() {

    }

    enum Triangles{equilateral, isosceles,
        rectangular, arbitrary}

    public Triangl(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    public static double area(Triangl triangle){

        Point p1 = triangle.getX();
        Point p2 = triangle.getY();
        Point p3 = triangle.getZ();

        double side1 = Point.distnans(p1,p2);
        double side2 = Point.distnans(p2,p3);
        double side3 = Point.distnans(p3,p1);
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
        return area;

    }

    @Override
    public String toString() {
        return "Triangle{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }


}
