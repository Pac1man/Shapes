import java.util.Scanner;

import static java.lang.Math.pow;


public class Point { int x, y;

    Scanner in = new Scanner(System.in);

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point() {

        System.out.println("Enter your coordinate x and y  ");
        x = in.nextInt();
        y = in.nextInt();


    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return "point{" + "x=" + x + ", y=" + y + '}';
    }

    public static Double distnans(Point p1, Point p2){
        return (pow(p2.getX() - p1.getX(), 2) - pow(p2.getY() - p1.getY(), 2));
    }
    public static Double distansToStart (Point p1){
        return pow(p1.getX(), 2) + pow(p1.getY(), 2);
    }
    public static boolean oneLine(Point x1y1, Point x2y2, Point x3y3){
        try{if ((x3y3.getX() - x1y1.getX()) / (x2y2.getX() - x1y1.getX()) == (x3y3.getY() - x1y1.getY()) / (x2y2.getY() - x1y1.getY())){
            return true;
        }
        else{
            return false;
        }}catch (Exception e){
            System.out.println("by zero");
        }
        return false;
    }
}
