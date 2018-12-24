import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class PointTest {

    @Test
    public void distnans() {
        Point point = new Point(3,1);
        Point point1 = new Point(4,5);
        Double dis = Point.distnans(point, point1);
        if (dis > 0){
            Assert.fail();
        }
    }

    @Test
    public void oneLine(){
        Point point = new Point(3,1);
        Point point1 = new Point(4,5);

        boolean oneLine = (boolean) Point.oneLine(point1, point, point);
        if (oneLine)
            Assert.assertTrue(oneLine);
        else
            System.out.println("failed");
    }

    @Test
    public void distansToStart(){

        Random random = new Random();

        for (int i = 0; i<10; i++){
            int x = ((int)Math.random() * 50) - 15;
            int y = ((int)Math.random() * 50) - 15;

        Point point = new Point(x,y);

        if (Point.distansToStart(point)>0) {
            Assert.assertTrue(true);
            System.out.println("Distans are positive ");
        } else {
            System.out.println("Wrong");
            Assert.assertFalse(false);
            }
        }
    }
}