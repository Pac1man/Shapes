
public class Quad {

    Point p1,p2,p3,p4;

    enum Quads{
        rectangle,
        parallelogram,
        trapezium,
        differ}




    public Quad(){

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    @Override
    public String toString() {
        return "Quad{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }

    public static double quadArea(Quad quad){
        Point p1 = quad.getP1();
        Point p2 = quad.getP2();
        Point p3 = quad.getP3();

        double side1 = Point.distnans(p1,p2);
        double side2 = Point.distnans(p2,p3);
        double side3 = Point.distnans(p3,p1);
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
        return area;
    }

    public static double quadPer(Point p1, Point p2, Point p3, Point p4){
        return (Point.distnans(p1, p2) + Point.distnans(p2, p3) +
                Point.distnans(p3, p4) + Point.distnans(p4, p1));

    }
}
